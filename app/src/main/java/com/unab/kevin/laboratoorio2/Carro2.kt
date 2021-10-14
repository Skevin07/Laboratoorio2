package com.unab.kevin.laboratoorio2

class Carro2(marca:String,precio:Int, val numPuertas:Int):Carro1(marca,precio)
{

    override fun disponibilidad()
    {

        println("Este auto no esta a la venta")

    }

}