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
@Table(name = "ocupaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ocupaciones.findAll", query = "SELECT o FROM Ocupaciones o")
    , @NamedQuery(name = "Ocupaciones.findByIdOcupacion", query = "SELECT o FROM Ocupaciones o WHERE o.idOcupacion = :idOcupacion")
    , @NamedQuery(name = "Ocupaciones.findByCodOcupacion", query = "SELECT o FROM Ocupaciones o WHERE o.codOcupacion = :codOcupacion")
    , @NamedQuery(name = "Ocupaciones.findByDesOcupacion", query = "SELECT o FROM Ocupaciones o WHERE o.desOcupacion = :desOcupacion")})
public class Ocupaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ocupacion")
    private Integer idOcupacion;
    @Size(max = 45)
    @Column(name = "codOcupacion")
    private String codOcupacion;
    @Size(max = 45)
    @Column(name = "desOcupacion")
    private String desOcupacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOcupacion")
    private Collection<Personas> personasCollection;

    public Ocupaciones() {
    }

    public Ocupaciones(Integer idOcupacion) {
        this.idOcupacion = idOcupacion;
    }

    public Integer getIdOcupacion() {
        return idOcupacion;
    }

    public void setIdOcupacion(Integer idOcupacion) {
        this.idOcupacion = idOcupacion;
    }

    public String getCodOcupacion() {
        return codOcupacion;
    }

    public void setCodOcupacion(String codOcupacion) {
        this.codOcupacion = codOcupacion;
    }

    public String getDesOcupacion() {
        return desOcupacion;
    }

    public void setDesOcupacion(String desOcupacion) {
        this.desOcupacion = desOcupacion;
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
        hash += (idOcupacion != null ? idOcupacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ocupaciones)) {
            return false;
        }
        Ocupaciones other = (Ocupaciones) object;
        if ((this.idOcupacion == null && other.idOcupacion != null) || (this.idOcupacion != null && !this.idOcupacion.equals(other.idOcupacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Ocupaciones[ idOcupacion=" + idOcupacion + " ]";
    }
    
}
