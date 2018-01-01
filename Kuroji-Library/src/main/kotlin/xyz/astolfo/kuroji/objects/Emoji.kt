package xyz.astolfo.kuroji.objects

interface Emoji : KurojiShardEntity, Nameable, Identifiable {
    val roles: Iterable<Long>
    val user: User?
    val requireColons: Boolean
    val managed: Boolean
}