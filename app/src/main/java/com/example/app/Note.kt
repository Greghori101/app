package com.example.app

import java.text.SimpleDateFormat
import java.util.*
class Note {

    var title: String? = null
    var content: String? = null
    var date: String? = null

    constructor(title: String?, content: String?,date:Long?){
        this.title = title
        this.content = content
        this.date = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(date)
    }
    constructor()
    {}
}