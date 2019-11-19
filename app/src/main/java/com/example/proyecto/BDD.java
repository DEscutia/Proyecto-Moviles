package com.example.proyecto;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BDD extends SQLiteOpenHelper {




    public static final String[] COLUMNS_NAME_NOTA={
            "id", "titulo","Descripcion","fechaCreado","fechaLimite","HoraLimite","Cumplida", "Tarea"
    };



    public  static final String TABLE_NAME_NOTA =
            "notas";

    public BDD(@Nullable Context context) {
        super(context,
                "bdd",
                null,
                1);
    }


    public static final String CREAR_TABLA_NOTAS="CREATE TABLE " + TABLE_NAME_NOTA + " ("
            + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
            + "titulo TEXT NOT NULL,"
            + "Descripcion TEXT,"
            +"fechaCreado  Date,"
            + "fechaLimite text ,"
            + "HoraLimite time,"
            +  "Cumplida Tinyint,"
            + "Tarea Tinyint"+
            ");";


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREAR_TABLA_NOTAS);
        db.execSQL(CrearTabla.CREAR_TABLA_ARCHIVOS);
        db.execSQL(CrearTabla.CREAR_TABLA_RECORDATORIOS);

        }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+CrearTabla.TABLA_NOTAS);
        db.execSQL("DROP TABLE IF EXISTS "+CrearTabla.TABLA_ARCHIVOS);
        db.execSQL("DROP TABLE IF EXISTS "+CrearTabla.TABLA_RECORDATORIOS);
    }
}
