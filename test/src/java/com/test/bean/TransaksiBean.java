/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.bean;

import com.test.model.Transaksi;
import com.test.service.TransaksiService;
import com.test.service.impl.TransaksiServiceImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author ASUS ROG GL552JX
 */
@ManagedBean
@RequestScoped
public class TransaksiBean {

     private List<Transaksi> transaksiList = new ArrayList<Transaksi>();
    private TransaksiService transaksiService = new TransaksiServiceImpl();
    private Map<String, Boolean> checked = new HashMap<String, Boolean>();
    private Transaksi Transaksi = new Transaksi();
    public TransaksiBean() {
    }

    public List<Transaksi> getTransaksiList() {
        return transaksiList;
    }

    public void setTransaksiList(List<Transaksi> transaksiList) {
        this.transaksiList = transaksiList;
    }

    public TransaksiService getTransaksiService() {
        return transaksiService;
    }

    public void setTransaksiService(TransaksiService transaksiService) {
        this.transaksiService = transaksiService;
    }

    public Map<String, Boolean> getChecked() {
        return checked;
    }

    public void setChecked(Map<String, Boolean> checked) {
        this.checked = checked;
    }

    public Transaksi getTransaksi() {
        return Transaksi;
    }

    public void setTransaksi(Transaksi Transaksi) {
        this.Transaksi = Transaksi;
    }
    
}
