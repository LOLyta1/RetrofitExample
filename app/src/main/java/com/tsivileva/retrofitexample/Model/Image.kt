package com.tsivileva.retrofitexample.Model

 class Image() {
    private var link: String? = null

    private var title: String? = null

    private var url: String? = null

    fun getLink(): String? {
        return link
    }

    fun setLink(link: String) {
        this.link = link
    }

    fun getTitle(): String? {
        return title
    }

    fun setTitle(title: String) {
        this.title = title
    }

    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String) {
        this.url = url
    }

    override fun toString(): String {
        return "ClassPojo [link = $link, title = $title, url = $url]"
    }
}