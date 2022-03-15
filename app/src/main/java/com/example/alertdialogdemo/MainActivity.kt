package com.example.alertdialogdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyDialog(this).show(supportFragmentManager, "test")
        //DialogFragment().show(supportFragmentManager, "test")
    }
}