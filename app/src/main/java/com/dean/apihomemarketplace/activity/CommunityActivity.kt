package com.dean.apihomemarketplace.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dean.apihomemarketplace.R
import kotlinx.android.synthetic.main.activity_community.iv_backstage_community
import kotlinx.android.synthetic.main.activity_manage_budgeting.iv_backstage_manage

class CommunityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_community)

        showBackHome()

    }

    private fun showBackHome() {
        iv_backstage_community.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}