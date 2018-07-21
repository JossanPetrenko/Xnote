package com.example.petrenko.xnote.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.petrenko.xnote.R
import com.example.petrenko.xnote.model.Nota
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val adapter = NotaAdapter(arrayListOf(
            Nota(id = 1, titulo = "Cu Cagado", descricao = "Muita Merda"),
            Nota(2, "Meladao", "djnsdjn" )
    ))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recycler_view_notas.adapter = adapter

        val layoutManager = LinearLayoutManager(this)

        recycler_view_notas.layoutManager = layoutManager
    }
}
