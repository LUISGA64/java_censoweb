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
@Table(name = "niveleducativo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Niveleducativo.findAll", query = "SELECT n FROM Niveleducativo n")
    , @NamedQuery(name = "Niveleducativo.findByIdnivelEducativo", query = "SELECT n FROM Niveleducativo n WHERE n.idnivelEducativo = :idnivelEducativo")
    , @NamedQuery(name = "Niveleducativo.findByNivelEducativo", query = "SELECT n FROM Niveleducativo n WHERE n.nivelEducativo = :nivelEducativo")})
public class Niveleducativo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_nivelEducativo")
    private Integer idnivelEducativo;
    @Size(max = 45)
    @Column(name = "nivelEducativo")
    private String nivelEducativo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idnivelEducativo")
    private Collection<Personas> personasCollection;

    public Niveleducativo() {
    }

    public Niveleducativo(Integer idnivelEducativo) {
        this.idnivelEducativo = idnivelEducativo;
    }

    public Integer getIdnivelEducativo() {
        return idnivelEducativo;
    }

    public void setIdnivelEducativo(Integer idnivelEducativo) {
        this.idnivelEducativo = idnivelEducativo;
    }

    public String getNivelEducativo() {
        return nivelEducativo;
    }

    public void setNivelEducativo(String nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
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
        hash += (idnivelEducativo != null ? idnivelEducativo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Niveleducativo)) {
            return false;
        }
        Niveleducativo other = (Niveleducativo) object;
        if ((this.idnivelEducativo == null && other.idnivelEducativo != null) || (this.idnivelEducativo != null && !this.idnivelEducativo.equals(other.idnivelEducativo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Niveleducativo[ idnivelEducativo=" + idnivelEducativo + " ]";
    }
    
}
