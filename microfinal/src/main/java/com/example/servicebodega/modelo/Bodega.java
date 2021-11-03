package com.example.servicebodega.modelo;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="bodega")
public class Bodega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String tipo;
    private String embalaje;
    private String precio;
    private String stock;


    @Transient
    private Integer port;

    public Integer getPort() {
        return port;
    }

    public Bodega(){

    }
    public Bodega(int id, String nombre, String tipo, String embalaje, String precio, String stock) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.embalaje = embalaje;
        this.precio = precio;
        this.stock = stock;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEmbalaje() {
        return embalaje;
    }

    public void setEmbalaje(String embalaje) {
        this.embalaje = embalaje;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
