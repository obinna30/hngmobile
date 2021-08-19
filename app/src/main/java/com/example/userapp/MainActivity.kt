package com.example.userapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar
        actionBar!!.title = "User Input Form"
        var first_name = findViewById(R.id.first_name) as EditText
        var last_name = findViewById(R.id.last_name) as EditText
        var email = findViewById(R.id.email) as EditText
        var phone_number = findViewById(R.id.phone_number) as EditText
        var address = findViewById(R.id.address) as EditText
        var zuri = findViewById(R.id.zuri) as ImageView
        var hng = findViewById(R.id.hng) as ImageView
        var i4g = findViewById(R.id.i4g) as ImageView

        user_details_Btn.setOnClickListener {
            val intent = Intent(this, UserDetails::class.java)
            var uaser_first_name: String = first_name.getText().toString()
            var user_last_name: String = last_name.getText().toString()
            var user_name: String = uaser_first_name + " " + user_last_name
            var user_email: String = email.getText().toString()
            var user_phone_number: String = phone_number.getText().toString()
            var user_address: String = address.getText().toString()
            intent.putExtra("name", user_name)
            intent.putExtra("email", user_email)
            intent.putExtra("phone", user_phone_number)
            intent.putExtra("address", user_address)
            startActivity(intent)
        }
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