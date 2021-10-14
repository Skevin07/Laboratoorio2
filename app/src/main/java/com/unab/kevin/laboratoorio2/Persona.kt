package com.unab.kevin.laboratoorio2

interface Persona{

    val visualizar:String
    fun mirar()
    fun mirando(){
        println("El carro esta mirando a su futuro $visualizar ")
    }

}