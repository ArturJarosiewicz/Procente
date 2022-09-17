package com.example.procente

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.procente.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var number1: Float = 0.0f
    private var number2: Float = 0.0f
    private var actionResult: Float = 0.0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //action1 onClick
        binding.calculateBtn1.setOnClickListener {
            action1()
            resetNumbers()
        }
    }

    private fun resetNumbers(){
        number1= 0.0f
        number2= 0.0f
        actionResult= 0.0f
    }

    private fun action1() {
        try {
            number1 = binding.Number1.text.toString().toFloat()
            number2 = binding.Number2.text.toString().toFloat()
        } catch (e: Exception) {
            Toast.makeText(this, "wpisz dane", Toast.LENGTH_SHORT).show()
        }
        actionResult = number1 / 100 * number2
        binding.resultTv1.text = actionResult.toString()

    }
}