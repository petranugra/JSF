/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.bean;

import com.test.model.Penyewa;
import com.test.service.PenyewaService;
import com.test.service.impl.PenyewaServiceImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author ASUS ROG GL552JX
 */
@ManagedBean
@ViewScoped
public class PenyewaBean {

    private List<Penyewa> penyewaList = new ArrayList<Penyewa>();
    private PenyewaService penyewaService = new PenyewaServiceImpl();
    private Map<String, Boolean> checked = new HashMap<String, Boolean>();
    private Penyewa penyewa = new Penyewa();

    public PenyewaBean() {
    }

    public String addPenyewa() {
        penyewaService.addPenyewa(penyewa);
        return "list";
    }

    public String delPenyewa() {
        penyewaService.delPenyewa();
        return "list";
    }

    public List<Penyewa> getPenyewaList() {
        penyewaList = penyewaService.getPenyewaList();
        return penyewaList;
    }

    public void setPenyewaList(List<Penyewa> penyewaList) {
        this.penyewaList = penyewaList;
    }

    public PenyewaService getPenyewaService() {
        return penyewaService;
    }

    public void setPenyewaService(PenyewaService penyewaService) {
        this.penyewaService = penyewaService;
    }

    public Penyewa getPenyewa() {
        return penyewa;
    }

    public void setPenyewa(Penyewa penyewa) {
        this.penyewa = penyewa;
    }

    public Map<String, Boolean> getChecked() {
        return checked;
    }

    public void setChecked(Map<String, Boolean> checked) {
        this.checked = checked;
    }

}
