package xyz.astolfo.kuroji.objects

interface Webhook : KurojiShardEntity, Identifiable, Nameable {
    val guildId: Long?
    val channelId: Long
    val user: User?
    val avatar: String?
    val token: String
}