/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.dao;

import com.test.model.Penyewa;
import java.util.List;

/**
 *
 * @author ASUS ROG GL552JX
 */
public interface PenyewaDAO {

    public List<Penyewa> getPenyewaList();

    public void addPenyewa(Penyewa penyewa);

    public void delPenyewa();
}
