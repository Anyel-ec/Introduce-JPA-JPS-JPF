package com.espe.controller;

import com.espe.dao.UsuarioDaoImpl;
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