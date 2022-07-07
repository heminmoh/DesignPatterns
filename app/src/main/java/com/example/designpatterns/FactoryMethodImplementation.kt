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