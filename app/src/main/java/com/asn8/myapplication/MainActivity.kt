package com.asn8.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.asn8.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var etUserName: EditText = findViewById(R.id.eTUSerName)
    var etUserpassword: EditText = findViewById(R.id.eTPassowrd)
    var loginButton: Button = findViewById(R.id.loginButton)
    lateinit var userName: String
    lateinit var userPassowrd: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        loginButton.setOnClickListener {
            userName = etUserName.text.toString()
            userPassowrd = etUserpassword.text.toString()
            Toast.makeText(this, "Login SuccessFull", Toast.LENGTH_SHORT).show()
        }


    }

    override fun onDestroy() {
        super.onDestroy()
    }
}