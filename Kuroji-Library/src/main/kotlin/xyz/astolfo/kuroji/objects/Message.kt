package xyz.astolfo.kuroji.objects

import java.time.OffsetDateTime

interface Message : KurojiShardEntity, Identifiable {
    val channelId: Long
    val author: User
    val content: String
    val timestamp: OffsetDateTime
    val editedTimestamp: OffsetDateTime?
    val tts: Boolean
    val mentionsEveryone: Boolean
    val mentions: Iterable<User>
    val mentionRoles: Iterable<Long>

    val attachments: Iterable<Attachment>
    val embeds: Iterable<Embed>
    val reactions: Iterable<Reaction>
    val nonce: Long
    val pinned: Boolean
    val webhookId: String?
    val type: Int
}