/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.service.impl;

import com.test.dao.PenyewaDAO;
import com.test.dao.impl.PenyewaDAOImpl;
import com.test.model.Penyewa;
import com.test.service.PenyewaService;
import java.util.List;

/**
 *
 * @author ASUS ROG GL552JX
 */
public class PenyewaServiceImpl implements PenyewaService {

    PenyewaDAO penyewaDAO = new PenyewaDAOImpl();

    @Override
    public List<Penyewa> getPenyewaList() {
        return penyewaDAO.getPenyewaList();
    }

    @Override
    public void addPenyewa(Penyewa penyewa) {
        penyewaDAO.addPenyewa(penyewa);
    }

    @Override
    public void delPenyewa() {
    }

}
