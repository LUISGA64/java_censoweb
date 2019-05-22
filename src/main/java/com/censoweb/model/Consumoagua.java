/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author luisg
 */
@Entity
@Table(name = "consumoagua")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Consumoagua.findAll", query = "SELECT c FROM Consumoagua c")
    , @NamedQuery(name = "Consumoagua.findByIdconsumoAgua", query = "SELECT c FROM Consumoagua c WHERE c.idconsumoAgua = :idconsumoAgua")
    , @NamedQuery(name = "Consumoagua.findByConsumoAgua", query = "SELECT c FROM Consumoagua c WHERE c.consumoAgua = :consumoAgua")})
public class Consumoagua implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_consumoAgua")
    private Integer idconsumoAgua;
    @Size(max = 45)
    @Column(name = "consumoAgua")
    private String consumoAgua;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idconsumoAgua")
    private Collection<Fichasfamiliares> fichasfamiliaresCollection;

    public Consumoagua() {
    }

    public Consumoagua(Integer idconsumoAgua) {
        this.idconsumoAgua = idconsumoAgua;
    }

    public Integer getIdconsumoAgua() {
        return idconsumoAgua;
    }

    public void setIdconsumoAgua(Integer idconsumoAgua) {
        this.idconsumoAgua = idconsumoAgua;
    }

    public String getConsumoAgua() {
        return consumoAgua;
    }

    public void setConsumoAgua(String consumoAgua) {
        this.consumoAgua = consumoAgua;
    }

    @XmlTransient
    public Collection<Fichasfamiliares> getFichasfamiliaresCollection() {
        return fichasfamiliaresCollection;
    }

    public void setFichasfamiliaresCollection(Collection<Fichasfamiliares> fichasfamiliaresCollection) {
        this.fichasfamiliaresCollection = fichasfamiliaresCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idconsumoAgua != null ? idconsumoAgua.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consumoagua)) {
            return false;
        }
        Consumoagua other = (Consumoagua) object;
        if ((this.idconsumoAgua == null && other.idconsumoAgua != null) || (this.idconsumoAgua != null && !this.idconsumoAgua.equals(other.idconsumoAgua))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Consumoagua[ idconsumoAgua=" + idconsumoAgua + " ]";
    }
    
}
