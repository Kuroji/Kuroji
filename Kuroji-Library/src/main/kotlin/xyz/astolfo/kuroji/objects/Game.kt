package xyz.astolfo.kuroji.objects

interface Game : KurojiShardEntity {
    val name: String
    val type: GameType
    val url: String
    val state: String?

    interface Party : KurojiShardEntity {
        val size: Int?
        val max: Int?
        val id: String?
    }

    val party: Party?
    val details: String?

    interface Assets : KurojiShardEntity {
        val key: String?
        val text: String?
        val url: String?
    }

    val largeAssets: Assets?
    val smallAssets: Assets?
    val applicationId: Long?

    interface Timestamps : KurojiShardEntity {
        val start: Long
        val end: Long
    }

    val timestamps: Timestamps?
}

enum class GameType constructor(val key: Int) {
    DEFAULT(0),
    STREAMING(1),
    LISTENING(2),
    WATCHING(3);

    companion object {
        fun fromKey(key: Int): GameType {
            return values().firstOrNull { it.key == key } ?: DEFAULT
        }
    }
}