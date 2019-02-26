package com.example.albumlist.data.repo

import com.example.albumlist.data.model.ApiResponse
import com.example.albumlist.remote.RemoteHelper
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class RepositoryImpl():Repository {
    override fun displayAlbum(): Single<ApiResponse> {
        return RemoteHelper.getAlbum().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }
}