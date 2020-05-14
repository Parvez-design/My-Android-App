package com.example.myfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("On Create Method")
    }

    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editText2)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        println("On Start Method")
    }

    override fun onResume() {
        super.onResume()
        println("On Resume method")
    }

    override fun onPause() {
        super.onPause()
        println("On Pause method")
    }

    override fun onStop() {
        super.onStop()
        println("On Stop method")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("On Destroy method")
    }

    override fun onRestart() {
        super.onRestart()
        println("On Restart method")
    }
}

