package com.example.myapplication

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout
import javax.security.auth.callback.PasswordCallback

class TaskActivity : AppCompatActivity() {

    lateinit var firstNameLayout: TextInputLayout
    lateinit var lastNameLayout: TextInputLayout
    lateinit var emailLayout: TextInputLayout
    lateinit var passwordLayout: TextInputLayout
    lateinit var submitbtn: Button
    lateinit var firstText: TextView
    lateinit var secondText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_task)

        firstNameLayout= findViewById(R.id.firstName)
        lastNameLayout = findViewById(R.id.lastName)
        emailLayout = findViewById(R.id.email)
        passwordLayout = findViewById(R.id.password)
        submitbtn = findViewById(R.id.submitbtn)
        firstText = findViewById(R.id.firstText)
        secondText = findViewById(R.id.secondText)

        submitbtn.setOnClickListener {
            val firstName : String = firstNameLayout.editText?.text.toString()
            val lastName : String = lastNameLayout.editText?.text.toString()
            val email: String = emailLayout.editText?.text.toString()
            val password: String = passwordLayout.editText?.text.toString()

        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}