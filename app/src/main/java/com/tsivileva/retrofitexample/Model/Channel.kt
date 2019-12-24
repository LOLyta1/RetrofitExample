package com.tsivileva.retrofitexample.Model

import android.content.ClipData.Item



class Channel {
    private var image: Image? = null

    private var item: Array<Item>? = null

    private var lastBuildDate: String? = null

    private var link: String? = null

    private var description: String? = null

    private var title: String? = null

    fun getImage(): Image? {
        return image
    }

    fun setImage(image: Image) {
        this.image = image
    }

    fun getItem(): Array<Item>? {
        return item
    }

    fun setItem(item: Array<Item>) {
        this.item = item
    }

    fun getLastBuildDate(): String? {
        return lastBuildDate
    }

    fun setLastBuildDate(lastBuildDate: String) {
        this.lastBuildDate = lastBuildDate
    }

    fun getLink(): String? {
        return link
    }

    fun setLink(link: String) {
        this.link = link
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

    override fun toString(): String {
        return "ClassPojo [image = $image, item = $item, lastBuildDate = $lastBuildDate, link = $link, description = $description, title = $title]"
    }
}