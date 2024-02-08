package com.espe.controller;


import com.espe.dao.UsuarioDAOImpl;
import com.espe.idao.IUsuarioDAO;
import com.espe.model.Usuario;
import jakarta.faces.bean.RequestScoped;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

import java.util.List;
import java.util.Map;

// realizar la inyección de dependencia

@Named(value = "usuarioBean")
@RequestScoped

public class UsuarioManagerBean {

    // Crear un objeto de tipo IUsuarioDAO
    IUsuarioDAO usuarioDAO = new UsuarioDAOImpl();

    // Crear un método que devuelva una lista de usuarios
    public List<Usuario> obtenerUsuarios(){
        return usuarioDAO.obtenerUsuario();
    }

    public String editar(int id){
        // Crear un objeto de tipo Usuario
        Usuario oUsuario = new Usuario();
        // Asignar al objeto oUsuario el resultado de buscarUsuario
        oUsuario = usuarioDAO.buscarUsuario(id);
        // Imprimir en consola el objeto oUsuario
        System.out.println(oUsuario);
        // Crear un objeto de tipo Map llamado sessionMap
        Map<String, Object> sessionMap =
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap();

        //se pasan los parámetros del usuario
        sessionMap.put("usuario", oUsuario);
        return "/editar.xhtml";
    }
    // desarrollado por Anyel EC
    // actualiza el usuario utilizando el método editar de UsuarioDAOImpl
    public String actualizar(Usuario usuario){
        usuarioDAO.editar(usuario);
        return "/index.xhtml";
    }

    public String eliminar(int id){
        usuarioDAO.eliminar(id);
        return "/index.xhtml";
    }
    public String regresarIndice() {
        try {
            ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
            externalContext.redirect(externalContext.getRequestContextPath() + "/index.xhtml");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // Para asegurarnos de que JSF no realice una navegación adicional
    }
    // Crear un objeto de tipo Usuario
    private Usuario nuevoUsuario = new Usuario();
    // Crear un método que devuelva un objeto de tipo Usuario

    public Usuario getNuevoUsuario() {
        return nuevoUsuario;
    }

    // establecer un valor para el objeto nuevoUsuario
    public void setNuevoUsuario(Usuario nuevoUsuario) {
        this.nuevoUsuario = nuevoUsuario;
    }

    // Crear un método que guarde un nuevo usuario
    public String guardarNuevoUsuario() {
        usuarioDAO.guardarNuevoUsuario(nuevoUsuario);
        return "/index.xhtml";
    }

}

