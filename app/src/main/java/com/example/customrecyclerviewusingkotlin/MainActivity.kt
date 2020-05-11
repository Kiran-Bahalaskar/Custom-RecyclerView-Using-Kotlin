package com.example.customrecyclerviewusingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.customrecyclerviewusingkotlin.Adapter.MyAdapter
import com.example.customrecyclerviewusingkotlin.Model.Model
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Model>()
        arrayList.add(Model("facebook","this is facebook description", R.drawable.facebook))
        arrayList.add(Model("instagram","this is instagram description", R.drawable.instagram))
        arrayList.add(Model("twitter","this is twitter description", R.drawable.twitter))
        arrayList.add(Model("what's app","this is what's app description", R.drawable.whats_app))
        arrayList.add(Model("youtube","this is youtube description", R.drawable.youtube))

        val myAdapter = MyAdapter(arrayList, this)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = myAdapter
    }
}
