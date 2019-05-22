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
@Table(name = "manejobasuras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Manejobasuras.findAll", query = "SELECT m FROM Manejobasuras m")
    , @NamedQuery(name = "Manejobasuras.findByIdmanejoBasura", query = "SELECT m FROM Manejobasuras m WHERE m.idmanejoBasura = :idmanejoBasura")
    , @NamedQuery(name = "Manejobasuras.findByManejoBasura", query = "SELECT m FROM Manejobasuras m WHERE m.manejoBasura = :manejoBasura")})
public class Manejobasuras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_manejoBasura")
    private Integer idmanejoBasura;
    @Size(max = 45)
    @Column(name = "manejoBasura")
    private String manejoBasura;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmanejoBasuras")
    private Collection<Fichasfamiliares> fichasfamiliaresCollection;

    public Manejobasuras() {
    }

    public Manejobasuras(Integer idmanejoBasura) {
        this.idmanejoBasura = idmanejoBasura;
    }

    public Integer getIdmanejoBasura() {
        return idmanejoBasura;
    }

    public void setIdmanejoBasura(Integer idmanejoBasura) {
        this.idmanejoBasura = idmanejoBasura;
    }

    public String getManejoBasura() {
        return manejoBasura;
    }

    public void setManejoBasura(String manejoBasura) {
        this.manejoBasura = manejoBasura;
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
        hash += (idmanejoBasura != null ? idmanejoBasura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Manejobasuras)) {
            return false;
        }
        Manejobasuras other = (Manejobasuras) object;
        if ((this.idmanejoBasura == null && other.idmanejoBasura != null) || (this.idmanejoBasura != null && !this.idmanejoBasura.equals(other.idmanejoBasura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Manejobasuras[ idmanejoBasura=" + idmanejoBasura + " ]";
    }
    
}
