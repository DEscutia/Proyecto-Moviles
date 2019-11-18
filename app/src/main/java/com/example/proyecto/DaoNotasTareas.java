package com.example.proyecto;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DaoNotasTareas {


        SQLiteDatabase _sqLiteDatabase;
        Context ctx;

        public DaoNotasTareas(Context ctx){
            this.ctx=ctx;
            _sqLiteDatabase= new BDD(ctx).getWritableDatabase();
        }

    public long insertarNota(TareasNotas TareasNotas){
        ContentValues contentValues = new ContentValues();

                contentValues.put(BDD.COLUMNS_NAME_NOTA[1],
                        TareasNotas.getId());
        contentValues.put(BDD.COLUMNS_NAME_NOTA[2],
                TareasNotas.getTitulo());
        contentValues.put(BDD.COLUMNS_NAME_NOTA[3],
                TareasNotas.getDescripcion());
        contentValues.put(BDD.COLUMNS_NAME_NOTA[4],
                TareasNotas.getFechaCreado());
        contentValues.put(BDD.COLUMNS_NAME_NOTA[5],
                TareasNotas.getFechaLimite());
        contentValues.put(BDD.COLUMNS_NAME_NOTA[6],
                TareasNotas.getHoraLimite());
        contentValues.put(BDD.COLUMNS_NAME_NOTA[7],
                TareasNotas.getCumplida());
        contentValues.put(BDD.COLUMNS_NAME_NOTA[8],
                TareasNotas.getTarea());

        return _sqLiteDatabase.insert(BDD.TABLE_NAME_NOTA,
                null, contentValues);

    }

    public void Actualizar(){

    }

    public void Eliminar(){

    }

    public void Buscar(){

    }


}
