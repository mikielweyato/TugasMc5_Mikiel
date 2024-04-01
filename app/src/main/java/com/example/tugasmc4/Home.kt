package com.example.tugasmc4

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Home : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var  newArray: ArrayList<itemdata>
    private lateinit var newAdapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)

        newRecyclerView = findViewById(R.id.hasil)
        newArray = ArrayList()

        newArray.add(itemdata(R.drawable.gambar7,"jordan","Rp2.599.000"))
        newArray.add(itemdata(R.drawable.gambar1,"New Belance 550","Rp1.599.000"))
        newArray.add(itemdata(R.drawable.gambar3,"jordan","Rp2.599.000"))


        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)
        newAdapter = MyAdapter(newArray)
        newRecyclerView.adapter = newAdapter

    }
}