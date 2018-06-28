/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.dao.impl;

import com.test.dao.TransaksiDAO;
import com.test.model.Transaksi;
import com.test.util.EntityManagerFactoryUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author ASUS ROG GL552JX
 */
public class TransaksiDAOImpl implements TransaksiDAO{

    @Override
    public List<Transaksi> getTransaksiList() {
        EntityManager em = null;
        List<Transaksi> list = null;
        try {
            em = EntityManagerFactoryUtil.getEntityManager();
            list = em.createNamedQuery("Transaksi.findAll").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return list;
    }

    @Override
    public void addTransaksi(Transaksi transaksi) {
      
    }

    @Override
    public void delTransaksi() {
        
    }
    
}
