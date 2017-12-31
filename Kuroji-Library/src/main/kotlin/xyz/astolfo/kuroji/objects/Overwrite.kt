package xyz.astolfo.kuroji.objects

interface Overwrite : Identifiable {
    override val id: Long
    val type: String
    val allow: Long
    val deny: Long
}