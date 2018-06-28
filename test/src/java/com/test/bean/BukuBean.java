/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.bean;

import com.test.model.Buku;
import com.test.service.BukuService;
import com.test.service.impl.BukuServiceImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author ASUS ROG GL552JX
 */
@ManagedBean
@RequestScoped
public class BukuBean {

    private List<Buku> bukuList = new ArrayList<Buku>();
    private BukuService bukuService = new BukuServiceImpl();
    private Map<String, Boolean> checked = new HashMap<String, Boolean>();
    private Buku buku = new Buku();

    public String addBuku() {
        bukuService.addBuku(buku);
        return "list";
    }

    public Map<String, Boolean> getChecked() {
        return checked;
    }

    public void setChecked(Map<String, Boolean> checked) {
        this.checked = checked;
    }

    public String delBuku() {
        bukuService.delBuku();
        return "list";
    }

    public List<Buku> getBukuList() {
        bukuList = bukuService.getBukuList();
        return bukuList;
    }

    public void setBukuList(List<Buku> bukuList) {
        this.bukuList = bukuList;
    }

    public BukuService getBukuService() {
        return bukuService;
    }

    public void setBukuService(BukuService bukuService) {
        this.bukuService = bukuService;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public BukuBean() {

    }

}
