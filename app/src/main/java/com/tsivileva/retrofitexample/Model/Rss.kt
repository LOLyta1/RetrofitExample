package com.tsivileva.retrofitexample.Model

class Rss {

    private var channel: Channel? = null

    private var version: String? = null

    fun getChannel(): Channel? {
        return channel
    }

    fun setChannel(channel: Channel) {
        this.channel = channel
    }

    fun getVersion(): String? {
        return version
    }

    fun setVersion(version: String) {
        this.version = version
    }

    override fun toString(): String {
        return "ClassPojo [channel = $channel, version = $version]"
    }
}