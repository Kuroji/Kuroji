package xyz.astolfo.kuroji.objects

import java.time.OffsetDateTime

interface Channel : DiscordEntity, Identifiable {
    val type: Int
}

interface TextChannel : Channel

interface GuildChannel : Channel, Positionable, Nameable, Mentionable {
    val guildId: Long
    val permissionOverwrites: Iterable<Overwrite>
    val topic: String?
    val nsfw: Boolean
    val lastMessageId: Long?
    val parentId: Long?
}

interface GuildTextChannel : GuildChannel, TextChannel {
    val lastPinTimestamp: OffsetDateTime
}

interface GuildVoiceChannel : GuildChannel {
    val bitrate: Int
    val userLimit: Int

    fun join()
}

interface GuildCategoryChannel : GuildChannel

interface PrivateChannel : Channel, TextChannel {
    val recipients: Iterable<User>
    val ownerId: Long
    val applicationId: Long
}

interface PrivateGroupChannel : PrivateChannel {
    val icon: String
}