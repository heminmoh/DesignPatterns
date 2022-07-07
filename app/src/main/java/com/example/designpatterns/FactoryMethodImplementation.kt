
/*
Factory Design Pattern

What is factory method in design pattern?
The factory method is a creational design
 pattern, i.e., related to object creation.
  In the Factory pattern, we create objects
  without exposing the creation logic to the
  client and the client uses the same common
  interface to create a new type of object.

 */
package com.example.designpatterns



interface ICurrency {
    fun symbol(): String
    fun code(): String
}

class Euro : ICurrency {
    override fun symbol(): String {
        return "€"
    }
    override fun code(): String {
        return "EUR"
    }
}

class UnitedStatesDollar : ICurrency {
    override fun symbol(): String {
        return "$"
    }
    override fun code(): String {
        return "USD"
    }
}

enum class Country {
    UnitedStates, Spain, UK, Greece
}

fun currency(country: Country): ICurrency? {
    return when (country) {
        Country.Spain, Country.Greece -> Euro()
        Country.UnitedStates -> UnitedStatesDollar()
        else -> null
    }
}