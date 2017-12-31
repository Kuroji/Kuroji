package xyz.astolfo.kuroji.objects

interface PresenceUpdate {
    val user: User
    val roles: Iterable<Long>
    val game: Game?
    val guildId: Long
    val status: String
}