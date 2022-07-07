/*
Prototype Design Patten


When creating an object is time-consuming and
a costly affair and you already have a most
similar object instance in hand, then you go for
prototype pattern. Instead of going through a
time-consuming process to create a complex object,
 just copy the existing similar object and modify
 it according to your needs.

 */

package com.example.designpatterns

open class Bike : Cloneable {
    private var gears: Int = 0
    private var bikeType: String? = null
    var model: String? = null
        private set

    init {
        bikeType = "Standard"
        model = "Leopard"
        gears = 4
    }

    public override fun clone(): Bike {
        return Bike()
    }

    fun makeAdvanced() {
        bikeType = "Advanced"
        model = "Jaguar"
        gears = 6
    }
}

fun makeJaguar(basicBike: Bike): Bike {
    basicBike.makeAdvanced()
    return basicBike
}