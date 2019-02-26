package com.example.albumlist.data.repo

import com.example.albumlist.data.model.ApiResponse
import io.reactivex.Single

interface Repository {
    fun displayAlbum():Single<ApiResponse>
}