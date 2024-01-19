package com.example.placepics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

 class MainActivity : AppCompatActivity() {
    private var imgArray = arrayOf(R.drawable.mumbai,
        R.drawable.ajanta,
        R.drawable.lonavala,
        R.drawable.mahabaleshwar,
        R.drawable.shirdi)
    private val txtArray = arrayOf(R.string.Mumbi_description,
        R.string.Ajanta_description,
        R.string.Lonavla_description,
        R.string.Mahabaleshwar_description,
        R.string.Shidri_description)
    private var curr = 0
    private lateinit var imgVV : ImageView
    private lateinit var plsName : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imgVV = findViewById(R.id.placeImg)
        plsName = findViewById(R.id.placeName)

        }

    fun prevImg(view: View) {
        if (curr == 0) {
            curr = 4
            imgVV.setImageResource(imgArray[curr])
            plsName.setText(txtArray[curr])
        } else {
            curr -= 1
            imgVV.setImageResource(imgArray[curr])
            plsName.setText(txtArray[curr])
        }
    }
        fun nxtImg(view: View){
            if (curr == 4){
                curr = 0
                imgVV.setImageResource(imgArray[curr])
                plsName.setText(txtArray[curr])
            }
            else{
                curr += 1
                imgVV.setImageResource(imgArray[curr])
                plsName.setText(txtArray[curr])
            }
    }


}


