package com.example.albumlist.data.model

import com.google.gson.annotations.SerializedName

data class ApiResponse(@SerializedName("userID")val userID:Int,
                  @SerializedName("id") val id: Int,
                  @SerializedName("title") val title:String)