package com.espe.dao;

import com.espe.idao.IUsuarioDAO;
import com.espe.model.JPAUtil;
import com.espe.model.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class UsuarioDAOImpl implements IUsuarioDAO {

    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
    @Override
    public void guardar(Usuario usuario){
        entityManager.getTransaction().begin();
        entityManager.persist(usuario);
        entityManager.getTransaction().commit();
        //JPAUtil.shutdown();

    }

    @Override
    public void editar(Usuario usuario) {
        entityManager.getTransaction().begin();
        entityManager.merge(usuario);
        entityManager.getTransaction().commit();
        //JPAUtil.shutdown();
    }

    @Override
    public Usuario buscarUsuario(int id) {
        Usuario oUsuario = new Usuario();
        oUsuario = entityManager.find(Usuario.class,id);
        //JPAUtil.shutdown();
        return oUsuario;
    }

    @Override
    public List<Usuario> obtenerUsuario() {
        List<Usuario> listaUsuarios;
        Query query = entityManager.createQuery("select u from Usuario u");
        listaUsuarios = query.getResultList();
        return listaUsuarios;
    }

    @Override
    public void eliminar(int id){
        Usuario oUsuario;
        oUsuario = entityManager.find(Usuario.class,id);
        entityManager.getTransaction().begin();
        entityManager.remove(oUsuario);
        entityManager.getTransaction().commit();
    }

    public void guardarNuevoUsuario(Usuario usuario){
        entityManager.getTransaction().begin();
        entityManager.persist(usuario);
        entityManager.getTransaction().commit();
    }

}

