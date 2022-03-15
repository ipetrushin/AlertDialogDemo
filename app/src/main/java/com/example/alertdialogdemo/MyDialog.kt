package com.example.alertdialogdemo

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.DialogFragment

class MyDialog(val ctx: Context): DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        Log.d("mytag", "creating dialog")
        return ctx.let { AlertDialog.Builder(it).
            setMessage("Test message").
            setPositiveButton("Good", MyListener()).
            create()
        }
        //return super.onCreateDialog(savedInstanceState)
    }
}