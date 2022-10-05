package com.serapercel.calismayapisi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.serapercel.calismayapisi.databinding.ActivitySonucEkraniBinding

class SonucEkraniActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivitySonucEkraniBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivitySonucEkraniBinding.inflate(layoutInflater)
        setContentView(tasarim.root)
    }

    override fun onBackPressed() {
        // varsayilan olarak geri donme islemini yapar
        //super.onBackPressed()
        Snackbar.make(tasarim.textView4,"Geri donmek istiyor musunuz?", Snackbar.LENGTH_SHORT)
            .setAction("Evet"){
                super.onBackPressed()
            }
            .show()


    }
}