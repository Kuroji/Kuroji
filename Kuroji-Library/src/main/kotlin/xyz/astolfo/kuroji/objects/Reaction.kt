package xyz.astolfo.kuroji.objects

interface Reaction {
    val count: Int
    val me: Boolean
    val emoji: Emoji
}