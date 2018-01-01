package xyz.astolfo.kuroji.objects

//TODO Invite Metadata Object stuff...
interface Invite : KurojiShardEntity {
    val code: String
    val guild: Guild
    val channel: Channel
}

