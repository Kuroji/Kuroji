package xyz.astolfo.kuroji.objects

import xyz.astolfo.kuroji.Kuroji
import xyz.astolfo.kuroji.KurojiShard

interface KurojiShardEntity : KurojiEntity {
    val kurojiShard: KurojiShard
    override val kuroji
        get() = kurojiShard.kuroji
}

interface KurojiEntity {
    val kuroji: Kuroji
}

interface Nameable {
    var name: String
}

interface Mentionable {
    val mentionString: String
}

interface Positionable {
    var position: Int
}

interface Identifiable {
    val id: Long
}

interface ChannelHolder {
    val channels: Iterable<Channel>
        get() {
            val list = mutableListOf<Channel>()
            list.addAll(textChannels)
            list.addAll(voiceChannels)
            return list
        }
    val textChannels: Iterable<GuildTextChannel>
    val categories: Iterable<GuildCategoryChannel>
    val voiceChannels: Iterable<GuildVoiceChannel>
}