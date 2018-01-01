package xyz.astolfo.kuroji.events

import xyz.astolfo.kuroji.objects.KurojiShardEntity
import kotlin.reflect.KClass

interface ShardEvent : Event, KurojiShardEntity

interface Event

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class KurojiEvent(vararg val events: KClass<out Event>)