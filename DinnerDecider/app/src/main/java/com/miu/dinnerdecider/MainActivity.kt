package com.miu.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val foodList = arrayListOf("Hamburger", "Pizza",
        "Mexican", "American", "Chinese")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener{
            var random = Random()
            var randomFood = random.nextInt(foodList.count())
            selectedFoodText.text = foodList[randomFood]
        }
        addFoodButton.setOnClickListener {
            var foodTxt = addNewFoodTxt.text.toString()
            foodList.add(foodTxt)
            addNewFoodTxt.text.clear()
        }
    }

}