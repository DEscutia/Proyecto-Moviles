package com.example.proyecto;

import java.sql.Time;

public class Recordatorios {
    private Integer id;
    private String Fecha;
    private Time hora;
    private Integer idTarea;

    public Recordatorios(Integer id, String fecha, Time hora, Integer idTarea) {
        this.id = id;
        Fecha = fecha;
        this.hora = hora;
        this.idTarea = idTarea;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Integer getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(Integer idTarea) {
        this.idTarea = idTarea;
    }
}
