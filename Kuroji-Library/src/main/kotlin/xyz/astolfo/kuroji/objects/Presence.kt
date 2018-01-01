package xyz.astolfo.kuroji.objects

interface Presence : KurojiShardEntity {
    val user: User?
    val game: Game?
    val status: OnlineStatus
}

enum class OnlineStatus constructor(val key: String) {
    ONLINE("online"),
    IDLE("idle"),
    DO_NOT_DISTURB("dnd"),
    INVISIBLE("invisible"),
    OFFLINE("offline"),
    UNKNOWN("");


    companion object {
        fun fromKey(key: String): OnlineStatus {
            return values().firstOrNull { it.key.equals(key, ignoreCase = true) } ?: UNKNOWN
        }
    }
}