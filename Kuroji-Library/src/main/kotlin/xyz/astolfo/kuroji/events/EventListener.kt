package xyz.astolfo.kuroji.events

import kotlin.reflect.KCallable
import kotlin.reflect.KClass
import kotlin.reflect.full.isSuperclassOf
import kotlin.reflect.jvm.jvmName

interface EventListener

interface EventHandler {

    fun onEvent(event: Event)

}

class AnnotatedEventListener(private val eventClass: EventListener) : EventHandler {

    private val eventListeners = HashMap<KClass<out Event>, MutableList<KCallable<*>>>()

    init {
        val clazz = eventClass::class
        clazz.members.forEach { member ->
            val events = member.annotations.mapNotNull { (it as? KurojiEvent)?.events }
                    .fold(mutableListOf<KClass<out Event>>(), { a, b ->
                        a.addAll(b)
                        a
                    })
            if (events.isEmpty()) return@forEach
            val params = member.typeParameters
            if (params.isNotEmpty()) {
                // check if parameter is allowed
                if (params.size > 1)
                    throw IllegalArgumentException("The method " + member.name + " in " + clazz.jvmName + " has too many parameters!")
                val baseType = (params[0] as? KClass<*>?) ?:
                        throw IllegalArgumentException("The method " + member.name + " in " + clazz.jvmName + " must have a event class as parameter!")
                events.forEach { event ->
                    if (event != baseType || event.isSuperclassOf(baseType))
                        throw IllegalArgumentException("The method " + member.name + " in " + clazz.jvmName + " must have a parameter that either is or extends the registered event!")
                }
            }
            events.forEach { event ->
                println("Registering event $event with member $member")
                val methods = eventListeners.getOrPut(event, { mutableListOf() })
                methods.add(member)
                eventListeners.put(event, methods)
            }
        }
    }

    override fun onEvent(event: Event) {
        println("calling event " + event)
        val clazz = event::class
        eventListeners.keys.filter { it == clazz || it.isSuperclassOf(clazz) }
                .forEach {
                    eventListeners[it]?.forEach { member ->
                        println("calling member " + member)
                        if (member.typeParameters.isEmpty()) member.call(eventClass)
                        else member.call(eventClass, event)
                    }
                }
    }

}