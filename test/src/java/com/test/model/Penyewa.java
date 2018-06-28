/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ASUS ROG GL552JX
 */
@Entity
@Table(name = "penyewa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Penyewa.findAll", query = "SELECT p FROM Penyewa p")
    , @NamedQuery(name = "Penyewa.findByIdpenyewa", query = "SELECT p FROM Penyewa p WHERE p.idpenyewa = :idpenyewa")
    , @NamedQuery(name = "Penyewa.findByNama", query = "SELECT p FROM Penyewa p WHERE p.nama = :nama")
    , @NamedQuery(name = "Penyewa.findByAlamat", query = "SELECT p FROM Penyewa p WHERE p.alamat = :alamat")})
public class Penyewa implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpenyewa")
    private List<Transaksi> transaksiList;



    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idpenyewa")
    private String idpenyewa;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "alamat")
    private String alamat;

    public Penyewa() {
    }

    public Penyewa(String idpenyewa) {
        this.idpenyewa = idpenyewa;
    }

    public Penyewa(String idpenyewa, String nama, String alamat) {
        this.idpenyewa = idpenyewa;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getIdpenyewa() {
        return idpenyewa;
    }

    public void setIdpenyewa(String idpenyewa) {
        this.idpenyewa = idpenyewa;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpenyewa != null ? idpenyewa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Penyewa)) {
            return false;
        }
        Penyewa other = (Penyewa) object;
        if ((this.idpenyewa == null && other.idpenyewa != null) || (this.idpenyewa != null && !this.idpenyewa.equals(other.idpenyewa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Penyewa[ idpenyewa=" + idpenyewa + " ]";
    }

    @XmlTransient
    public List<Transaksi> getTransaksiList() {
        return transaksiList;
    }

    public void setTransaksiList(List<Transaksi> transaksiList) {
        this.transaksiList = transaksiList;
    }

   

}
