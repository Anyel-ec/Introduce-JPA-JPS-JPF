package com.espe.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    @Column
    private String nombreUsuario;
    @Column
    private String apellidoUsuario;
    @Column
    private String cedulaUsuario;
    @Column
    private String ciudadUsuario;

    public Usuario() {
    }

    public Usuario(Integer idUsuario, String nombreUsuario, String apellidoUsuario, String cedulaUsuario, String ciudadUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.cedulaUsuario = cedulaUsuario;
        this.ciudadUsuario = ciudadUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public String getCiudadUsuario() {
        return ciudadUsuario;
    }

    public void setCiudadUsuario(String ciudadUsuario) {
        this.ciudadUsuario = ciudadUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", apellidoUsuario='" + apellidoUsuario + '\'' +
                ", cedulaUsuario='" + cedulaUsuario + '\'' +
                ", ciudadUsuario='" + ciudadUsuario + '\'' +
                '}';
    }

}
