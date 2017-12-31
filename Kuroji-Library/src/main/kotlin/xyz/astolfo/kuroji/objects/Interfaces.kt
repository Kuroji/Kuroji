package xyz.astolfo.kuroji.objects

interface DiscordEntity

interface Nameable {
    var name: String
}

interface Mentionable {
    val mentionString: String
}

interface Positionable {
    var position: Int
}

interface Identifiable {
    val id: Long
}