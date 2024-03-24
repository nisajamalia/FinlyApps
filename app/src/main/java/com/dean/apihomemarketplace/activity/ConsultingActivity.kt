package com.dean.apihomemarketplace.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dean.apihomemarketplace.R
import com.dean.apihomemarketplace.fragment.LicencingFragment
import kotlinx.android.synthetic.main.activity_consulting.iv_backstage_consul

class ConsultingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consulting)

        showBackHome()

    }

    private fun showBackHome() {
        iv_backstage_consul.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}