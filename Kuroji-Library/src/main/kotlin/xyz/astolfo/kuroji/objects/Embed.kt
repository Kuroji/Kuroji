package xyz.astolfo.kuroji.objects

import java.time.OffsetDateTime

interface Embed {
    val title: String
    val type: String
    val description: String
    val url: String
    val timestamp: OffsetDateTime
    val color: Int

    interface Footer {
        val text: String
        val iconUrl: String
        val proxyIconUrl: String
    }

    val footer: Footer

    interface Image {
        val url: String
        val proxyUrl: String
        val height: Int
        val width: Int
    }

    val image: Image

    interface Thumbnail {
        val url: String
        val proxyUrl: String
        val height: Int
        val width: Int
    }

    val thumbnail: Thumbnail

    interface Video {
        val url: String
        val height: Int
        val width: Int
    }

    val video: Video

    interface Provider {
        val url: String
        val name: String
    }

    val provider: Provider

    interface Author {
        val url: String
        val name: String
        val iconUrl: String
        val proxyIconUrl: String
    }

    val author: Author

    interface Field {
        val name: String
        val value: String
        val inline: Boolean
    }

    val fields: Iterable<Field>
}