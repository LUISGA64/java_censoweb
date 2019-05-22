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
@Table(name = "materialespiso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materialespiso.findAll", query = "SELECT m FROM Materialespiso m")
    , @NamedQuery(name = "Materialespiso.findByIdmaterialPiso", query = "SELECT m FROM Materialespiso m WHERE m.idmaterialPiso = :idmaterialPiso")
    , @NamedQuery(name = "Materialespiso.findByMaterialPiso", query = "SELECT m FROM Materialespiso m WHERE m.materialPiso = :materialPiso")})
public class Materialespiso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_materialPiso")
    private Integer idmaterialPiso;
    @Size(max = 45)
    @Column(name = "materialPiso")
    private String materialPiso;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmaterialPisos")
    private Collection<Fichasfamiliares> fichasfamiliaresCollection;

    public Materialespiso() {
    }

    public Materialespiso(Integer idmaterialPiso) {
        this.idmaterialPiso = idmaterialPiso;
    }

    public Integer getIdmaterialPiso() {
        return idmaterialPiso;
    }

    public void setIdmaterialPiso(Integer idmaterialPiso) {
        this.idmaterialPiso = idmaterialPiso;
    }

    public String getMaterialPiso() {
        return materialPiso;
    }

    public void setMaterialPiso(String materialPiso) {
        this.materialPiso = materialPiso;
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
        hash += (idmaterialPiso != null ? idmaterialPiso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materialespiso)) {
            return false;
        }
        Materialespiso other = (Materialespiso) object;
        if ((this.idmaterialPiso == null && other.idmaterialPiso != null) || (this.idmaterialPiso != null && !this.idmaterialPiso.equals(other.idmaterialPiso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Materialespiso[ idmaterialPiso=" + idmaterialPiso + " ]";
    }
    
}
