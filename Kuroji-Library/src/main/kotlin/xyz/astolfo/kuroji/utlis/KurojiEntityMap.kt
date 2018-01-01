package xyz.astolfo.kuroji.utlis

import xyz.astolfo.kuroji.objects.Identifiable
import xyz.astolfo.kuroji.objects.KurojiShardEntity

open class KurojiEntityMap<out E : KurojiShardEntity>(private val entityMap: Map<Long, E>) : Map<Long, E> by entityMap {

    operator fun get(id: Identifiable): E? {
        return get(id.id)
    }

}