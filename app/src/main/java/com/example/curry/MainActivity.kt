package com.example.curry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val animals = arrayOf("かえる","ねこ","たこ","うさぎ")
    val food = arrayOf("やご","ちゅ〜る","さかな","にんじん")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun serveFood(view: View){
        val index:Int= Random.nextInt(4)
        val animal = animals[index]
        nameTextView.text = animal+"に"
        foodTextView.text = food[Random.nextInt(4)]+"を"

        if (Random.nextInt(100)<50){
            verbTextView.text="よそえました"
        }else{
            verbTextView.text="よそえませんでした"
        }
    }
}