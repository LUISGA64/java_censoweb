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
@Table(name = "materialescocinar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materialescocinar.findAll", query = "SELECT m FROM Materialescocinar m")
    , @NamedQuery(name = "Materialescocinar.findByIdmaterialCocinar", query = "SELECT m FROM Materialescocinar m WHERE m.idmaterialCocinar = :idmaterialCocinar")
    , @NamedQuery(name = "Materialescocinar.findByMaterialCocina", query = "SELECT m FROM Materialescocinar m WHERE m.materialCocina = :materialCocina")})
public class Materialescocinar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_materialCocinar")
    private Integer idmaterialCocinar;
    @Size(max = 45)
    @Column(name = "materialCocina")
    private String materialCocina;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmaterialesCocinar")
    private Collection<Fichasfamiliares> fichasfamiliaresCollection;

    public Materialescocinar() {
    }

    public Materialescocinar(Integer idmaterialCocinar) {
        this.idmaterialCocinar = idmaterialCocinar;
    }

    public Integer getIdmaterialCocinar() {
        return idmaterialCocinar;
    }

    public void setIdmaterialCocinar(Integer idmaterialCocinar) {
        this.idmaterialCocinar = idmaterialCocinar;
    }

    public String getMaterialCocina() {
        return materialCocina;
    }

    public void setMaterialCocina(String materialCocina) {
        this.materialCocina = materialCocina;
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
        hash += (idmaterialCocinar != null ? idmaterialCocinar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materialescocinar)) {
            return false;
        }
        Materialescocinar other = (Materialescocinar) object;
        if ((this.idmaterialCocinar == null && other.idmaterialCocinar != null) || (this.idmaterialCocinar != null && !this.idmaterialCocinar.equals(other.idmaterialCocinar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Materialescocinar[ idmaterialCocinar=" + idmaterialCocinar + " ]";
    }
    
}
