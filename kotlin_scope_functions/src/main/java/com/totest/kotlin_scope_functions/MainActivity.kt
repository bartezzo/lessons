package com.totest.kotlin_scope_functions

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    run()
  }

  fun run(){
    val s:String = with(StringBuilder("testString")) {
      println("value:$this 1")
      append(" appendSmth")
      println("value:$this 2")
      toString()
    }


    println("value:$s 3")
  }
}
