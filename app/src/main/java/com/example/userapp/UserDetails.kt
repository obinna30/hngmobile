package com.example.userapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_user_details.*
class UserDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_details)
        val actionBar = supportActionBar
        actionBar!!.title = "User Details"
        actionBar.setDisplayHomeAsUpEnabled(true)
        var zuri = findViewById(R.id.zuri) as ImageView
        var hng = findViewById(R.id.hng) as ImageView
        var i4g = findViewById(R.id.i4g) as ImageView
        var first_name_tv = findViewById<TextView>(R.id.first_name_tv) as TextView
        var user_email_tv = findViewById<TextView>(R.id.email_tv) as TextView
        var user_phone_number_tv = findViewById<TextView>(R.id.phone_number_tv) as TextView
        var user_address_tv = findViewById<TextView>(R.id.address_tv) as TextView
        var user_name: String = "NAME: " + intent.getStringExtra("name").toString()
        var user_email: String = "Email: " + intent.getStringExtra("email").toString()
        var user_phone_number: String = "Phone: " + intent.getStringExtra("phone").toString()
        var user_address: String = "Address: " + intent.getStringExtra("address").toString()
        first_name_tv.setText(user_name)
        user_email_tv.setText(user_email)
        user_phone_number_tv.setText(user_phone_number)
        user_address_tv.setText(user_address)

        zuri.setOnClickListener {
            val uri: Uri = Uri.parse("https://training.zuri.team/")
            val zuriItent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(zuriItent)
        }
        hng.setOnClickListener {
            val uri: Uri = Uri.parse("https://hng.tech/")
            val hngItent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(hngItent)
        }
        i4g.setOnClickListener {
            val uri: Uri = Uri.parse("https://ingressive.org/")
            val i4gItent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(i4gItent)
        }
    }
}