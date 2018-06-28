/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.service.impl;

import com.test.dao.TransaksiDAO;
import com.test.dao.impl.TransaksiDAOImpl;
import com.test.model.Transaksi;
import com.test.service.TransaksiService;
import java.util.List;

/**
 *
 * @author ASUS ROG GL552JX
 */
public class TransaksiServiceImpl implements TransaksiService {

    TransaksiDAO transaksiDAO = new TransaksiDAOImpl();

    @Override
    public List<Transaksi> getTransaksiList() {
        return transaksiDAO.getTransaksiList();
    }

    @Override
    public void addTransaksi(Transaksi transaksi) {
        transaksiDAO.addTransaksi(transaksi);
    }

    @Override
    public void delTransaksi() {

    }

}
