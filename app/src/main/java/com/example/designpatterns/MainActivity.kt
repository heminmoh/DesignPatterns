package com.example.designpatterns

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnSingleton : Button
    private lateinit var btnBuilder : Button
    private lateinit var btnFactory : Button
    private lateinit var btnPrototype : Button
    private lateinit var btnFacade : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSingleton = findViewById(R.id.singleton)
        btnBuilder = findViewById(R.id.builder)
        btnFactory = findViewById(R.id.factory)
        btnPrototype = findViewById(R.id.prototype)
        btnFacade = findViewById(R.id.facade)


        //Singleton Design Pattern Implementation
        btnSingleton.setOnClickListener {
            println(SingletonImplementation.DataInAccess)
            //  SingletonImplementation.buildService(APIInterface::class.java)
            SingletonImplementation.operation(50, 17)
            println("All Operations Done! ")
//    println("All Operations:  ${SingletonImplementation.operation(8,7)}")
        }

        btnBuilder.setOnClickListener {

            val builder = BuilderImplementation.Builder()
                .actionOne(true)
                .actionTwo(false)
                .actionThree(true)
                .build()
            println(builder.actTwo.toString())
        }

        btnFactory.setOnClickListener{
            val noCurrencyCode = "I am not Creative, so Currency Code Available"

            println(currency(Country.Greece)?.code() ?: noCurrencyCode)
            println(currency(Country.Spain)?.code() ?: noCurrencyCode)
            println(currency(Country.UnitedStates)?.code() ?: noCurrencyCode)
            println(currency(Country.UK)?.code() ?: noCurrencyCode)
        }


        btnPrototype.setOnClickListener{
            val bike = Bike()
            val basicBike = bike.clone()
            val advancedBike = makeJaguar(basicBike)
            println("Prototype Design Pattern: " + advancedBike.model!!)
        }
        btnFacade.setOnClickListener{
            val computer = Computer()
            computer.start()
        }
    }
}