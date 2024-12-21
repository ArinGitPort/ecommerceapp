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

        // Retrieve registered credentials from Intent
        val registeredEmail = intent.getStringExtra("registered_email")
        val registeredPassword = intent.getStringExtra("registered_password")

        // Handle Log In button click
        binding.btnLogin.setOnClickListener {
            val email = binding.etEmail.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()

            when {
                email.isEmpty() -> Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show()
                password.isEmpty() -> Toast.makeText(this, "Please enter your password", Toast.LENGTH_SHORT).show()
                email == registeredEmail && password == registeredPassword -> {
                    val intent = Intent(this, LandingActivity::class.java)
                    intent.putExtra("EMAIL", email)
                    startActivity(intent)
                }
                else -> Toast.makeText(this, "Invalid email or password", Toast.LENGTH_SHORT).show()
            }
        }

        // Handle Back button click
        binding.btnBack.setOnClickListener {
            finish() // Navigate back to the previous screen
        }
    }
}
