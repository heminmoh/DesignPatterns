package com.example.designpatterns

object SingletonImplementation {
        init
        {
            println("Singleton object invoked.")
        }


        var DataInAccess = "All Attributes accessible"



        fun add(firstNum:Int,secondNum:Int):Int
        {
            return firstNum.plus(secondNum)
        }



}