package com.example.myapplication.Classes;

import android.os.Parcelable;

import java.io.Serializable;

public abstract class User implements Serializable{
    protected String name;
    protected String email;
    protected String password;
    protected int isAdmin;
    protected int isDisabled;
    authenticateUser au;

   /* public String getUsername(){
      //  return name;
    }*/
}
