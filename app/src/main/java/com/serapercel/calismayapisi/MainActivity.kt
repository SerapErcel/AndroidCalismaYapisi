package com.serapercel.calismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import com.serapercel.calismayapisi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityMainBinding

    // Yasam dongusunda ilk calisan metod bu metod ile birlikte aktivite yaratilir
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // R (res) klasoru ile tasarim baglanir
        // setContentView(R.layout.activity_main)

        // View binding kullanarak tasarimin baglanmasi
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.butonBasla.setOnClickListener {
            // Snackbar.make(it, "Merhaba", Snackbar.LENGTH_SHORT).show()

            // sayfa gecisi icin intent oluşturma ve activity baslatilmasi
            val intent = Intent(this@MainActivity, OyunEkraniActivity::class.java)

            // Activityler arasi veri tasima
            intent.putExtra("ad", "Ahmet")
            intent.putExtra("yas", 23)
            intent.putExtra("boy", 1.78)
            intent.putExtra("bekar", true)

            // Activityler arasi nesne tasima
            val kisi = Kisiler("Mehmet", 34, 1.97, false)
            intent.putExtra("nesne",kisi)

            startActivity(intent)

        }

        Log.e("Yasam Dongusu", "onCreate Calisti")
    }

    // aktivite kullanici tarafinda gorulur
    override fun onStart() {
        super.onStart()
        Log.e("Yasam Dongusu", "onStart Calisti")
    }

    // kullanici uygulama ile iletisim halindedir
    override fun onResume() {
        super.onResume()
        // Sayfaya geri donuldugunu anlariz
        Log.e("Yasam Dongusu", "onResume Calisti")
    }

    // kullanicidan girdi almaz kod calistirmaz
    override fun onPause() {
        super.onPause()
        Log.e("Yasam Dongusu", "onPause Calisti")
    }

    // aktivite gorunur degildir
    override fun onStop() {
        super.onStop()
        Log.e("Yasam Dongusu", "onStop Calisti")
    }

    // aktivite sistem tarafindan yok edilmeden once calisir
    override fun onDestroy() {
        super.onDestroy()
        Log.e("Yasam Dongusu", "onDestroy Calisti")
    }

    // aktivite durdurulduktan sonra tekrar baslatilmak icin calisir
    override fun onRestart() {
        super.onRestart()
        Log.e("Yasam Dongusu", "onRestart Calisti")
    }
}