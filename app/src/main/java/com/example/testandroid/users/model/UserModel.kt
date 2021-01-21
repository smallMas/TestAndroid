package com.example.testandroid.users.model

import com.chg.adapter.Model
import com.example.testandroid.R
import com.example.testandroid.users.VH.UserHolder

class UserModel(var name : String, var age:Int?) : Model {
//    var desc : String?
//        get() = desc
//        set(value) {
//            desc = value
//        }
//    var hobby : String?
//        get() = hobby
//        set(value) {
//            hobby = value
//        }

    override fun getHolderClass(position: Int): Class<*> {
        return UserHolder::class.java
    }

    override fun getResource(position: Int): Int {
        return R.layout.holder_user
    }

    override fun toString(): String {
        return "UserModel(name='$name', age=$age)"
    }

}