package xyz.astolfo.kuroji.objects

interface User : Nameable, Mentionable, KurojiShardEntity {

    val discriminator: String
    val avatar: String
    val bot: Boolean
    val mfaEnabled: Boolean?
    //TODO This needs to be changed in the protofile to allow for this beeing missing instead of false
    val verified: Boolean?
    val email: String?
}
