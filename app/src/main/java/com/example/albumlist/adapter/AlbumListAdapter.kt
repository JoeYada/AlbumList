package com.example.albumlist.adapter

import android.content.Context
import android.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.albumlist.R
import com.example.albumlist.data.model.ApiResponse

class AlbumListAdapter(val albumList:List<ApiResponse>):RecyclerView.Adapter<AlbumListAdapter.ViewHolder>() {
    private lateinit var context: Context
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        context = viewGroup.context
        val view = LayoutInflater.from(context).inflate(
            R.layout.recycler_view_album, viewGroup, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = albumList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val temp = albumList[position]
            holder.apply {
                mTitle.text = temp.title
                mID.text = temp.id.toString()
                mUserID.text = temp.userID.toString()
        }
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val mTitle: TextView = view.findViewById(R.id.tvTitle)
        val mID: TextView = view.findViewById(R.id.tvID)
        val mUserID: TextView = view.findViewById(R.id.tvUserID)
    }
}
