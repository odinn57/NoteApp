package com.odinn.noteapp.feature_note.domain.repository

import com.odinn.noteapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

/**
 * В domain слое описаны определения методов репозитория
 */
interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}