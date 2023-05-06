package com.latam.alura.tienda.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtils {
    private static EntityManagerFactory FACTORY= Persistence.createEntityManagerFactory("tienda");

    public static EntityManager getEntityManager(){
        return FACTORY.createEntityManager();
    }
}
