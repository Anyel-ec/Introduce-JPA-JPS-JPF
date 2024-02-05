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

    IUsuarioDAO usuarioDAO = new UsuarioDAOImpl();
    //Prueba de patron DAO
    //Prueba de patron DAO
    //Prueba de patron DAO
    public List<Usuario> obtenerUsuarios(){
        /* List<Usuario> listaUsuarios = new ArrayList<>();

        Usuario u1 = new Usuario();
        u1.setIdUsuario(1);
        u1.setNombreUsuario("Leonardo");
        u1.setApellidoUsuario("Flores");

        Usuario u2 = new Usuario();
        u2.setIdUsuario(2);
        u2.setNombreUsuario("David");
        u2.setApellidoUsuario("Sarango");

        listaUsuarios.add(u1);
        listaUsuarios.add(u2);

        return listaUsuarios; */


        return usuarioDAO.obtenerUsuario();
    }

    public String editar(int id){
        Usuario oUsuario = new Usuario();
        oUsuario = usuarioDAO.buscarUsuario(id);
        System.out.println(oUsuario);

        Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();


        //se pasan los parámetros del usuario
        sessionMap.put("usuario", oUsuario);
        return "/editar.xhtml";
    }

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
    private Usuario nuevoUsuario = new Usuario();

    public Usuario getNuevoUsuario() {
        return nuevoUsuario;
    }

    public void setNuevoUsuario(Usuario nuevoUsuario) {
        this.nuevoUsuario = nuevoUsuario;
    }

    public String guardarNuevoUsuario() {
        usuarioDAO.guardarNuevoUsuario(nuevoUsuario);
        return "/index.xhtml";
    }

}

