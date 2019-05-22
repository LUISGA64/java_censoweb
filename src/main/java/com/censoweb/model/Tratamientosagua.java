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
@Table(name = "tratamientosagua")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tratamientosagua.findAll", query = "SELECT t FROM Tratamientosagua t")
    , @NamedQuery(name = "Tratamientosagua.findByIdtratamientoAgua", query = "SELECT t FROM Tratamientosagua t WHERE t.idtratamientoAgua = :idtratamientoAgua")
    , @NamedQuery(name = "Tratamientosagua.findByTratamientoAgua", query = "SELECT t FROM Tratamientosagua t WHERE t.tratamientoAgua = :tratamientoAgua")})
public class Tratamientosagua implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tratamientoAgua")
    private Integer idtratamientoAgua;
    @Size(max = 45)
    @Column(name = "tratamientoAgua")
    private String tratamientoAgua;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idttoAgua")
    private Collection<Fichasfamiliares> fichasfamiliaresCollection;

    public Tratamientosagua() {
    }

    public Tratamientosagua(Integer idtratamientoAgua) {
        this.idtratamientoAgua = idtratamientoAgua;
    }

    public Integer getIdtratamientoAgua() {
        return idtratamientoAgua;
    }

    public void setIdtratamientoAgua(Integer idtratamientoAgua) {
        this.idtratamientoAgua = idtratamientoAgua;
    }

    public String getTratamientoAgua() {
        return tratamientoAgua;
    }

    public void setTratamientoAgua(String tratamientoAgua) {
        this.tratamientoAgua = tratamientoAgua;
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
        hash += (idtratamientoAgua != null ? idtratamientoAgua.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tratamientosagua)) {
            return false;
        }
        Tratamientosagua other = (Tratamientosagua) object;
        if ((this.idtratamientoAgua == null && other.idtratamientoAgua != null) || (this.idtratamientoAgua != null && !this.idtratamientoAgua.equals(other.idtratamientoAgua))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Tratamientosagua[ idtratamientoAgua=" + idtratamientoAgua + " ]";
    }
    
}
