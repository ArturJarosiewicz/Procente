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

        //action2 onclick
        binding.calculateBtn2.setOnClickListener {
            action2()
            resetNumbers()
        }

        binding.calculateBtn3.setOnClickListener {
            action3()
            resetNumbers()
        }

        binding.calculateBtn4.setOnClickListener {
            action4()
            resetNumbers()
        }

        binding.calculateBtn5.setOnClickListener {
            action5()
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

    private fun action2() {
        try {
            number1 = binding.Number3.text.toString().toFloat()
            number2 = binding.Number4.text.toString().toFloat()
        } catch (e: Exception) {
            Toast.makeText(this, "wpisz dane", Toast.LENGTH_SHORT).show()
        }

        actionResult = number1 / number2 * 100
        binding.resultTv2.text = actionResult.toString()
    }

    private fun action3() {
        try {
            number1 = binding.Number5.text.toString().toFloat()
            number2 = binding.Number6.text.toString().toFloat()
        } catch (e: Exception) {
            Toast.makeText(this, "wpisz dane", Toast.LENGTH_SHORT).show()
        }
        actionResult = (number2 - number1) / number1 * 100
        binding.resultTv3.text = actionResult.toString()

    }

    private fun action4() {
        try {
            number1 = binding.Number7.text.toString().toFloat()
            number2 = binding.Number8.text.toString().toFloat()
        } catch (e: Exception) {
            Toast.makeText(this, "wpisz dane", Toast.LENGTH_SHORT).show()
        }
        actionResult = number1 + (number2 / 100 * number1)
        binding.resultTv4.text = actionResult.toString()

    }

    private fun action5() {
        try {
            number1 = binding.Number9.text.toString().toFloat()
            number2 = binding.Number10.text.toString().toFloat()
        } catch (e: Exception) {
            Toast.makeText(this, "wpisz dane", Toast.LENGTH_SHORT).show()
        }
        actionResult = number1 - (number2 / 100 * number1)
        binding.resultTv5.text = actionResult.toString()

    }

}