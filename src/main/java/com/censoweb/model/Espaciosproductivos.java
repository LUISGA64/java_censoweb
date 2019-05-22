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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author luisg
 */
@Entity
@Table(name = "espaciosproductivos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Espaciosproductivos.findAll", query = "SELECT e FROM Espaciosproductivos e")
    , @NamedQuery(name = "Espaciosproductivos.findByIdespacioProductivo", query = "SELECT e FROM Espaciosproductivos e WHERE e.idespacioProductivo = :idespacioProductivo")
    , @NamedQuery(name = "Espaciosproductivos.findByEspacioProductivo", query = "SELECT e FROM Espaciosproductivos e WHERE e.espacioProductivo = :espacioProductivo")})
public class Espaciosproductivos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_espacioProductivo")
    private Integer idespacioProductivo;
    @Size(max = 45)
    @Column(name = "espacioProductivo")
    private String espacioProductivo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idespaciosProductivos")
    private Collection<Fichasfamiliares> fichasfamiliaresCollection;

    public Espaciosproductivos() {
    }

    public Espaciosproductivos(Integer idespacioProductivo) {
        this.idespacioProductivo = idespacioProductivo;
    }

    public Integer getIdespacioProductivo() {
        return idespacioProductivo;
    }

    public void setIdespacioProductivo(Integer idespacioProductivo) {
        this.idespacioProductivo = idespacioProductivo;
    }

    public String getEspacioProductivo() {
        return espacioProductivo;
    }

    public void setEspacioProductivo(String espacioProductivo) {
        this.espacioProductivo = espacioProductivo;
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
        hash += (idespacioProductivo != null ? idespacioProductivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Espaciosproductivos)) {
            return false;
        }
        Espaciosproductivos other = (Espaciosproductivos) object;
        if ((this.idespacioProductivo == null && other.idespacioProductivo != null) || (this.idespacioProductivo != null && !this.idespacioProductivo.equals(other.idespacioProductivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Espaciosproductivos[ idespacioProductivo=" + idespacioProductivo + " ]";
    }
    
}
