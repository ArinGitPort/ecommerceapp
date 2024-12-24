package com.example.ecommerceapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

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

        // Set up button listeners for each product
        setupProductButtons()

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

    private fun setupProductButtons() {
        // Product 1
        val btnAddProduct1: Button = findViewById(R.id.btnAddProduct1)
        val btnRemoveProduct1: Button = findViewById(R.id.btnRemoveProduct1)
        btnAddProduct1.setOnClickListener {
            Toast.makeText(this, "Added RTX 3060Ti to cart!", Toast.LENGTH_SHORT).show()
        }
        btnRemoveProduct1.setOnClickListener {
            Toast.makeText(this, "Removed RTX 3060Ti from cart!", Toast.LENGTH_SHORT).show()
        }

        // Product 2
        val btnAddProduct2: Button = findViewById(R.id.btnAddProduct2)
        val btnRemoveProduct2: Button = findViewById(R.id.btnRemoveProduct2)
        btnAddProduct2.setOnClickListener {
            Toast.makeText(this, "Added Adobo to cart!", Toast.LENGTH_SHORT).show()
        }
        btnRemoveProduct2.setOnClickListener {
            Toast.makeText(this, "Removed Adobo from cart!", Toast.LENGTH_SHORT).show()
        }

        // Product 3
        val btnAddProduct3: Button = findViewById(R.id.btnAddProduct3)
        val btnRemoveProduct3: Button = findViewById(R.id.btnRemoveProduct3)
        btnAddProduct3.setOnClickListener {
            Toast.makeText(this, "Added Walis Tambo to cart!", Toast.LENGTH_SHORT).show()
        }
        btnRemoveProduct3.setOnClickListener {
            Toast.makeText(this, "Removed Walis Tambo from cart!", Toast.LENGTH_SHORT).show()
        }

        // Product 4
        val btnAddProduct4: Button = findViewById(R.id.btnAddProduct4)
        val btnRemoveProduct4: Button = findViewById(R.id.btnRemoveProduct4)
        btnAddProduct4.setOnClickListener {
            Toast.makeText(this, "Added Monster Energy Drink to cart!", Toast.LENGTH_SHORT).show()
        }
        btnRemoveProduct4.setOnClickListener {
            Toast.makeText(this, "Removed Monster Energy Drink from cart!", Toast.LENGTH_SHORT).show()
        }

        // Product 5
        val btnAddProduct5: Button = findViewById(R.id.btnAddProduct5)
        val btnRemoveProduct5: Button = findViewById(R.id.btnRemoveProduct5)
        btnAddProduct5.setOnClickListener {
            Toast.makeText(this, "Added Ryzen 5 7600 to cart!", Toast.LENGTH_SHORT).show()
        }
        btnRemoveProduct5.setOnClickListener {
            Toast.makeText(this, "Removed Ryzen 5 7600 from cart!", Toast.LENGTH_SHORT).show()
        }
    }
}
