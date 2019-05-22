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
@Table(name = "aguasservidas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aguasservidas.findAll", query = "SELECT a FROM Aguasservidas a")
    , @NamedQuery(name = "Aguasservidas.findByIdaguaServida", query = "SELECT a FROM Aguasservidas a WHERE a.idaguaServida = :idaguaServida")
    , @NamedQuery(name = "Aguasservidas.findByAguaServida", query = "SELECT a FROM Aguasservidas a WHERE a.aguaServida = :aguaServida")})
public class Aguasservidas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_aguaServida")
    private Integer idaguaServida;
    @Size(max = 45)
    @Column(name = "aguaServida")
    private String aguaServida;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAguasservidas")
    private Collection<Fichasfamiliares> fichasfamiliaresCollection;

    public Aguasservidas() {
    }

    public Aguasservidas(Integer idaguaServida) {
        this.idaguaServida = idaguaServida;
    }

    public Integer getIdaguaServida() {
        return idaguaServida;
    }

    public void setIdaguaServida(Integer idaguaServida) {
        this.idaguaServida = idaguaServida;
    }

    public String getAguaServida() {
        return aguaServida;
    }

    public void setAguaServida(String aguaServida) {
        this.aguaServida = aguaServida;
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
        hash += (idaguaServida != null ? idaguaServida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aguasservidas)) {
            return false;
        }
        Aguasservidas other = (Aguasservidas) object;
        if ((this.idaguaServida == null && other.idaguaServida != null) || (this.idaguaServida != null && !this.idaguaServida.equals(other.idaguaServida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Aguasservidas[ idaguaServida=" + idaguaServida + " ]";
    }
    
}
