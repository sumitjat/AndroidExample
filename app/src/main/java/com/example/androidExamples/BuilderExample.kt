package com.example.androidExamples

import android.content.Context
import androidx.appcompat.app.AlertDialog

/*
    The Builder pattern simplifies the creation of objects, like slicing bread and stacking pickles,
    from its representation, a yummy sandwich. Thus, the same construction process can create objects of
    the same class with different properties.
*/


object BuilderExample {

    fun showAlertDialog(context: Context) {
        AlertDialog.Builder(context)
            .setTitle("Sandwich Dialog")
            .setMessage("Please use the spicy mustard.")
            .setNegativeButton("No thanks") { dialogInterface, i ->
                // "No thanks" action
            }
            .setPositiveButton("OK") { dialogInterface, i ->
                // "OK" action
            }
            .show()
    }
}