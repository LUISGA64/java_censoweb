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
@Table(name = "animalesvivienda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Animalesvivienda.findAll", query = "SELECT a FROM Animalesvivienda a")
    , @NamedQuery(name = "Animalesvivienda.findByIdanimalVivienda", query = "SELECT a FROM Animalesvivienda a WHERE a.idanimalVivienda = :idanimalVivienda")
    , @NamedQuery(name = "Animalesvivienda.findByAnimalVivienda", query = "SELECT a FROM Animalesvivienda a WHERE a.animalVivienda = :animalVivienda")})
public class Animalesvivienda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_animalVivienda")
    private Integer idanimalVivienda;
    @Size(max = 45)
    @Column(name = "animalVivienda")
    private String animalVivienda;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idanimalesVivienda")
    private Collection<Fichasfamiliares> fichasfamiliaresCollection;

    public Animalesvivienda() {
    }

    public Animalesvivienda(Integer idanimalVivienda) {
        this.idanimalVivienda = idanimalVivienda;
    }

    public Integer getIdanimalVivienda() {
        return idanimalVivienda;
    }

    public void setIdanimalVivienda(Integer idanimalVivienda) {
        this.idanimalVivienda = idanimalVivienda;
    }

    public String getAnimalVivienda() {
        return animalVivienda;
    }

    public void setAnimalVivienda(String animalVivienda) {
        this.animalVivienda = animalVivienda;
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
        hash += (idanimalVivienda != null ? idanimalVivienda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Animalesvivienda)) {
            return false;
        }
        Animalesvivienda other = (Animalesvivienda) object;
        if ((this.idanimalVivienda == null && other.idanimalVivienda != null) || (this.idanimalVivienda != null && !this.idanimalVivienda.equals(other.idanimalVivienda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Animalesvivienda[ idanimalVivienda=" + idanimalVivienda + " ]";
    }
    
}
