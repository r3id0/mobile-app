package com.example.finalfinal

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import android.view.LayoutInflater
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isEmpty
import com.example.finalfinal.databinding.ActivityLoginBinding
import com.example.finalfinal.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {

            val emailInput: TextInputLayout = findViewById<TextInputLayout>(R.id.et_username)
            val passwordInput: TextInputLayout = findViewById<TextInputLayout>(R.id.et_password)

            if (emailInput.isEmpty() && passwordInput.isEmpty()) {

                val builder = AlertDialog.Builder(this)
                builder.setTitle("Error")
                builder.setMessage("An error has occurred")
                builder.setPositiveButton("OK") { dialog, which ->
                    // handle OK button click
                }
                builder.setNegativeButton("Cancel") { dialog, which ->
                    // handle Cancel buttqon click
                }
                val dialog = builder.create()
                dialog.show()

            } else {

                startActivity(Intent(this, HomeActivity::class.java))


            }

            binding.donthaveAcc.setOnClickListener {

                startActivity(Intent(this, RegistrationActivity::class.java))

            }

        }
    }
}