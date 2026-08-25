package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val container = findViewById<LinearLayout>(R.id.linearLayoutList)

        // Read data from Intent
        val tenHang = intent.getStringExtra("ten_hang") ?: "Không có tên"
        val gia = intent.getStringExtra("gia") ?: "0"
        val deVo = intent.getBooleanExtra("de_vo", false)
        val baoHanh = intent.getIntExtra("bao_hanh", 0)
        val xuatXu = intent.getStringExtra("xuat_xu") ?: ""

        val card = layoutInflater.inflate(R.layout.item_card, container, false)
        card.findViewById<TextView>(R.id.cardTenHang).text = tenHang
        card.findViewById<TextView>(R.id.cardGia).text = "Giá: $gia đ"

        card.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("ten_hang", tenHang)
            intent.putExtra("gia", gia)
            intent.putExtra("de_vo", deVo)
            intent.putExtra("bao_hanh", baoHanh)
            intent.putExtra("xuat_xu", xuatXu)
            startActivity(intent)
        }

        container.addView(card)
    }
}