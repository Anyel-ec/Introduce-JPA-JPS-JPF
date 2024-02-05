package com.espe.controller;

import com.espe.dao.UsuarioDaoImp;
import com.espe.idao.IUsuarioDAO;
import com.espe.model.Usuario;
import jakarta.faces.bean.RequestScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

// realizar la inyección de dependencia
@RequestScoped // Alcance de la clase
// Nombre con el que se va a referenciar la clase
@Named(value = "test")
public class Test {
    public List<Usuario> obtenerUsuarios(){
        // crear una lista de objetos usuario
        List<Usuario> listaUsuarios = new ArrayList<>();
        Usuario u1 = new Usuario();
        // establecer los valores de los atributos del objeto usuario
        u1.setNombre("Anyel");
        u1.setApellido("EC");
        u1.setCedula("1234567890");
        u1.setCiudad("Santo Domingo");

        Usuario u2 = new Usuario();
        u2.setNombre("Juan");
        u2.setApellido("Perez");
        u2.setCedula("0987654321");
        u2.setCiudad("Guayaquil");

        // agregar el objeto usuario a la lista de usuarios
        listaUsuarios.add(u1);
        listaUsuarios.add(u2);
        // retornar la lista de usuarios

        return listaUsuarios;
    }


}
