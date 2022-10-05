package com.serapercel.calismayapisi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.serapercel.calismayapisi.databinding.ActivityOyunEkraniBinding

class OyunEkraniActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityOyunEkraniBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityOyunEkraniBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

         tasarim.butonBitir.setOnClickListener {

         }
    }
}