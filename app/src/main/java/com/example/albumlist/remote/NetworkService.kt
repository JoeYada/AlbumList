package com.example.albumlist.remote

import com.example.albumlist.common.RELATIVE_URL
import com.example.albumlist.data.model.ApiResponse
import io.reactivex.Single
import retrofit2.http.GET

interface NetworkService {
    @GET(RELATIVE_URL)
    fun getAlbum():Single<ApiResponse>
}