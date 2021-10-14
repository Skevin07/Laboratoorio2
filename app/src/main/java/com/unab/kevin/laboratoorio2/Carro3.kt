package com.unab.kevin.laboratoorio2

class Carro3(marca:String,precio:Int, val color:String):Carro1(marca,precio)
{

    override fun disponibilidad()
    {
      println("Este auto esta en mantenimiento")
    }

}