/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ASUS ROG GL552JX
 */
public class EntityManagerFactoryUtil {
    private static EntityManagerFactory entityManagerFactory;
    public static EntityManager getEntityManager(){
        if(entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("testPU");
        }
        return entityManagerFactory.createEntityManager();
    }
}
