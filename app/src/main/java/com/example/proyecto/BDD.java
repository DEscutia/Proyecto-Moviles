package com.example.proyecto;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BDD extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "PFinal";

    public BDD(Context applicationContext, String pFinal, Context context, int i) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CrearTabla.CREAR_TABLA_NOTAS);
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
