package xyz.astolfo.kuroji.events

import xyz.astolfo.kuroji.objects.KurojiEntity

interface EventManager : KurojiEntity {

    val registeredListeners: Collection<EventHandler>

    fun register(eventListener: EventListener)

    fun unregister(eventListener: EventListener)

    fun handle(event: Event) {
        registeredListeners.forEach { it.onEvent(event) }
    }

}