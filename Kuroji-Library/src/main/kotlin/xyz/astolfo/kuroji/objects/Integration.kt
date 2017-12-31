package xyz.astolfo.kuroji.objects

import java.time.OffsetDateTime

interface Integration : Identifiable {
    val name: String
    val type: String
    val enabled: Boolean
    val syncing: Boolean
    val roleId: Long
    val expireBehavior: Int
    val expireGracePeriod: Int
    val user: User

    interface Account {
        val id: String
        val name: String
    }

    val account: Account
    val syncedAt: OffsetDateTime
}