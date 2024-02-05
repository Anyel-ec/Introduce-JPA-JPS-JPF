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
@Named(value = "usuarioBean")
public class UsuarioManagerBean {

    IUsuarioDAO usuarioDao = new UsuarioDaoImp();
    public List<Usuario> obtenerUsuarios(){
        return usuarioDao.obtenerUsuarios();
    }

    public String editar(int id){
        Usuario oUsuario = new Usuario();
        oUsuario = usuarioDao.buscarUsuario(id);
        System.out.println("Usuario a editar"+ oUsuario.getNombre());

        //CREAR UNA COLECCIÓN DE TIPO MAP
        Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
        // return "/editar.xhtml";
        sessionMap.put("usuario", oUsuario);
        return "/index.xhtml";
    }

    public String actualizar(Usuario usuario){
        usuarioDao.editar(usuario);
        return "/index.xhtml";
    }

    /*public String eliminar(int id){
        usuarioDao.eliminar(id);
        System.out.println("Usuario eliminado con éxito");
        return "/index.xhtml";
    }*/

}
