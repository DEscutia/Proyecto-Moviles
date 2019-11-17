package com.example.proyecto;

import java.sql.Time;
import java.util.Date;

public class TareasNotas {
    private Integer id;
    private String Titulo;
    private String Descripcion;
    private Date FechaCreado;
    private String FechaLimite;
    private Time HoraLimite;
    private int cumplida;
    private int tarea;

    public TareasNotas(Integer id, String titulo, String descripcion, Date fechaCreado, String fechaLimite, Time horaLimite, int cumplida, int tarea) {
        this.id = id;
        Titulo = titulo;
        Descripcion = descripcion;
        FechaCreado = fechaCreado;
        FechaLimite = fechaLimite;
        HoraLimite = horaLimite;
        this.cumplida = cumplida;
        this.tarea = tarea;
    }

    public TareasNotas(Integer id, String titulo, String descripcion, Date fechaCreado, int cumplida, int tarea) {
        this.id = id;
        Titulo = titulo;
        Descripcion = descripcion;
        FechaCreado = fechaCreado;
        this.cumplida = cumplida;
        this.tarea = tarea;
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

    public Date getFechaCreado() {
        return FechaCreado;
    }

    public void setFechaCreado(Date fechaCreado) {
        FechaCreado = fechaCreado;
    }

    public String getFechaLimite() {
        return FechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        FechaLimite = fechaLimite;
    }

    public Time getHoraLimite() {
        return HoraLimite;
    }

    public void setHoraLimite(Time horaLimite) {
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
