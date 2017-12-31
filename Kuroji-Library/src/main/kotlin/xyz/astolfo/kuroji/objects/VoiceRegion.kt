package xyz.astolfo.kuroji.objects

interface VoiceRegion : Identifiable, Nameable {
    val sampleHostname: String
    val samplePort: Int
    val vip: Boolean
    val optimal: Boolean
    val deprecated: Boolean
    val custom: Boolean
}