package com.example.testandroid.users.VH

import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.chg.adapter.EventTransmissionListener
import com.chg.adapter.ViewHolder
import com.example.testandroid.R
import com.example.testandroid.users.model.UserModel

class UserHolder(itemView: View,
                 eventTransmissionListener: EventTransmissionListener?,
                 parent: ViewGroup?) : ViewHolder<UserModel>(itemView,
                eventTransmissionListener,
                parent) {

    private lateinit var name: TextView
    private lateinit var age:TextView

    override fun onCreated() {
        name = findViewById(R.id.name)
        age = findViewById(R.id.age)
    }

    override fun onBindViewHolder(model: UserModel?) {
        super.onBindViewHolder(model)
        name.text = model?.name
        age.text = model?.age.toString() + "岁"
    }
}