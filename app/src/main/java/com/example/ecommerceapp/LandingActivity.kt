package com.example.ecommerceapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LandingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Enable edge-to-edge layout
        enableEdgeToEdge()

        // Set content view
        setContentView(R.layout.activity_landing)

        // Display static items
        val productName1: TextView = findViewById(R.id.productName1)
        val productImage1: ImageView = findViewById(R.id.productImage1)
        productName1.text = "RTX 3060Ti"
        productImage1.setImageResource(R.drawable.gpu)

        val productName2: TextView = findViewById(R.id.productName2)
        val productImage2: ImageView = findViewById(R.id.productImage2)
        productName2.text = "Adobo"
        productImage2.setImageResource(R.drawable.adobo)

        val productName3: TextView = findViewById(R.id.productName3)
        val productImage3: ImageView = findViewById(R.id.productImage3)
        productName3.text = "Walis Tambo"
        productImage3.setImageResource(R.drawable.walistambo)

        val productName4: TextView = findViewById(R.id.productName4)
        val productImage4: ImageView = findViewById(R.id.productImage4)
        productName4.text = "Monster Energy Drink"
        productImage4.setImageResource(R.drawable.monsterenergy)

        val productName5: TextView = findViewById(R.id.productName5)
        val productImage5: ImageView = findViewById(R.id.productImage5)
        productName5.text = "Ryzen 5 7600"
        productImage5.setImageResource(R.drawable.cpu)

        // Handle window insets to avoid system UI overlaps
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.tvWelcome)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Set up "Order Now" button click listener
        val btnGoToOrder: Button = findViewById(R.id.btnGoToOrder)
        btnGoToOrder.setOnClickListener {
            // Navigate to OrderingActivity
            val intent = Intent(this, OrderingActivity::class.java)
            startActivity(intent)
        }

        // Set up "Back" button click listener
        val btnGoBack: Button = findViewById(R.id.btnGoBack)
        btnGoBack.setOnClickListener {
            finish()
        }
    }
}
