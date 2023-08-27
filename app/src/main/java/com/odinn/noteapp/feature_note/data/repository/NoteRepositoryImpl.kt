package com.odinn.noteapp.feature_note.data.repository

import com.odinn.noteapp.feature_note.data.data_source.NoteDao
import com.odinn.noteapp.feature_note.domain.model.Note
import com.odinn.noteapp.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

/**
 * В data слое лежат реализации интерфейсов из domain
 */
class NoteRepositoryImpl(
    private val dao: NoteDao
) : NoteRepository {
    override fun getNotes(): Flow<List<Note>> =
        dao.getNotes()

    override suspend fun getNoteById(id: Int) =
        dao.getNoteById(id)


    override suspend fun insertNote(note: Note) =
        dao.insertNote(note)

    override suspend fun deleteNote(note: Note) =
        dao.deleteNote(note)
}