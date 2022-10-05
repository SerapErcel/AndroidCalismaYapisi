package com.serapercel.calismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.serapercel.calismayapisi.databinding.ActivityOyunEkraniBinding

class OyunEkraniActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityOyunEkraniBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityOyunEkraniBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        // gonderilen degerleri okuma
        val gelenAd =
            intent.getStringExtra("ad") // String referans tip null olabilir, varsayilan degeri yoktur
        val gelenYas = intent.getIntExtra("yas", 0)
        val gelenBoy = intent.getDoubleExtra("boy", 0.0)
        val gelenBekar = intent.getBooleanExtra("bekar", false)

        if (gelenAd != null) {
            Log.e("Gelen ad", gelenAd)
            Log.e("Gelen yas", gelenYas.toString())
            Log.e("Gelen boy", gelenBoy.toString())
            Log.e("Gelen bekar", gelenBekar.toString())
        }

        val gelenNesne = intent.getSerializableExtra("nesne") as Kisiler // DownCasting
        Log.e("Gelen Nesne ad", gelenNesne.ad)
        Log.e("Gelen Nesne yas", gelenNesne.yas.toString())
        Log.e("Gelen Nesne boy", gelenNesne.boy.toString())
        Log.e("Gelen Nesne bekar", gelenNesne.bekar.toString())

        tasarim.butonBitir.setOnClickListener {
            // sayfa gecisi icin intent oluşturma ve activity baslatilmasi
            val intent = Intent(this@OyunEkraniActivity, SonucEkraniActivity::class.java)
            startActivity(intent)
            // back stack yonetimi
            // oyun ekranini back stack'den siler
            finish()
        }
    }
}