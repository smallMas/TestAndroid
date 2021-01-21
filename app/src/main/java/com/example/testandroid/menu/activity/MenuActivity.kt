package com.example.testandroid.menu.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.chg.adapter.Adapter
import com.chg.adapter.Model
import com.chg.adapter.extension.getContext
import com.chg.adapter.extension.models
import com.chg.adapter.extension.setOnItemClickListener
import com.example.testandroid.R
import com.example.testandroid.menu.model.MyMenu
import com.example.testandroid.users.activity.FriendActivity

class MenuActivity : AppCompatActivity() {
    private var dataArray = mutableListOf<MyMenu>(
        MyMenu(
            "用户列表",
            "name1",
            FriendActivity::class.java
        )
     )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        setSupportActionBar(findViewById(R.id.toolbar))

//        val aa:MyMenu = intent.getSerializableExtra("aa") as MyMenu


        var table = findViewById<RecyclerView>(R.id.menuList)
        table.models = dataArray
        table.setOnItemClickListener(object :Adapter.OnItemClickListener{
            override fun onItemClick(
                parent: RecyclerView?,
                view: View?,
                position: Int?,
                model: Model?
            ) {
                var tmpModel : MyMenu = model as MyMenu
                var cls = tmpModel.activity
                if (null != cls) {
                    var intent = Intent(getContext(),cls)
                    startActivity(intent)
                }
            }

        })
    }

}