package com.tsivileva.retrofitexample.Model

class Item {
    private var link: String? = null

    private var guid: String? = null

    private var description: String? = null

    private var title: String? = null

    private var pubDate: String? = null

    fun getLink(): String? {
        return link
    }

    fun setLink(link: String) {
        this.link = link
    }

    fun getGuid(): String? {
        return guid
    }

    fun setGuid(guid: String) {
        this.guid = guid
    }

    fun getDescription(): String? {
        return description
    }

    fun setDescription(description: String) {
        this.description = description
    }

    fun getTitle(): String? {
        return title
    }

    fun setTitle(title: String) {
        this.title = title
    }

    fun getPubDate(): String? {
        return pubDate
    }

    fun setPubDate(pubDate: String) {
        this.pubDate = pubDate
    }

    override fun toString(): String {
        return "ClassPojo [link = $link, guid = $guid, description = $description, title = $title, pubDate = $pubDate]"
    }

}