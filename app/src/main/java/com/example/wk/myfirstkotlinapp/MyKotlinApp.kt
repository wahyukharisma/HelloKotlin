package com.example.wk.myfirstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_my_kotlin_app.*
import java.util.*

class MyKotlinApp : AppCompatActivity() {

    val foodList= arrayListOf("Cowek","Soto Lamongan","Gunungan","Bowling","Little Tokyo","Ayam Rempah","Dirty Chick")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_kotlin_app)

        setOnDecideClicked()
        setOnAddClicked()

    }
    fun setOnDecideClicked(){
        btnDecide.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())

            textView.text = foodList[randomFood]

        }
    }

    fun setOnAddClicked(){
        addBtn.setOnClickListener {
            val getText = editText.text.toString()
            foodList.add(getText)
            Toast.makeText(this,"Place Add",Toast.LENGTH_SHORT).show()
            editText.text.clear()
        }
    }
}
