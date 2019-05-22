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
@Table(name = "espaciospecuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Espaciospecuarios.findAll", query = "SELECT e FROM Espaciospecuarios e")
    , @NamedQuery(name = "Espaciospecuarios.findByIdespacioPecuario", query = "SELECT e FROM Espaciospecuarios e WHERE e.idespacioPecuario = :idespacioPecuario")
    , @NamedQuery(name = "Espaciospecuarios.findByEspacioPecuario", query = "SELECT e FROM Espaciospecuarios e WHERE e.espacioPecuario = :espacioPecuario")})
public class Espaciospecuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_espacioPecuario")
    private Integer idespacioPecuario;
    @Size(max = 45)
    @Column(name = "espacioPecuario")
    private String espacioPecuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idespaciosPecuarios")
    private Collection<Fichasfamiliares> fichasfamiliaresCollection;

    public Espaciospecuarios() {
    }

    public Espaciospecuarios(Integer idespacioPecuario) {
        this.idespacioPecuario = idespacioPecuario;
    }

    public Integer getIdespacioPecuario() {
        return idespacioPecuario;
    }

    public void setIdespacioPecuario(Integer idespacioPecuario) {
        this.idespacioPecuario = idespacioPecuario;
    }

    public String getEspacioPecuario() {
        return espacioPecuario;
    }

    public void setEspacioPecuario(String espacioPecuario) {
        this.espacioPecuario = espacioPecuario;
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
        hash += (idespacioPecuario != null ? idespacioPecuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Espaciospecuarios)) {
            return false;
        }
        Espaciospecuarios other = (Espaciospecuarios) object;
        if ((this.idespacioPecuario == null && other.idespacioPecuario != null) || (this.idespacioPecuario != null && !this.idespacioPecuario.equals(other.idespacioPecuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Espaciospecuarios[ idespacioPecuario=" + idespacioPecuario + " ]";
    }
    
}
