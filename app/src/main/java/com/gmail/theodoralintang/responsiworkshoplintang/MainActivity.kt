package com.gmail.theodoralintang.responsiworkshoplintang

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //deklaraai variabel java
    internal lateinit var j_tombol: Button
    internal lateinit var j_nama: EditText
    internal lateinit var j_outNama: TextView
    private val nama: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //untuk mengoneksikan XML dengan Java
        //editNama, tombol , outNama  id pada xml

        j_nama = findViewById(R.id.editNama)
        j_tombol = findViewById(R.id.tombol)
        j_outNama = findViewById(R.id.outNama)
    }

    //fungsi atau method yang dijalankan oleh event onClick
    fun onClick(v: View) {
        //mengamnbil isi dari j_nama
        val nama = j_nama.text.toString()
        //memunculkan input teks di Toast - posisi bisa diato

        val ts = Toast.makeText(this@MainActivity, nama, Toast.LENGTH_LONG)
        ts.setGravity(Gravity.CENTER_HORIZONTAL, 10, 50)
        ts.show()
        //memunculkan inpout Teks di TextView
        j_outNama.text = nama
    }
}
//end on Click }//end class

