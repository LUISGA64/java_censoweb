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
@Table(name = "materialespared")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materialespared.findAll", query = "SELECT m FROM Materialespared m")
    , @NamedQuery(name = "Materialespared.findByIdmaterialPared", query = "SELECT m FROM Materialespared m WHERE m.idmaterialPared = :idmaterialPared")
    , @NamedQuery(name = "Materialespared.findByMaterialPared", query = "SELECT m FROM Materialespared m WHERE m.materialPared = :materialPared")})
public class Materialespared implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_materialPared")
    private Integer idmaterialPared;
    @Size(max = 45)
    @Column(name = "materialPared")
    private String materialPared;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmaterialParedes")
    private Collection<Fichasfamiliares> fichasfamiliaresCollection;

    public Materialespared() {
    }

    public Materialespared(Integer idmaterialPared) {
        this.idmaterialPared = idmaterialPared;
    }

    public Integer getIdmaterialPared() {
        return idmaterialPared;
    }

    public void setIdmaterialPared(Integer idmaterialPared) {
        this.idmaterialPared = idmaterialPared;
    }

    public String getMaterialPared() {
        return materialPared;
    }

    public void setMaterialPared(String materialPared) {
        this.materialPared = materialPared;
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
        hash += (idmaterialPared != null ? idmaterialPared.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materialespared)) {
            return false;
        }
        Materialespared other = (Materialespared) object;
        if ((this.idmaterialPared == null && other.idmaterialPared != null) || (this.idmaterialPared != null && !this.idmaterialPared.equals(other.idmaterialPared))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Materialespared[ idmaterialPared=" + idmaterialPared + " ]";
    }
    
}
