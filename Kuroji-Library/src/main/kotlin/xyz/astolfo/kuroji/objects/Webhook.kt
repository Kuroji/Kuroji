package xyz.astolfo.kuroji.objects

interface Webhook : DiscordEntity, Identifiable, Nameable {
    val guildId: Long?
    val channelId: Long
    val user: User?
    val avatar: String?
    val token: String
}