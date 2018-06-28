/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.dao.impl;

import com.test.bean.PenyewaBean;
import com.test.dao.PenyewaDAO;
import com.test.model.Penyewa;
import com.test.util.EntityManagerFactoryUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author ASUS ROG GL552JX
 */
public class PenyewaDAOImpl implements PenyewaDAO {

    @Override
    public List<Penyewa> getPenyewaList() {
        EntityManager em = null;
        List<Penyewa> list = null;
        try {
            em = EntityManagerFactoryUtil.getEntityManager();
            list = em.createNamedQuery("Penyewa.findAll").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return list;
    }

    @Override
    public void addPenyewa(Penyewa penyewa) {
        EntityManager em = null;
        try {
            em = EntityManagerFactoryUtil.getEntityManager();
            em.getTransaction().begin();
            em.persist(penyewa);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    @Override
    public void delPenyewa() {
        PenyewaBean p = new PenyewaBean();
        EntityManager em = null;
        List<Penyewa> penyewaToDelete = new ArrayList();
        for (Penyewa penyewa : p.getPenyewaList()) {
            if (p.getChecked().get(penyewa.getIdpenyewa())) {
                penyewaToDelete.add(penyewa);
            }
        }
        try {
            em = EntityManagerFactoryUtil.getEntityManager();
            em.getTransaction().begin();
            em.remove(penyewaToDelete);
            em.getTransaction().commit();
            p.getChecked().clear();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

}
