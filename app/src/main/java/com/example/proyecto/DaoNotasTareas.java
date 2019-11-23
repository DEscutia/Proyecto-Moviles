package com.example.proyecto;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class DaoNotasTareas {


        SQLiteDatabase _sqLiteDatabase;
        Context ctx;

        public DaoNotasTareas(Context ctx){
            this.ctx=ctx;
            _sqLiteDatabase= new BDD(ctx).getWritableDatabase();
        }

    public long insertarNota(TareasNotas TareasNotas){
        ContentValues contentValues = new ContentValues();

        /*        contentValues.put(BDD.COLUMNS_NAME_NOTA[1],
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
                TareasNotas.getTarea()); */

        contentValues.put(BDD.COLUMNS_NAME_NOTA[1],
                TareasNotas.getId());
        contentValues.put(BDD.COLUMNS_NAME_NOTA[2],
                TareasNotas.getTitulo());
        contentValues.put(BDD.COLUMNS_NAME_NOTA[3],
                TareasNotas.getDescripcion());


        return _sqLiteDatabase.insert(BDD.TABLE_NAME_NOTA,
                null, contentValues);

    }

    public List<TareasNotas> getAll() {
        List<TareasNotas> lst = null;

        Cursor c = _sqLiteDatabase.query(BDD.TABLE_NAME_NOTA,
                BDD.COLUMNS_NAME_NOTA,
                null,
                null,
                null,
                null,
                null,
                null);

        if (c.moveToFirst()) {
            lst = new ArrayList<TareasNotas>();
            do {
                TareasNotas notastareas =
                        new TareasNotas(c.getInt(0), c.getString(1),
                                c.getString(2));
                lst.add(notastareas);

            } while (c.moveToNext());
        }
        return lst;

    }


    public TareasNotas inflaCursor(Cursor c) {
        TareasNotas tn = new TareasNotas(c.getInt(0), c.getString(1),
                c.getString(2));

        return tn ;
    }


    public Cursor getAllCursor (){
        return _sqLiteDatabase.query(BDD.TABLE_NAME_NOTA,
                BDD.COLUMNS_NAME_NOTA,
                null,
                null,
                null,
                null,
                null,
                null);
    }


    public void Actualizar(){

    }

    public void Eliminar(){

    }

    public void Buscar(){

    }


}
