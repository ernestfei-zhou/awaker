package com.ruzhan.day.model

data class DayNewModel(
        var guid: Int = 0,
        var type: Int = 0,
        var cat: String = "",
        var title: String = "",
        var cover_thumb: String = "",
        var cover_landscape: String = "",
        var cover_landscape_hd: String = "",
        var pubdate: String = "",
        var archive_timestamp: Long = 0,
        var pubdate_timestamp: Long = 0,
        var lastupdate_timestamp: Long = 0,
        var author: String? = null,
        var source: String? = null,
        var ui_sets: UiSetsModel? = null,
        var link_share: String? = null,
        var link_wechat: String? = null,
        var title_wechat_tml: String = "",
        var website_title: String? = null,
        var website_title_landscape: String? = null,
        var has_caption: Int = 0,
        var has_news: Int = 0,
        var has_hotspots: Int = 0,
        var latitude: Double = 0.toDouble(),
        var longitude: Double = 0.toDouble(),
        var geo_span: Double = 0.toDouble(),
        var location: String = "",
        var summary: String? = null,
        var content: String = "",
        var ei_sets: EiSetsModel? = null,
        var news_count: Int = 0,
        var cloud_guid: Int = 0,
        var has_photo: Int = 0,
        var album_count: Int = 0,
        var cover_sq: String? = null,
        var cover_sq_hd: String? = null,
        var coordinate_sets: List<Any>? = null,
        var entry_imgs: List<Any>? = null,
        var tags: List<TagsModel>? = null,
        var album: List<DayNewModel>? = null
)
