package com.example.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.recyclerview.adapter.Actors
import com.example.recyclerview.model.ActorAdapter

class MainActivity : AppCompatActivity() {

    private var lstActors = ArrayList<Actors>()
    private lateinit var recyclerView : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)

        loadActors()
        val adapter = ActorAdapter(lstActors, this@MainActivity)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerView.adapter = adapter

    }

    private fun loadActors()
    {
        lstActors.add(Actors(1, "Kiran Rana",
            "https://avatars3.githubusercontent.com/u/17020882?s=400&u=59482bbaa74bd232941350394cf3bb9f59c4abbd&v=4",
            "Kathmandu", 1000000F))
        lstActors.add(Actors(2, "Dahayang Rai",
            "https://myrepublica.nagariknetwork.com/uploads/media/Dayahang-Rai_20191015162610.jpg",
            "Lalitpur", 150000F))
        lstActors.add(Actors(3, "Rajesh Hamal",
            "https://myrepublica.nagariknetwork.com/uploads/media/RajeshHamal.jpg",
            "Kathmandu", 2000000F))
        lstActors.add(Actors(4, "Saugat Malla",
            "https://bigulmedia.com/wp-content/uploads/2016/04/Saugat-Malla-Picture.gif",
            "Bhaktapur", 3000000F))
    }
}
