package com.andra.recycleview_playstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            this.supportActionBar?.hide()
        } catch (e: NullPointerException) { }

        val permainanList = arrayListOf(
            AplikasiClass("Exos Heroes", 980, R.drawable.exos),
            AplikasiClass("Pokemon Go", 600, R.drawable.poke),
            AplikasiClass("Epic Seven", 999, R.drawable.epic),
            AplikasiClass("FIFA", 600, R.drawable.fifa)
        )

        val seniList = arrayListOf(
            AplikasiClass("VSCO", 45,R.drawable.vsco),
            AplikasiClass("Canva", 78,R.drawable.canva),
            AplikasiClass("Lightroom", 45,R.drawable.lightroom),
            AplikasiClass("Medibang", 45,R.drawable.medibang)
        )

        val bukuList = arrayListOf(
            AplikasiClass("Ciayo",61,R.drawable.ciayo),
            AplikasiClass("Wattpad",61,R.drawable.wattpad),
            AplikasiClass("Webtoon",61,R.drawable.webtoon),
            AplikasiClass("Dreame",61,R.drawable.dreame)
        )

        val sosialList = arrayListOf(
            AplikasiClass("Twitter",61,R.drawable.twit),
            AplikasiClass("Tinder",61,R.drawable.tinder),
            AplikasiClass("Facebook",61,R.drawable.fb),
            AplikasiClass("Instagram",61,R.drawable.ig)
        )

        val beritaList = arrayListOf(
            AplikasiClass("Kompas",61,R.drawable.kompas),
            AplikasiClass("Bein",61,R.drawable.bein),
            AplikasiClass("CNN",61,R.drawable.cnn),
            AplikasiClass("Detik",61,R.drawable.detik)
        )

        bukuRecycleView.layoutManager = GridLayoutManager(this,1,GridLayoutManager.HORIZONTAL,false)
        bukuRecycleView.adapter = AdapterAplikasi(bukuList)

        seniRecycleView.layoutManager = GridLayoutManager(this,1,GridLayoutManager.HORIZONTAL,false)
        seniRecycleView.adapter = AdapterAplikasi(seniList)

        sosialRecycleView.layoutManager = GridLayoutManager(this,1,GridLayoutManager.HORIZONTAL,false)
        sosialRecycleView.adapter = AdapterAplikasi(sosialList)

        permainanRecycleView.layoutManager = GridLayoutManager(this,1,GridLayoutManager.HORIZONTAL,false)
        permainanRecycleView.adapter = AdapterAplikasi(permainanList)

        beritaRecycleView.layoutManager = GridLayoutManager(this,1,GridLayoutManager.HORIZONTAL,false)
        beritaRecycleView.adapter = AdapterAplikasi(beritaList)
    }
}