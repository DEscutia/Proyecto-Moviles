package com.example.proyecto;

public class CrearTabla {

    public static final String TABLA_NOTAS="notas";
    public static final String id="id";
    public static final String titulo="Titulo";
    public static final String Descripcion="Descripcion";
    public static final String fechaCreado="FechaCreado";
    public static final String fechaLimite="FechaLimite";
    public static final String HoraLimite="HoraLimite";
    public static final String Cumplida="cumplida";
    public static final String Tarea="tarea";


    public static final String CREAR_TABLA_NOTAS="CREATE TABLE " + TABLA_NOTAS + " ("
            + id + "INTEGER PRIMARY KEY AUTOINCREMENT,"
            + titulo + "TEXT NOT NULL,"
            + Descripcion+ "TEXT,"
            +fechaCreado + "Date,"
            + fechaLimite+ "text ,"
            + HoraLimite +"time,"
            +  Cumplida+ "Tinyint,"
            + Tarea+ "Tinyint not null"+
            ");";

    public static final String TABLA_ARCHIVOS="archivos";
    public static final String idA="id";
    public static final String Ruta="ruta";
    public static final String DescripcionA="descripcion";
    public static final String idNota="idNota";

    public static final String CREAR_TABLA_ARCHIVOS="CREATE TABLE "+ TABLA_ARCHIVOS +" ("
            + idA +"INTEGER,"
            + Ruta+"text,"
            +DescripcionA+"text,"
            + idNota+"int"
            +
            ");";


    public static final String TABLA_RECORDATORIOS="recordatorios";
    public static final String idR="id";
    public static final String Fecha="Fecha";
    public static final String Hora="Hora";
    public static final String idNotaR="idNota";

    public static final String CREAR_TABLA_RECORDATORIOS="CREATE TABLE "+ TABLA_RECORDATORIOS +" ("
            +idR +  "id,"
            +Fecha +  "text,"
            +Hora +  "time,"
            +idNotaR+  "idNota" +
            ");";

}
