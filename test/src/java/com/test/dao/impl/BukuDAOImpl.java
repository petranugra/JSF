/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.dao.impl;

import com.test.bean.BukuBean;
import com.test.dao.BukuDAO;
import com.test.model.Buku;
import com.test.util.EntityManagerFactoryUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author ASUS ROG GL552JX
 */
public class BukuDAOImpl implements BukuDAO {

    @Override
    public List<Buku> getBukuList() {
        EntityManager em = null;
        List<Buku> list = null;
        try {
            em = EntityManagerFactoryUtil.getEntityManager();
            list = em.createNamedQuery("Buku.findAll").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return list;
    }

    @Override
    public void addBuku(Buku buku) {
        EntityManager em = null;
        try {
            em = EntityManagerFactoryUtil.getEntityManager();
            em.getTransaction().begin();
            em.persist(buku);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    @Override
    public void delBuku() {
        BukuBean p = new BukuBean();
        EntityManager em = null;
        List<Buku> bukuToDelete = new ArrayList();
        for (Buku buku : p.getBukuList()) {
            if (p.getChecked().get(buku.getIdbuku())) {
                bukuToDelete.add(buku);
            }
        }
        try {
            em = EntityManagerFactoryUtil.getEntityManager();
            em.getTransaction().begin();
            em.remove(bukuToDelete);
            em.getTransaction().commit();
            p.getChecked().clear();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

}
