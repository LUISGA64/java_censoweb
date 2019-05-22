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
@Table(name = "discapacidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Discapacidad.findAll", query = "SELECT d FROM Discapacidad d")
    , @NamedQuery(name = "Discapacidad.findByIdDiscapacidad", query = "SELECT d FROM Discapacidad d WHERE d.idDiscapacidad = :idDiscapacidad")
    , @NamedQuery(name = "Discapacidad.findByDiscapacidad", query = "SELECT d FROM Discapacidad d WHERE d.discapacidad = :discapacidad")})
public class Discapacidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_Discapacidad")
    private Integer idDiscapacidad;
    @Size(max = 45)
    @Column(name = "discapacidad")
    private String discapacidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDiscapacidad")
    private Collection<Personas> personasCollection;

    public Discapacidad() {
    }

    public Discapacidad(Integer idDiscapacidad) {
        this.idDiscapacidad = idDiscapacidad;
    }

    public Integer getIdDiscapacidad() {
        return idDiscapacidad;
    }

    public void setIdDiscapacidad(Integer idDiscapacidad) {
        this.idDiscapacidad = idDiscapacidad;
    }

    public String getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
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
        hash += (idDiscapacidad != null ? idDiscapacidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Discapacidad)) {
            return false;
        }
        Discapacidad other = (Discapacidad) object;
        if ((this.idDiscapacidad == null && other.idDiscapacidad != null) || (this.idDiscapacidad != null && !this.idDiscapacidad.equals(other.idDiscapacidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Discapacidad[ idDiscapacidad=" + idDiscapacidad + " ]";
    }
    
}
