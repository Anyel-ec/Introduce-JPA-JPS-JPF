package com.example.jsf;

import com.espe.dao.UsuarioDaoImpl;
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
                IUsuarioDAO usuarioDao = new UsuarioDaoImpl();
                List<Usuario> listaUsuarios = usuarioDao.obtenerUsuarios();

                // Imprimir la información de los usuarios en la consola
                for (Usuario usuario : listaUsuarios) {
                    System.out.println("ID: " + usuario.getId_usuario());
                    System.out.println("Nombre: " + usuario.getNombre());
                    System.out.println("Apellido: " + usuario.getApellido());
                    System.out.println("Cédula: " + usuario.getCedula());
                    System.out.println("Ciudad: " + usuario.getCiudad());
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
