package com.example.app



import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class NoteActivity : AppCompatActivity() {
    var title: TextView? = null
    var content: TextView? = null
    var date: TextView? = null

    var detailDesc: TextView? = null
    var detailTitle: TextView? = null
    var detailLang: TextView? = null
    var detailImage: ImageView? = null
    var deleteButton: FloatingActionButton? = null
    var editButton: FloatingActionButton? = null
    var key: String? = ""
    var imageUrl: String? = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)
        title = findViewById<TextView>(R.id.detailTitle)
        content = findViewById<TextView>(R.id.detailContent)
        date = findViewById<TextView>(R.id.detailDate)
        val bundle = intent.extras
        if (bundle != null) {
            title.setText(bundle.getString("title"))
            content.setText(bundle.getString("content"))
            date.setText(bundle.getString("date"))
        }


    }
}