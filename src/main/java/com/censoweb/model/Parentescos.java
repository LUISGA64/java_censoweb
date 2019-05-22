/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "parentescos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parentescos.findAll", query = "SELECT p FROM Parentescos p")
    , @NamedQuery(name = "Parentescos.findByIdParentesco", query = "SELECT p FROM Parentescos p WHERE p.idParentesco = :idParentesco")
    , @NamedQuery(name = "Parentescos.findByParentesco", query = "SELECT p FROM Parentescos p WHERE p.parentesco = :parentesco")})
public class Parentescos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_parentesco")
    private Integer idParentesco;
    @Size(max = 45)
    @Column(name = "parentesco")
    private String parentesco;
    @OneToMany(mappedBy = "idParentesco")
    private Collection<Personas> personasCollection;

    public Parentescos() {
    }

    public Parentescos(Integer idParentesco) {
        this.idParentesco = idParentesco;
    }

    public Integer getIdParentesco() {
        return idParentesco;
    }

    public void setIdParentesco(Integer idParentesco) {
        this.idParentesco = idParentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
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
        hash += (idParentesco != null ? idParentesco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parentescos)) {
            return false;
        }
        Parentescos other = (Parentescos) object;
        if ((this.idParentesco == null && other.idParentesco != null) || (this.idParentesco != null && !this.idParentesco.equals(other.idParentesco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Parentescos[ idParentesco=" + idParentesco + " ]";
    }
    
}
