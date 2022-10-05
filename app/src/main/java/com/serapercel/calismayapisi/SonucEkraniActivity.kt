package com.serapercel.calismayapisi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.serapercel.calismayapisi.databinding.ActivitySonucEkraniBinding

class SonucEkraniActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivitySonucEkraniBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivitySonucEkraniBinding.inflate(layoutInflater)
        setContentView(tasarim.root)
    }
}