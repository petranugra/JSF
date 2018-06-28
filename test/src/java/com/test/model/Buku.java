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
@Table(name = "buku")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Buku.findAll", query = "SELECT b FROM Buku b")
    , @NamedQuery(name = "Buku.findByIdbuku", query = "SELECT b FROM Buku b WHERE b.idbuku = :idbuku")
    , @NamedQuery(name = "Buku.findByJudul", query = "SELECT b FROM Buku b WHERE b.judul = :judul")
    , @NamedQuery(name = "Buku.findByKategori", query = "SELECT b FROM Buku b WHERE b.kategori = :kategori")
    , @NamedQuery(name = "Buku.findByHarga", query = "SELECT b FROM Buku b WHERE b.harga = :harga")})
public class Buku implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idbuku")
    private List<Transaksi> transaksiList;

  

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idbuku")
    private String idbuku;
    @Basic(optional = false)
    @Column(name = "judul")
    private String judul;
    @Basic(optional = false)
    @Column(name = "kategori")
    private String kategori;
    @Basic(optional = false)
    @Column(name = "harga")
    private int harga;

    public Buku() {
    }

    public Buku(String idbuku) {
        this.idbuku = idbuku;
    }

    public Buku(String idbuku, String judul, String kategori, int harga) {
        this.idbuku = idbuku;
        this.judul = judul;
        this.kategori = kategori;
        this.harga = harga;
    }

    public String getIdbuku() {
        return idbuku;
    }

    public void setIdbuku(String idbuku) {
        this.idbuku = idbuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbuku != null ? idbuku.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Buku)) {
            return false;
        }
        Buku other = (Buku) object;
        if ((this.idbuku == null && other.idbuku != null) || (this.idbuku != null && !this.idbuku.equals(other.idbuku))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.test.model.Buku[ idbuku=" + idbuku + " ]";
    }

    @XmlTransient
    public List<Transaksi> getTransaksiList() {
        return transaksiList;
    }

    public void setTransaksiList(List<Transaksi> transaksiList) {
        this.transaksiList = transaksiList;
    }

  

}
