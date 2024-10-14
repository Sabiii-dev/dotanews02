package com.example.dotanews02

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var dataList : ArrayList<ModelClass>
    lateinit var adapter : ItemAdapter


//    lateinit var detailImageList : ArrayList<Int>
//    lateinit var detailTitleList : ArrayList<String>
//    lateinit var detailDescList : ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        dataList = ArrayList()

        dataList.add(ModelClass(R.drawable.img1,
            "SEPTEMBER 20, 2024",
            "The International Grand Champion",
            //"Patch Notes",
            R.drawable.img1,
            getString(R.string.title1),
            getString(R.string.det1),
        )
        )
        dataList.add(ModelClass(R.drawable.img2,
            "September 12, 2024",
            "The International Is Here ",
            //"Patch Notes",
            R.drawable.img2,
            getString(R.string.title2),
            getString(R.string.det2)
        )
        )
        dataList.add(
            ModelClass(
                R.drawable.img3,
                "SEPTEMBER 3, 2024",
                "The International",
                //"Free fire kicks off its 7th Anniversary Celebrations",
                R.drawable.img3,
                getString(R.string.title3),
                getString(R.string.det3)
            )
        )
        dataList.add(ModelClass(R.drawable.img4,
            "AUG 29, 2024",
            "In Game Advertisement",
            //"Patch Notes",
            R.drawable.img4,
            getString(R.string.title4),
            getString(R.string.det4)
        )
        )
        dataList.add(ModelClass(R.drawable.img5,
            "AUGUST 22, 2024",
            "Introducing The Ring Master",
            //"Patch Notes",
            R.drawable.img5,
            getString(R.string.title5),
            getString(R.string.det5)
            )
        )
        dataList.add(ModelClass(R.drawable.img6,
            "JULY 29, 2024",
            "Update 7.73 Is Here",
            //"Patch Notes",
            R.drawable.img6,
            getString(R.string.title6),
            getString(R.string.det6)
            )
        )
//        dataList.add(ModelClass(R.drawable.img7,
//            "28/10/2023",
//            "DEVBLOG",
//            //"BR Economy Adjustments",
//            R.drawable.img7,
//            getString(R.string.title7),
//            getString(R.string.det7)
//            )
//        )
//        dataList.add(
//            ModelClass(
//                R.drawable.img8,
//                "25/09/2023",
//                "COLLABORATION",
//                //"Free Fire Joins Forces With Demon Slayer: Kimetsu no Yaiba for a special collaboration this booyah day",
//                R.drawable.img8,
//                getString(R.string.title8),
//                getString(R.string.det8)
//            )
//        )
//        dataList.add(
//            ModelClass(
//                R.drawable.img9,
//                "18/08/2023",
//                "ANNOUNCEMENT",
//                //"Rampage returns for its fifth and final edition.Rampage: Finale",
//                R.drawable.img9,
//                getString(R.string.title9),
//                getString(R.string.det9)
//            )
//        )
//        dataList.add(
//            ModelClass(
//                R.drawable.img10,
//                "08/08/2023",
//                "PATCH NOTE",
//                //"Patch Notes",
//                R.drawable.img10,
//                getString(R.string.title10),
//                getString(R.string.det10)
//                )
//        )
//        dataList.add(
//            ModelClass(
//                R.drawable.img11,
//                "01/08/2023",
//                "DEVBLOG",
//               // "[DEVBLOG] Map Adjustments: How and Why?",
//                R.drawable.img11,
//                getString(R.string.title11),
//                getString(R.string.det11)
//            )
//        )
//        dataList.add(
//            ModelClass(
//                R.drawable.img12,
//                "07/07/2023",
//                "ANNOUNCEMENTS",
//                //"Free fire 6th anniversary: Celebrations Begins!",
//                R.drawable.img12,
//                getString(R.string.title12),
//                getString(R.string.det12)
//            )
//        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = ItemAdapter(dataList, this)
        recyclerView.adapter = adapter


        adapter.onItemClick = {
            val intent = Intent(this, ItemDetail::class.java)
            intent.putExtra("img", it.detailImage)
            intent.putExtra("detailTitle", it.detailTitle)
            intent.putExtra("detailDesc", it.detailDesc)
            startActivity(intent)
        }


    }
}