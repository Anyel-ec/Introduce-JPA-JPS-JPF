package com.espe.controller;

<<<<<<< HEAD
import com.espe.dao.UsuarioDaoImpl;
=======
import com.espe.dao.UsuarioDaoImp;
>>>>>>> b7ee2a96c208727a01051c02fad6344be1c549f0
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
<<<<<<< HEAD
@Named
public class UsuarioManagerBean {

    IUsuarioDAO usuarioDao = new UsuarioDaoImpl();
    private List<Usuario> listaUsuarios;

    // Getter y setter para listaUsuarios

    public void init() {
        listaUsuarios = usuarioDao.obtenerUsuarios();
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public String editar(int id) {
        Usuario oUsuario = usuarioDao.buscarUsuario(id);
        Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
        sessionMap.put("usuario", oUsuario);
        return "/editar.xhtml";
    }

    public String eliminar(int id) {
        usuarioDao.eliminar(id);
        listaUsuarios = usuarioDao.obtenerUsuarios(); // Actualizar la lista después de eliminar
        return "/index.xhtml";
    }

}
=======
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
>>>>>>> b7ee2a96c208727a01051c02fad6344be1c549f0
