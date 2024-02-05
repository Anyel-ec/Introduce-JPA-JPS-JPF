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
<<<<<<< HEAD
    private Integer id_usuario;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String cedula;
    @Column
=======
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "cedula")
    private String cedula;
    @Column(name = "ciudad")
>>>>>>> b7ee2a96c208727a01051c02fad6344be1c549f0
    private String ciudad;

    public Usuario() {
    }

<<<<<<< HEAD
    public Usuario(Integer id_usuario, String nombre, String apellido, String cedula, String ciudad) {
        this.id_usuario = id_usuario;
=======
    public Usuario(Integer id, String nombre, String apellido, String cedula, String ciudad) {
        this.id = id;
>>>>>>> b7ee2a96c208727a01051c02fad6344be1c549f0
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.ciudad = ciudad;
    }

<<<<<<< HEAD
    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
=======
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
>>>>>>> b7ee2a96c208727a01051c02fad6344be1c549f0
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
<<<<<<< HEAD
                "id_usuario=" + id_usuario +
=======
                "id=" + id +
>>>>>>> b7ee2a96c208727a01051c02fad6344be1c549f0
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> b7ee2a96c208727a01051c02fad6344be1c549f0
