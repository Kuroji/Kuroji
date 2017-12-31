package xyz.astolfo.kuroji.utlis

import xyz.astolfo.kuroji.objects.Identifiable
import xyz.astolfo.kuroji.objects.KurojiEntity

open class KurojiEntityMap<out E : KurojiEntity>(private val entityMap: Map<Long, E>) : Map<Long, E> by entityMap {

    operator fun get(id: Identifiable): E? {
        return get(id.id)
    }

}