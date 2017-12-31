package xyz.astolfo.kuroji.objects

interface VoiceState {
    val guildId: Long?
    val channelId: Long
    val userId: Long
    val sessionId: String
    val deaf: Boolean
    val mute: Boolean
    val selfDeaf: Boolean
    val selfMute: Boolean
    val supress: Boolean
}