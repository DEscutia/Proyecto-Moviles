package com.example.proyecto;

public class Archivos {
    private Integer id;
    private String Ruta;
    private String Descripcion;
    private Integer idNota;

    public Archivos(Integer id, String ruta, String descripcion, Integer idNota) {
        this.id = id;
        Ruta = ruta;
        Descripcion = descripcion;
        this.idNota=idNota;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String ruta) {
        Ruta = ruta;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Integer getIdNota() {
        return idNota;
    }

    public void setIdNota(Integer idNota) {
        this.idNota = idNota;
    }
}
