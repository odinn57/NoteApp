package com.odinn.noteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.odinn.noteapp.ui.theme.Blue
import com.odinn.noteapp.ui.theme.LightGreen
import com.odinn.noteapp.ui.theme.RedOrange
import com.odinn.noteapp.ui.theme.RedPink
import com.odinn.noteapp.ui.theme.Violet

@Entity
data class Note(
    @PrimaryKey
    val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, Blue, RedPink)
    }
}

class InvalidNoteException(message: String) : Exception(message)
