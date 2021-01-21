package com.example.testandroid.menu.VH

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.chg.adapter.EventTransmissionListener
import com.chg.adapter.ViewHolder
import com.example.testandroid.R
import com.example.testandroid.menu.model.MyMenu

class MenuViewHolder(
    itemView: View,
    eventTransmissionListener: EventTransmissionListener?,
    parent: ViewGroup?
) : ViewHolder<MyMenu>(itemView, eventTransmissionListener, parent) {

    private lateinit var title:TextView
    override fun onCreated() {
        title = findViewById(R.id.title)

    }

    override fun onBindViewHolder(model: MyMenu?) {
        super.onBindViewHolder(model)
        title.text = model?.title
    }

}