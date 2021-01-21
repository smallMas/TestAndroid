package com.example.testandroid.menu.model;

import android.app.Activity;

import com.chg.adapter.Model;
import com.example.testandroid.R;
import com.example.testandroid.menu.VH.MenuViewHolder;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

public class MyMenu implements Serializable, Model {
    private String title;
    private String name;
    private Class activity;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class getActivity() {
        return activity;
    }

    public void setActivity(Class activity) {
        this.activity = activity;
    }

    public MyMenu(String title, String name, Class activity) {
        this.title = title;
        this.name = name;
        this.activity = activity;
    }

    @NotNull
    @Override
    public Class<?> getHolderClass(int i) {
        return MenuViewHolder.class;
    }

    @Override
    public int getResource(int i) {
        return R.layout.menu_view_holder;
    }
}
