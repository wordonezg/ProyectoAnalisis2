package com.example.demoserviciodonacion.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name= "donaciones")
public class Donacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="donador")
    private String donador;
    @Column(name="donatario")
    private String donatario;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="fecha")
    private String fecha;
    @Column(name="numero_cuotas")
    private Double numero_cuotas;
    @Column(name="valor_cuota")
    private Double valor_cuota;
    @Column(name="total_cuota")
    private Double total_cuota;

    public Donacion() {
    }

    public Donacion(Long id, String donador, String donatario, String descripcion, String fecha, Double numero_cuotas, Double valor_cuota, Double total_cuota) {
        this.id = id;
        this.donador = donador;
        this.donatario = donatario;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.numero_cuotas = numero_cuotas;
        this.valor_cuota = valor_cuota;
        this.total_cuota = total_cuota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDonador() {
        return donador;
    }

    public void setDonador(String donador) {
        this.donador = donador;
    }

    public String getDonatario() {
        return donatario;
    }

    public void setDonatario(String donatario) {
        this.donatario = donatario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getNumero_cuotas() {
        return numero_cuotas;
    }

    public void setNumero_cuotas(Double numero_cuotas) {
        this.numero_cuotas = numero_cuotas;
    }

    public Double getValor_cuota() {
        return valor_cuota;
    }

    public void setValor_cuota(Double valor_cuota) {
        this.valor_cuota = valor_cuota;
    }

    public Double getTotal_cuota() {
        return total_cuota;
    }

    public void setTotal_cuota(Double total_cuota) {
        this.total_cuota = total_cuota;
    }
}
