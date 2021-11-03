package com.example.demoserviciocompra.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name= "compras")
public class Compra implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="cliente")
    private String cliente;
    @Column(name="producto")
    private String producto;
    @Column(name="fecha_compra")
    private String fecha_compra;
    @Column(name="numero_cuotas")
    private Integer numero_cuotas;
    @Column(name="valor_cuota")
    private Double valor_cuota;
    @Column(name="recargo")
    private Double recargo;
    @Column(name="total_cuota")
    private Double total_cuotan;

    public Compra() {
    }

    public Compra(Long id, String cliente, String producto, String fecha_compra, Integer numero_cuotas, Double valor_cuota, Double recargo, Double total_cuotan) {
        this.id = id;
        this.cliente = cliente;
        this.producto = producto;
        this.fecha_compra = fecha_compra;
        this.numero_cuotas = numero_cuotas;
        this.valor_cuota = valor_cuota;
        this.recargo = recargo;
        this.total_cuotan = total_cuotan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public Integer getNumero_cuotas() {
        return numero_cuotas;
    }

    public void setNumero_cuotas(Integer numero_cuotas) {
        this.numero_cuotas = numero_cuotas;
    }

    public Double getValor_cuota() {
        return valor_cuota;
    }

    public void setValor_cuota(Double valor_cuota) {
        this.valor_cuota = valor_cuota;
    }

    public Double getRecargo() {
        return recargo;
    }

    public void setRecargo(Double recargo) {
        this.recargo = recargo;
    }

    public Double getTotal_cuotan() {
        return total_cuotan;
    }

    public void setTotal_cuotan(Double total_cuotan) {
        this.total_cuotan = total_cuotan;
    }
}
