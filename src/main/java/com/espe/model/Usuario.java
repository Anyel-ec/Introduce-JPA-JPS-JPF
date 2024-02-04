package com.espe.model;

import jakarta.persistence.*;

// Tabla de usuario
@Entity
@Table(name = "usuario")
public class Usuario {
    // Atributos de la tabla usuario
    @Id
    // Generar el id de manera automatica
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String ciudad;

    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String apellido, String cedula, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.ciudad = ciudad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
