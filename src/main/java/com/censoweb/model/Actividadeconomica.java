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
@Table(name = "actividadeconomica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actividadeconomica.findAll", query = "SELECT a FROM Actividadeconomica a")
    , @NamedQuery(name = "Actividadeconomica.findByIdactividadEconomica", query = "SELECT a FROM Actividadeconomica a WHERE a.idactividadEconomica = :idactividadEconomica")
    , @NamedQuery(name = "Actividadeconomica.findByActividadEconomica", query = "SELECT a FROM Actividadeconomica a WHERE a.actividadEconomica = :actividadEconomica")})
public class Actividadeconomica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_actividadEconomica")
    private Integer idactividadEconomica;
    @Size(max = 45)
    @Column(name = "actividadEconomica")
    private String actividadEconomica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idactividadEconomica")
    private Collection<Fichasfamiliares> fichasfamiliaresCollection;

    public Actividadeconomica() {
    }

    public Actividadeconomica(Integer idactividadEconomica) {
        this.idactividadEconomica = idactividadEconomica;
    }

    public Integer getIdactividadEconomica() {
        return idactividadEconomica;
    }

    public void setIdactividadEconomica(Integer idactividadEconomica) {
        this.idactividadEconomica = idactividadEconomica;
    }

    public String getActividadEconomica() {
        return actividadEconomica;
    }

    public void setActividadEconomica(String actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
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
        hash += (idactividadEconomica != null ? idactividadEconomica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividadeconomica)) {
            return false;
        }
        Actividadeconomica other = (Actividadeconomica) object;
        if ((this.idactividadEconomica == null && other.idactividadEconomica != null) || (this.idactividadEconomica != null && !this.idactividadEconomica.equals(other.idactividadEconomica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Actividadeconomica[ idactividadEconomica=" + idactividadEconomica + " ]";
    }
    
}
