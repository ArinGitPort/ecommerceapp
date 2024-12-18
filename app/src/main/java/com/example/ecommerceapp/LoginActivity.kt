package com.example.ecommerceapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ecommerceapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize View Binding for Activity
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Handle Log In button click
        binding.btnLogin.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()

            when {
                email.isEmpty() -> Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show()
                password.isEmpty() -> Toast.makeText(this, "Please enter your password", Toast.LENGTH_SHORT).show()
                else -> {
                    val intent = Intent(this, LandingActivity::class.java)
                    intent.putExtra("EMAIL", email)
                    intent.putExtra("PASSWORD", password)
                    startActivity(intent)
                }
            }
        }

        // Handle Back button click
        binding.btnBack.setOnClickListener {
            finish() // Navigate back to the previous screen
        }
    }
}
