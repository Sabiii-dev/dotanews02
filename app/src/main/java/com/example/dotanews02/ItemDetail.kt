package com.example.dotanews02

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ItemDetail : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_item_detail)



//        val img = intent.getIntExtra("img",0)
//        val detailTitle = intent.getStringExtra("detailTitle")
//        val detailDesc = intent.getStringExtra("detailDesc")

        val getImg = intent.getIntExtra("img",0)
        val getDetailTitle = intent.getStringExtra("detailTitle")
        val getDetailDesc = intent.getStringExtra("detailDesc")

//
        findViewById<ImageView>(R.id.detailImage).setImageResource(getImg)
        findViewById<TextView>(R.id.detailTitle).text = getDetailTitle
        findViewById<TextView>(R.id.detailDesc).text = getDetailDesc



    }


}
