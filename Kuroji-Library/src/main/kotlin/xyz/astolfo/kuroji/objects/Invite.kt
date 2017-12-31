package xyz.astolfo.kuroji.objects

//TODO Invite Metadata Object stuff...
interface Invite : DiscordEntity {
    val code: String
    val guild: Guild
    val channel: Channel
}

