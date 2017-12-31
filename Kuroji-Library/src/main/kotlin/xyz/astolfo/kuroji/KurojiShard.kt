package xyz.astolfo.kuroji

import xyz.astolfo.kuroji.objects.Guild
import xyz.astolfo.kuroji.objects.User
import xyz.astolfo.kuroji.utlis.KurojiEntityMap

interface KurojiShard {

    val kuroji: Kuroji
    val id: Int

    val guilds: KurojiEntityMap<Guild>
    val users: KurojiEntityMap<User>

}