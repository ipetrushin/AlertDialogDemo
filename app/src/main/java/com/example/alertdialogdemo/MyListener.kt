package com.example.alertdialogdemo

import android.content.DialogInterface
import android.util.Log

class MyListener: DialogInterface.OnClickListener {
    override fun onClick(dialog: DialogInterface?, choice: Int) {
        Log.d("mytag", "Dialog click ${choice}")
    }
}