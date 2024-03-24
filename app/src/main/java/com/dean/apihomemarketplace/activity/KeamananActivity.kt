package com.dean.apihomemarketplace.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dean.apihomemarketplace.R
import com.dean.apihomemarketplace.fragment.LicencingFragment
import kotlinx.android.synthetic.main.activity_finance.iv_backstage_finance
import kotlinx.android.synthetic.main.activity_keamanan.iv_backstage_security1

class KeamananActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keamanan)

        showBackHome()

    }
    private fun showBackHome() {
        iv_backstage_security1.setOnClickListener {
            val intent = Intent(this, LicencingFragment::class.java)
            startActivity(intent)
        }
    }
}