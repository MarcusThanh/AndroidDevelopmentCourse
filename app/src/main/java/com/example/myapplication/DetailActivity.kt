package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tenHang = intent.getStringExtra("ten_hang")
        val gia = intent.getStringExtra("gia")
        val deVo = intent.getBooleanExtra("de_vo", false)
        val baoHanh = intent.getIntExtra("bao_hanh", 0)
        val xuatXu = intent.getStringExtra("xuat_xu")

        findViewById<TextView>(R.id.detailTenHang).text = "Tên hàng: $tenHang"
        findViewById<TextView>(R.id.detailGia).text = "Giá: $gia đ"
        findViewById<TextView>(R.id.detailXuatXu).text = "Xuất xứ: $xuatXu"
        findViewById<TextView>(R.id.detailBaoHanh).text = "Bảo hành: $baoHanh tháng | Dễ vỡ: ${if (deVo) "Có" else "Không"}"
    }
}