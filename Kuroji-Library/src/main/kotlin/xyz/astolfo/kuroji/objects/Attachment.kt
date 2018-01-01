package xyz.astolfo.kuroji.objects

interface Attachment : Identifiable, KurojiShardEntity {
    val filename: String
    val size: Int
    val url: String
    val proxyUrl: String
    val height: Int?
    val width: Int?
}