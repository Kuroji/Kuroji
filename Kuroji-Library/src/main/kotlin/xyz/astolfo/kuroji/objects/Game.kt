package xyz.astolfo.kuroji.objects

interface Game {
    val name: String
    val type: Int
    val url: String
    val state: String
    val sessionId: String

    interface Party {
        val size: Iterable<Int>
        val id: String
    }

    val party: Party?
    val flags: Int
    val details: String

    interface Assets {
        val smallText: String
        val largeText: String
        val smallImage: Long
        val largeImage: Long
    }

    val assets: Assets?
    val applicationId: Long

    interface Timestamps {
        val start: Long
    }

    val timestamps: Timestamps?
}