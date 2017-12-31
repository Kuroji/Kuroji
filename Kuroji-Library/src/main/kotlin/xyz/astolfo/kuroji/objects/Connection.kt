package xyz.astolfo.kuroji.objects

interface Connection {
    val id: String
    val name: String
    val type: String
    val revoked: Boolean
    val integrations: Iterable<Integration>
}