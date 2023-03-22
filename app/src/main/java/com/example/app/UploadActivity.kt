package com.example.app


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class UploadActivity : AppCompatActivity() {
    var saveButton: Button? = null
    var title: EditText? = null
    var content: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload)
        title = findViewById<EditText>(R.id.editTitle)
        content = findViewById<EditText>(R.id.editContent)
        saveButton = findViewById<Button>(R.id.saveButton)


        saveButton.setOnClickListener(View.OnClickListener { saveData() })
    }

    fun saveData() {

    }


}