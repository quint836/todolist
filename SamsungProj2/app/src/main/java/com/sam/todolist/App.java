package com.sam.todolist;

import android.app.Application;

import androidx.room.Room;

import com.sam.todolist.data.AppDb;
import com.sam.todolist.data.NoteDao;

public class App extends Application {

    private AppDb database;
    private com.sam.todolist.data.NoteDao noteDao;

    private static App instance;

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;

        database = Room.databaseBuilder(getApplicationContext(),
                AppDb.class, "app-db-name")
                .allowMainThreadQueries()
                .build();

        noteDao = database.noteDao();
    }

    public AppDb getDatabase() {
        return database;
    }

    public void setDatabase(AppDb database) {
        this.database = database;
    }

    public NoteDao getNoteDao() {
        return noteDao;
    }

    public void setNoteDao(NoteDao noteDao) {
        this.noteDao = noteDao;
    }
}
