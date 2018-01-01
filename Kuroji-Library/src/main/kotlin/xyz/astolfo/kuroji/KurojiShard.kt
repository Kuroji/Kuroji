package xyz.astolfo.kuroji

import xyz.astolfo.kuroji.objects.Guild
import xyz.astolfo.kuroji.objects.KurojiShardEntity
import xyz.astolfo.kuroji.objects.Role
import xyz.astolfo.kuroji.objects.User
import xyz.astolfo.kuroji.utlis.KurojiEntityMap

interface KurojiShard {

    val kuroji: Kuroji
    val shardInfo: ShardInfo

    val guilds: KurojiEntityMap<Guild>
    val users: KurojiEntityMap<User>
    val roles: KurojiEntityMap<Role>

    interface ShardInfo : KurojiShardEntity {
        val id: Int
        val total: Int
    }

}