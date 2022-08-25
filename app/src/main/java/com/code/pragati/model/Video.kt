package com.code.pragati.model

import android.net.Uri
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Video(
    var uri: Uri? = null,
    var tags: Array<String>? = null,
    var ask: String = "",
    var ideaName: String = "",
) : Parcelable