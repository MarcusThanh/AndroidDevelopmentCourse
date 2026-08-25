package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.SeekBar
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnThem = findViewById<Button>(R.id.button)
        val editTenHang = findViewById<EditText>(R.id.editTextText2)
        val editGia = findViewById<EditText>(R.id.editTextNumber)
        val checkBoxDe = findViewById<CheckBox>(R.id.checkBox)
        val seekBar = findViewById<SeekBar>(R.id.seekBar) // add android:id="@+id/seekBar" to your SeekBar in XML if missing
        val spinner = findViewById<Spinner>(R.id.spinner)

        btnThem.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            intent.putExtra("ten_hang", editTenHang.text.toString())
            intent.putExtra("gia", editGia.text.toString())
            intent.putExtra("de_vo", checkBoxDe.isChecked)
            intent.putExtra("bao_hanh", seekBar.progress)
            intent.putExtra("xuat_xu", spinner.selectedItem.toString())
            startActivity(intent)
        }
    }
}