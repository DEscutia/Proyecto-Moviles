package com.example.proyecto;

import java.sql.Time;
import java.util.Date;

public class TareasNotas {
    private Integer id;
    private String Titulo;
    private String Descripcion;
    private String FechaCreado;
    private String FechaLimite;
    private String HoraLimite;
    private int cumplida;
    private int tarea;

    public TareasNotas(Integer id, String titulo, String descripcion, String fechaCreado, String fechaLimite,String Horalimite,int tarea) {
        this.id = id;
        Titulo = titulo;
        Descripcion = descripcion;
        FechaCreado = fechaCreado;
        FechaLimite = fechaLimite;
        this.HoraLimite=Horalimite;
        this.tarea = tarea;

    }

    public TareasNotas(Integer id, String titulo, String descripcion, String fechaCreado, int cumplida, int tarea) {
        this.id = id;
        Titulo = titulo;
        Descripcion = descripcion;
        FechaCreado = fechaCreado;
        this.cumplida = cumplida;
        this.tarea = tarea;
    }

    public TareasNotas(Integer id,String titulo, String descripcion,int tarea){
        this.id=id;
        this.Titulo=titulo;
        this.Descripcion=descripcion;
        this.tarea=tarea;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getFechaCreado() {
        return FechaCreado;
    }

    public void setFechaCreado(String fechaCreado) {
        FechaCreado = fechaCreado;
    }

    public String getFechaLimite() {
        return FechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        FechaLimite = fechaLimite;
    }

    public String getHoraLimite() {
        return HoraLimite;
    }

    public void setHoraLimite(String horaLimite) {
        HoraLimite = horaLimite;
    }

    public int getCumplida() {
        return cumplida;
    }

    public void setCumplida(int cumplida) {
        this.cumplida = cumplida;
    }

    public int getTarea() {
        return tarea;
    }

    public void setTarea(int tarea) {
        this.tarea = tarea;
    }




}
