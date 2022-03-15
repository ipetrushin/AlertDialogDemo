package com.example.alertdialogdemo

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.DialogFragment
import java.util.*

class MyDialog(val ctx: Context): DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        var choice = 0
        Log.d("mytag", "creating dialog")
        Log.d("mytag", Arrays.toString( ctx.resources.getStringArray(R.array.weather_types)))
        val langs = arrayOf("Java", "Kotin", "C++", "Python")
        return ctx.let { AlertDialog.Builder(it).
            setMessage("Test message").
            setSingleChoiceItems(ctx.resources.getStringArray(R.array.weather_types),
                1, {dialog, which -> choice = which}).
            setPositiveButton("Ok", MyListener()).
            create()
        }
        //return super.onCreateDialog(savedInstanceState)
    }
}