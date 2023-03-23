package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
//        val sum =  { a:Int -> print(a) }
    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollBtn = findViewById<Button>(R.id.roll_btn);
        diceImage = findViewById(R.id.dice_image)
        rollBtn.setOnClickListener {
            rollDice()
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        };
    }

    private fun rollDice() {
        val randomNum = Random.nextInt(6) + 1
        val renderedImageResourse = when(randomNum) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(renderedImageResourse)
    }
}