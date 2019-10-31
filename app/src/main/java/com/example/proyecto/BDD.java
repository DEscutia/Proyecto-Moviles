package com.example.proyecto;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BDD extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "PFinal";

    public BDD(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE " + TABLE_NAME_NOTAS + " ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "titulo  TEXT NOT NULL,"
                    + "Descripcion TEXT,"
                    + "fechaCreado Date NOT NULL,"
                    + "fechaLimite Date,"
                    + "HoraLimite time,"
                    +  "Cumplida Tinyint"+

                            ""+");"
                    );

        db.execSQL("CREATE TABLE " + TABLE_NAME_ARCHIVOS + " ("
                + "id INTEGER PRIMARY KEY,"
                + "ruta  Text NOT NULL,"
                + "Audio Tinyint NOT NULL,"
                + "Imagen Tinyint NOT NULL,"
                + "Video Tinyint NOT NULL,"
                + "Descripcion Text"+

                ""+");"
        );


        db.execSQL("CREATE TABLE " + TABLE_NAME_RECORDATORIOS + " ("
                + "id INTEGER PRIMARY KEY,"
                + "fecha Date,"
                + "Hora time"+

                ""+");"
        );




        }

    public  static final String TABLE_NAME_ARCHIVOS =
            "archivos";

    public  static final String TABLE_NAME_RECORDATORIOS =
            "recordatorios";

    public  static final String TABLE_NAME_NOTAS =
            "notas";



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
