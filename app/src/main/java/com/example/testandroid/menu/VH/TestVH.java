package com.example.testandroid.menu.VH;

import android.view.View;
import android.view.ViewGroup;

import com.chg.adapter.EventTransmissionListener;
import com.chg.adapter.ViewHolder;
import com.example.testandroid.users.model.UserModel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TestVH extends ViewHolder<UserModel> {


    public TestVH(@NotNull View itemView, @Nullable EventTransmissionListener eventTransmissionListener, @Nullable ViewGroup parent) {
        super(itemView, eventTransmissionListener, parent);
    }

    @Override
    public void onCreated() {

    }
}
