/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.service.impl;

import com.test.dao.BukuDAO;
import com.test.dao.impl.BukuDAOImpl;
import com.test.model.Buku;
import com.test.service.BukuService;
import java.util.List;

/**
 *
 * @author ASUS ROG GL552JX
 */
public class BukuServiceImpl implements BukuService {

    BukuDAO bukuDAO = new BukuDAOImpl();

    @Override
    public List<Buku> getBukuList() {
        return bukuDAO.getBukuList();
    }

    @Override
    public void addBuku(Buku buku) {
        bukuDAO.addBuku(buku);
    }

    @Override
    public void delBuku() {
    }

}
