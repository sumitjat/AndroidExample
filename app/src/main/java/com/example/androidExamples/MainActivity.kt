package com.example.androidExamples

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hostingPacking = HostingPackageFactory.getHostingFrom(HostingPackageType.PREMIUM)

        Toast.makeText(this, hostingPacking.getServices().first(), Toast.LENGTH_SHORT).show()


        val printing = Printer()
        printing.startPrinting() // Printed Successfully.
        printing.startPrinting() // Printed Successfully.
        printing.startPrinting() // Printer doesn't have ink.
        printing.installInk() // Ink installed.
        printing.startPrinting() // Printed Successfully.

    }
}