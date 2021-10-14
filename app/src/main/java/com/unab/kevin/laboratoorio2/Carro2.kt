package com.unab.kevin.laboratoorio2

class Carro2(marca:String,precio:Int, val numPuertas:Int):Carro1(marca,precio),Persona
{

    override fun disponibilidad()
    {

        println("Este auto no esta a la venta")

    }

    override val visualizar = "Dueño"
    override fun mirar()
    {

        println("Este carro esta viendo el $visualizar")
    }

}