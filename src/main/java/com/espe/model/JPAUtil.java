package com.espe.model;


import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
    // Nombre de la unidad de persistencia
    private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE_UNIT";
    private static EntityManagerFactory factory; //para crear los gestores de entidades
    // para obtener la factoria de entidades
    public static EntityManagerFactory getEntityManagerFactory() {
        if (factory == null) { // si no existe la factoria de entidades

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
}
