package xyz.astolfo.kuroji.objects

import java.time.OffsetDateTime

interface Channel : KurojiShardEntity, Identifiable {
    val type: ChannelType
}

interface TextChannel : Channel

interface GuildChannel : Channel, Positionable, Nameable, Mentionable {
    val guildId: Long
    val permissionOverwrites: Iterable<Overwrite>
    val parentId: Long?
}

interface GuildTextChannel : GuildChannel, TextChannel {
    val topic: String?
    val lastMessageId: Long?
    val nsfw: Boolean
    val lastPinTimestamp: OffsetDateTime
}

interface GuildVoiceChannel : GuildChannel {
    val bitrate: Int
    val userLimit: Int
}

interface GuildCategoryChannel : GuildChannel, ChannelHolder

interface PrivateChannel : Channel, TextChannel {
    val recipients: Iterable<User>
    val ownerId: Long
    val applicationId: Long
}

interface PrivateGroupChannel : PrivateChannel {
    val icon: String
}

enum class ChannelType(val id: Int = -1,
                       val guildChannel: Boolean = false) {
    TEXT(0, true),
    PRIVATE(1),
    VOICE(2, true),
    GROUP(3),
    CATEGORY(4, true),
    UNKNOWN();

    companion object {
        fun fromId(id: Int): ChannelType {
            return values().firstOrNull { it.id == id } ?: UNKNOWN
        }
    }
}