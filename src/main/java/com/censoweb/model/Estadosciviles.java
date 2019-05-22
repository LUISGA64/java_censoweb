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
@Table(name = "estadosciviles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estadosciviles.findAll", query = "SELECT e FROM Estadosciviles e")
    , @NamedQuery(name = "Estadosciviles.findByIdestadoCivil", query = "SELECT e FROM Estadosciviles e WHERE e.idestadoCivil = :idestadoCivil")
    , @NamedQuery(name = "Estadosciviles.findByEstadoCivil", query = "SELECT e FROM Estadosciviles e WHERE e.estadoCivil = :estadoCivil")})
public class Estadosciviles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estadoCivil")
    private Integer idestadoCivil;
    @Size(max = 45)
    @Column(name = "estadoCivil")
    private String estadoCivil;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idestadoCivil")
    private Collection<Personas> personasCollection;

    public Estadosciviles() {
    }

    public Estadosciviles(Integer idestadoCivil) {
        this.idestadoCivil = idestadoCivil;
    }

    public Integer getIdestadoCivil() {
        return idestadoCivil;
    }

    public void setIdestadoCivil(Integer idestadoCivil) {
        this.idestadoCivil = idestadoCivil;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @XmlTransient
    public Collection<Personas> getPersonasCollection() {
        return personasCollection;
    }

    public void setPersonasCollection(Collection<Personas> personasCollection) {
        this.personasCollection = personasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestadoCivil != null ? idestadoCivil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadosciviles)) {
            return false;
        }
        Estadosciviles other = (Estadosciviles) object;
        if ((this.idestadoCivil == null && other.idestadoCivil != null) || (this.idestadoCivil != null && !this.idestadoCivil.equals(other.idestadoCivil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Estadosciviles[ idestadoCivil=" + idestadoCivil + " ]";
    }
    
}
