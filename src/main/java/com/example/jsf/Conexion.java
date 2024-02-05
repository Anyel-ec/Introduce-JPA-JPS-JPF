package com.example.jsf;

import com.espe.dao.UsuarioDAOImpl;
import com.espe.idao.IUsuarioDAO;
import com.espe.model.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;

public class Conexion {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;

        try {
            // Crear el EntityManagerFactory utilizando la unidad de persistencia definida en el archivo persistence.xml
            entityManagerFactory = Persistence.createEntityManagerFactory("PERSISTENCE_UNIT");

            // Crear el EntityManager
            entityManager = entityManagerFactory.createEntityManager();

            // Verificar la conexión imprimiendo un mensaje
            if (entityManager.isOpen()) {
                System.out.println("Conexión a la base de datos establecida correctamente.");

                // Obtener la lista de usuarios desde la base de datos
                IUsuarioDAO usuarioDao = new UsuarioDAOImpl();
                List<Usuario> listaUsuarios = usuarioDao.obtenerUsuario();

                // Imprimir la información de los usuarios en la consola
                for (Usuario usuario : listaUsuarios) {
                    System.out.println("ID: " + usuario.getIdUsuario());
                    System.out.println("Nombre: " + usuario.getNombreUsuario());
                    System.out.println("Apellido: " + usuario.getNombreUsuario());
                    System.out.println("Cédula: " + usuario.getCedulaUsuario());
                    System.out.println("Ciudad: " + usuario.getCiudadUsuario());
                    System.out.println("-----------------------------");
                }
            } else {
                System.out.println("No se pudo establecer la conexión a la base de datos.");
            }
        } finally {
            // Cerrar el EntityManager y EntityManagerFactory
            if (entityManager != null) {
                entityManager.close();
            }
            if (entityManagerFactory != null) {
                entityManagerFactory.close();
            }
        }
    }
}
