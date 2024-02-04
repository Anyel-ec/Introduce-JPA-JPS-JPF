package com.espe.dao;

import com.espe.idao.IUsuarioDAO;
import com.espe.model.JPAUtil;
import com.espe.model.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class UsuarioDaoImp implements IUsuarioDAO {
    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();

    @Override
    public void guardar(Usuario usuario) {
        // Iniciar una transacción
        entityManager.getTransaction().begin();
        // Guardar el objeto usuario en la base de datos
        entityManager.persist(usuario);
        // Terminar la transacción
        entityManager.getTransaction().commit();
        // Cerrar la conexión
        JPAUtil.shutdown();
    }

    @Override
    public void editar(Usuario usuario) {
        // Iniciar una transacción
        entityManager.getTransaction().begin();
        // Editar el objeto usuario en la base de datos
        entityManager.merge(usuario);
        // Terminar la transacción
        entityManager.getTransaction().commit();
        // Cerrar la conexión
        JPAUtil.shutdown();
    }

    @Override
    public Usuario buscarUsuario(int id) {
        // crear un nuevo objeto usuario
        Usuario oUsuario = new Usuario();
        // buscar el objeto usuario en la base de datos por su id
        oUsuario = entityManager.find(Usuario.class, id);
        // Cerrar la conexión
        JPAUtil.shutdown();
        // retornar el objeto usuario
        return oUsuario;
        // desarrollado por Anyel EC
    }

    @Override
    public List<Usuario> listar() {
        // crear una lista de objetos usuario
        List <Usuario> listaUsuarios;
        // crear una consulta para obtener todos los objetos usuario
        Query query = entityManager.createQuery("SELECT u FROM Usuario u");
        // desarrollado por Anyel EC
        listaUsuarios = query.getResultList();
        // retornar la lista de objetos usuario
        return listaUsuarios;
    }
}
