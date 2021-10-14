package com.unab.kevin.laboratoorio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        claseHerecia()



   }

    private fun claseHerecia()
    {

        val auto = Carro1("Toyota", 5000)
        auto.disponibilidad()

        val auto2 = Carro2("Nissan",9000,4)
        auto2.disponibilidad()

        val auto3 = Carro3("Audi",15000,"Dorado mate")
        auto3.disponibilidad()

    }




}