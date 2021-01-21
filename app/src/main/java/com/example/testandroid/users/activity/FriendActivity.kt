package com.example.testandroid.users.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.chg.adapter.extension.models
import com.chg.adapter.extension.notifyDataSetChanged
import com.chg.adapter.extension.notifyItemChanged
import com.example.testandroid.R
import com.example.testandroid.users.model.UserModel

class FriendActivity : AppCompatActivity() {
    var dataArray = mutableListOf<UserModel>(UserModel("fansj",18))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friend)
        Log.i("fansj", dataArray.toString())

        var recyclerView = findViewById<RecyclerView>(R.id.userList)
        recyclerView.models = dataArray
        recyclerView.notifyDataSetChanged()
    }
}