package com.amier.modernloginregister

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.activity_login.*

class DashboardActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        check_button.setOnClickListener {
            startActivity(Intent(this,ProfileActivity::class.java))
        }

        cert_button.setOnClickListener {
            startActivity(Intent(this,CertActivity::class.java))
        }

        search_button.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}