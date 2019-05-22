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
@Table(name = "eliminarexcretas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Eliminarexcretas.findAll", query = "SELECT e FROM Eliminarexcretas e")
    , @NamedQuery(name = "Eliminarexcretas.findByIdeliminarExcretas", query = "SELECT e FROM Eliminarexcretas e WHERE e.ideliminarExcretas = :ideliminarExcretas")
    , @NamedQuery(name = "Eliminarexcretas.findByEliminaExcreta", query = "SELECT e FROM Eliminarexcretas e WHERE e.eliminaExcreta = :eliminaExcreta")})
public class Eliminarexcretas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_eliminarExcretas")
    private Integer ideliminarExcretas;
    @Size(max = 45)
    @Column(name = "eliminaExcreta")
    private String eliminaExcreta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ideliminaExcretas")
    private Collection<Fichasfamiliares> fichasfamiliaresCollection;

    public Eliminarexcretas() {
    }

    public Eliminarexcretas(Integer ideliminarExcretas) {
        this.ideliminarExcretas = ideliminarExcretas;
    }

    public Integer getIdeliminarExcretas() {
        return ideliminarExcretas;
    }

    public void setIdeliminarExcretas(Integer ideliminarExcretas) {
        this.ideliminarExcretas = ideliminarExcretas;
    }

    public String getEliminaExcreta() {
        return eliminaExcreta;
    }

    public void setEliminaExcreta(String eliminaExcreta) {
        this.eliminaExcreta = eliminaExcreta;
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
        hash += (ideliminarExcretas != null ? ideliminarExcretas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eliminarexcretas)) {
            return false;
        }
        Eliminarexcretas other = (Eliminarexcretas) object;
        if ((this.ideliminarExcretas == null && other.ideliminarExcretas != null) || (this.ideliminarExcretas != null && !this.ideliminarExcretas.equals(other.ideliminarExcretas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Eliminarexcretas[ ideliminarExcretas=" + ideliminarExcretas + " ]";
    }
    
}
