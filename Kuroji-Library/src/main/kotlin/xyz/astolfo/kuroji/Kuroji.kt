package xyz.astolfo.kuroji

import xyz.astolfo.kuroji.events.EventListener
import xyz.astolfo.kuroji.events.EventManager

interface Kuroji {

    val shards: Iterable<KurojiShard>
    val eventManager: EventManager

    fun registerEvent(eventListener: EventListener) {
        eventManager.register(eventListener)
    }

    fun unregisterEvent(eventListener: EventListener) {
        eventManager.unregister(eventListener)
    }

    fun start()

    fun restart()

    fun stop()

}