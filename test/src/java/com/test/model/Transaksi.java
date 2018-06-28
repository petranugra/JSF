/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS ROG GL552JX
 */
@Entity
@Table(name = "transaksi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transaksi.findAll", query = "SELECT t FROM Transaksi t")
    , @NamedQuery(name = "Transaksi.findByIdtransaksi", query = "SELECT t FROM Transaksi t WHERE t.idtransaksi = :idtransaksi")})
public class Transaksi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idtransaksi")
    private String idtransaksi;
    @JoinColumn(name = "idbuku", referencedColumnName = "idbuku")
    @ManyToOne(optional = false)
    private Buku idbuku;
    @JoinColumn(name = "idpenyewa", referencedColumnName = "idpenyewa")
    @ManyToOne(optional = false)
    private Penyewa idpenyewa;

    public Transaksi() {
    }

    public Transaksi(String idtransaksi) {
        this.idtransaksi = idtransaksi;
    }

    public String getIdtransaksi() {
        return idtransaksi;
    }

    public void setIdtransaksi(String idtransaksi) {
        this.idtransaksi = idtransaksi;
    }

    public Buku getIdbuku() {
        return idbuku;
    }

    public void setIdbuku(Buku idbuku) {
        this.idbuku = idbuku;
    }

    public Penyewa getIdpenyewa() {
        return idpenyewa;
    }

    public void setIdpenyewa(Penyewa idpenyewa) {
        this.idpenyewa = idpenyewa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtransaksi != null ? idtransaksi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaksi)) {
            return false;
        }
        Transaksi other = (Transaksi) object;
        if ((this.idtransaksi == null && other.idtransaksi != null) || (this.idtransaksi != null && !this.idtransaksi.equals(other.idtransaksi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.test.model.Transaksi[ idtransaksi=" + idtransaksi + " ]";
    }
    
}
