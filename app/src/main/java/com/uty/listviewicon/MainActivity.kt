package com.uty.listviewicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uty.listviewicon.model.Bahasa
import com.uty.listviewicon.model.DataBahasa

class MainActivity : AppCompatActivity() {
    private lateinit var rvBahasa: RecyclerView

    private var list: ArrayList<Bahasa> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBahasa = findViewById(R.id.rv_bahasa)
        rvBahasa.setHasFixedSize(true)
        list.addAll(DataBahasa.urutanbahasa)
        showBahasaList()
    }
    private fun showBahasaList() {
        rvBahasa.layoutManager = LinearLayoutManager(this)
        val bahasaAdapter = ListBahasaAdapter(list)
        rvBahasa.adapter = bahasaAdapter
    }
}
