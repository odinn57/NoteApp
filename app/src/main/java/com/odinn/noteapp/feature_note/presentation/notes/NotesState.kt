package com.odinn.noteapp.feature_note.presentation.notes

import com.odinn.noteapp.feature_note.domain.model.Note
import com.odinn.noteapp.feature_note.domain.util.NoteOrder
import com.odinn.noteapp.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSelectionVisibility: Boolean = false
)
