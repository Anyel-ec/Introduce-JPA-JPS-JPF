package com.espe.model;

<<<<<<< HEAD
import jakarta.persistence.EntityManager;
=======
>>>>>>> b7ee2a96c208727a01051c02fad6344be1c549f0
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
<<<<<<< HEAD

=======
>>>>>>> b7ee2a96c208727a01051c02fad6344be1c549f0
    // Nombre de la unidad de persistencia
    private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE_UNIT";
    private static EntityManagerFactory factory; //para crear los gestores de entidades
    // para obtener la factoria de entidades
    public static EntityManagerFactory getEntityManagerFactory() {
        if (factory == null) { // si no existe la factoria de entidades
<<<<<<< HEAD

=======
>>>>>>> b7ee2a96c208727a01051c02fad6344be1c549f0
            // se crea la factoria de entidades
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return factory; // se retorna la factoria de entidades
    }
    // desarrollado por Anyel EC
    public static void shutdown() { // para cerrar la factoria de entidades
        if (factory != null) { // si existe la factoria de entidades
            factory.close(); // se cierra la factoria de entidades
        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> b7ee2a96c208727a01051c02fad6344be1c549f0
