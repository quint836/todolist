package com.sam.todolist.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.sam.todolist.model.Note;

@Database(entities = {Note.class}, version = 1, exportSchema = false)
public abstract class AppDb extends RoomDatabase {
    public abstract com.sam.todolist.data.NoteDao noteDao();
}
