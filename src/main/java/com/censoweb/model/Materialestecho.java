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
@Table(name = "materialestecho")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materialestecho.findAll", query = "SELECT m FROM Materialestecho m")
    , @NamedQuery(name = "Materialestecho.findByIdmaterialesTecho", query = "SELECT m FROM Materialestecho m WHERE m.idmaterialesTecho = :idmaterialesTecho")
    , @NamedQuery(name = "Materialestecho.findByMaterialTecho", query = "SELECT m FROM Materialestecho m WHERE m.materialTecho = :materialTecho")})
public class Materialestecho implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_materialesTecho")
    private Integer idmaterialesTecho;
    @Size(max = 45)
    @Column(name = "materialTecho")
    private String materialTecho;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmaterialTecho")
    private Collection<Fichasfamiliares> fichasfamiliaresCollection;

    public Materialestecho() {
    }

    public Materialestecho(Integer idmaterialesTecho) {
        this.idmaterialesTecho = idmaterialesTecho;
    }

    public Integer getIdmaterialesTecho() {
        return idmaterialesTecho;
    }

    public void setIdmaterialesTecho(Integer idmaterialesTecho) {
        this.idmaterialesTecho = idmaterialesTecho;
    }

    public String getMaterialTecho() {
        return materialTecho;
    }

    public void setMaterialTecho(String materialTecho) {
        this.materialTecho = materialTecho;
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
        hash += (idmaterialesTecho != null ? idmaterialesTecho.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materialestecho)) {
            return false;
        }
        Materialestecho other = (Materialestecho) object;
        if ((this.idmaterialesTecho == null && other.idmaterialesTecho != null) || (this.idmaterialesTecho != null && !this.idmaterialesTecho.equals(other.idmaterialesTecho))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Materialestecho[ idmaterialesTecho=" + idmaterialesTecho + " ]";
    }
    
}
