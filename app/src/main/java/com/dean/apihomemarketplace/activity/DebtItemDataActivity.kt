package com.dean.apihomemarketplace.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dean.apihomemarketplace.R
import kotlinx.android.synthetic.main.activity_debt_item_data.iv_backstage_debtdata

class DebtItemDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_debt_item_data)

        showBackHome()
    }

    private fun showBackHome() {
        iv_backstage_debtdata.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}