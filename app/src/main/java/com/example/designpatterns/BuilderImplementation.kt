/*
Builder Design Pattern

 Builder is a creational design pattern
 that lets you construct complex objects
 step by step. The pattern allows you to
 produce different types and representations
 of an object using the same construction code.
 */

package com.example.designpatterns

class BuilderImplementation private constructor(
    val actOne : Boolean,
    val actTwo : Boolean,
    val actThree: Boolean
) {
    class   Builder{
        private var actOne : Boolean = true
        private var actTwo : Boolean = true
        private var actThree : Boolean = false

        fun actionOne(value : Boolean) = apply{actOne = value}
        fun actionTwo(value : Boolean) = apply{actTwo = value}
        fun actionThree(value : Boolean) = apply{actThree = value}

        fun build() = BuilderImplementation(actOne,actTwo,actThree)
    }
}