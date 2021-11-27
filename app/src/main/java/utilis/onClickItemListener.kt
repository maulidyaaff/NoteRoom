package com.example.readingroom.utils
import com.example.readingroom.model.ModelNote

interface onClickItemListener {
    fun onClick(modelNote: ModelNote, position: Int)
}