package xyz.astolfo.kuroji

import xyz.astolfo.kuroji.objects.Guild

interface KurojiShard {

    val id: Int

    val guilds: Iterable<Guild>

}