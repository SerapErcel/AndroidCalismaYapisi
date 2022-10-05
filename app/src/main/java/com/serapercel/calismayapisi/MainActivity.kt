package com.serapercel.calismayapisi

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
            Snackbar.make(it, "Merhaba", Snackbar.LENGTH_SHORT).show()
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