package com.example.myapplication.data

import com.example.myapplication.data.tv.TvShows
import com.google.gson.annotations.SerializedName

class GetTvResponse (
    @SerializedName("page") val page: Int,
    @SerializedName("results") val tv: List<TvShows>,
    @SerializedName("total_pages") val pages: Int
)