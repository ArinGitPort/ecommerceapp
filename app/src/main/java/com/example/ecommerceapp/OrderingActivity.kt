package com.example.ecommerceapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OrderingActivity : AppCompatActivity() {
    private var product1Count = 0
    private var product2Count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ordering)

        // Adjust layout for system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btnPlaceOrder)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Handle "Add" and "Remove" buttons for Product 1
        val btnAddProduct1: Button = findViewById(R.id.btnAddProduct1)
        val btnRemoveProduct1: Button = findViewById(R.id.btnRemoveProduct1)

        btnAddProduct1.setOnClickListener {
            product1Count++
            Toast.makeText(this, "Added RTX 3060Ti. Total: $product1Count", Toast.LENGTH_SHORT).show()
        }

        btnRemoveProduct1.setOnClickListener {
            if (product1Count > 0) {
                product1Count--
                Toast.makeText(this, "Removed RTX 3060Ti. Total: $product1Count", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "No RTX 3060Ti in the cart.", Toast.LENGTH_SHORT).show()
            }
        }

        // Handle "Add" and "Remove" buttons for Product 2
        val btnAddProduct2: Button = findViewById(R.id.btnAddProduct2)
        val btnRemoveProduct2: Button = findViewById(R.id.btnRemoveProduct2)

        btnAddProduct2.setOnClickListener {
            product2Count++
            Toast.makeText(this, "Added Adobo. Total: $product2Count", Toast.LENGTH_SHORT).show()
        }

        btnRemoveProduct2.setOnClickListener {
            if (product2Count > 0) {
                product2Count--
                Toast.makeText(this, "Removed Adobo. Total: $product2Count", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "No Adobo in the cart.", Toast.LENGTH_SHORT).show()
            }
        }

        // Handle "Place Order" button click
        val btnPlaceOrder: Button = findViewById(R.id.btnPlaceOrder)
        btnPlaceOrder.setOnClickListener {
            val totalItems = product1Count + product2Count
            if (totalItems > 0) {
                Toast.makeText(this, "Order placed for $totalItems item(s)!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Your cart is empty.", Toast.LENGTH_SHORT).show()
            }
        }

        // Handle "Back" button click
        val btnGoBack: Button = findViewById(R.id.btnGoBack)
        btnGoBack.setOnClickListener {
            finish() // Return to the previous screen
        }
    }
}
