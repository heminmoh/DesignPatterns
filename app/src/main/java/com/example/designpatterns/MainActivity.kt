package com.example.designpatterns

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnSingleton : Button
    private lateinit var btnBuilder : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSingleton = findViewById(R.id.singleton)
        btnBuilder = findViewById(R.id.builder)


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


    }
}