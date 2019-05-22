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
@Table(name = "riesgosvivienda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Riesgosvivienda.findAll", query = "SELECT r FROM Riesgosvivienda r")
    , @NamedQuery(name = "Riesgosvivienda.findByIdriesgoVivienda", query = "SELECT r FROM Riesgosvivienda r WHERE r.idriesgoVivienda = :idriesgoVivienda")
    , @NamedQuery(name = "Riesgosvivienda.findByRiesgoVivienda", query = "SELECT r FROM Riesgosvivienda r WHERE r.riesgoVivienda = :riesgoVivienda")})
public class Riesgosvivienda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_riesgoVivienda")
    private Integer idriesgoVivienda;
    @Size(max = 45)
    @Column(name = "riesgoVivienda")
    private String riesgoVivienda;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idriesgosVivienda")
    private Collection<Fichasfamiliares> fichasfamiliaresCollection;

    public Riesgosvivienda() {
    }

    public Riesgosvivienda(Integer idriesgoVivienda) {
        this.idriesgoVivienda = idriesgoVivienda;
    }

    public Integer getIdriesgoVivienda() {
        return idriesgoVivienda;
    }

    public void setIdriesgoVivienda(Integer idriesgoVivienda) {
        this.idriesgoVivienda = idriesgoVivienda;
    }

    public String getRiesgoVivienda() {
        return riesgoVivienda;
    }

    public void setRiesgoVivienda(String riesgoVivienda) {
        this.riesgoVivienda = riesgoVivienda;
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
        hash += (idriesgoVivienda != null ? idriesgoVivienda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Riesgosvivienda)) {
            return false;
        }
        Riesgosvivienda other = (Riesgosvivienda) object;
        if ((this.idriesgoVivienda == null && other.idriesgoVivienda != null) || (this.idriesgoVivienda != null && !this.idriesgoVivienda.equals(other.idriesgoVivienda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Riesgosvivienda[ idriesgoVivienda=" + idriesgoVivienda + " ]";
    }
    
}
