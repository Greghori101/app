package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NotesActivity : AppCompatActivity() {
    private val notes = mutableListOf<Note>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)


        // initialize the list of notes
        notes.add(Note("Title 1", "Content 1", System.currentTimeMillis()))
        notes.add(Note("Title 2", "Content 2", System.currentTimeMillis()))
        notes.add(Note("Title 3", "Content 3", System.currentTimeMillis()))

        // set up the RecyclerView to display the list of notes
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = NotesAdapter(notes)
    }
}