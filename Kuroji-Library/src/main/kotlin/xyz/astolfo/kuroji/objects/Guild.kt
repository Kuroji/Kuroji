package xyz.astolfo.kuroji.objects

import java.time.OffsetDateTime

//TODO probably should crate a own class for unavailable guilds and first join / ready events?
interface Guild : Identifiable, Nameable, ChannelHolder, KurojiShardEntity {
    val icon: String
    val splash: String
    val owner: Boolean
    val ownerId: Long
    /**
     * The permissions the user has on the guild without channel overrides
     */
    val permissions: Long?
    val region: String
    val afkChannelId: Long
    val afkTimeout: Int
    val embedEnabled: Boolean
    val embedChannelId: Long
    val verificationLevel: Int
    val defaultMessageNotifications: Int
    val explicitContentFilter: Int
    val roles: Iterable<Role>
    val emojis: Iterable<Emoji>
    val features: Iterable<String>
    val mfaLevel: Int
    val applicationId: Long?
    val widgetEnabled: Boolean
    val widgetChannelId: Long
    val systemChannelId: Long?
    val joinedAt: OffsetDateTime
    val large: Boolean?
    val unavailable: Boolean?
    val memberCount: Long
    val voiceStates: Iterable<VoiceState>

    interface Member : KurojiShardEntity {
        val user: User?
        val presence: Presence
        val nick: String?
        val roles: Iterable<Long>
        val joinedAt: OffsetDateTime
        val deaf: Boolean
        val mute: Boolean
    }

    val members: Iterable<Member>
}