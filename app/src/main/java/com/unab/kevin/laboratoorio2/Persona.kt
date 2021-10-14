package com.unab.kevin.laboratoorio2

interface Persona{

    val visualizar:String
    fun mirar()
    fun mirando(){
        println("Estoy mirando el $visualizar ")
    }

}