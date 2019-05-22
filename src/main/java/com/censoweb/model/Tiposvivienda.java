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
@Table(name = "tiposvivienda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiposvivienda.findAll", query = "SELECT t FROM Tiposvivienda t")
    , @NamedQuery(name = "Tiposvivienda.findByIdtipoVivienda", query = "SELECT t FROM Tiposvivienda t WHERE t.idtipoVivienda = :idtipoVivienda")
    , @NamedQuery(name = "Tiposvivienda.findByTipoVivienda", query = "SELECT t FROM Tiposvivienda t WHERE t.tipoVivienda = :tipoVivienda")})
public class Tiposvivienda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tipoVivienda")
    private Integer idtipoVivienda;
    @Size(max = 45)
    @Column(name = "tipoVivienda")
    private String tipoVivienda;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipoVivienda")
    private Collection<Fichasfamiliares> fichasfamiliaresCollection;

    public Tiposvivienda() {
    }

    public Tiposvivienda(Integer idtipoVivienda) {
        this.idtipoVivienda = idtipoVivienda;
    }

    public Integer getIdtipoVivienda() {
        return idtipoVivienda;
    }

    public void setIdtipoVivienda(Integer idtipoVivienda) {
        this.idtipoVivienda = idtipoVivienda;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
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
        hash += (idtipoVivienda != null ? idtipoVivienda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiposvivienda)) {
            return false;
        }
        Tiposvivienda other = (Tiposvivienda) object;
        if ((this.idtipoVivienda == null && other.idtipoVivienda != null) || (this.idtipoVivienda != null && !this.idtipoVivienda.equals(other.idtipoVivienda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Tiposvivienda[ idtipoVivienda=" + idtipoVivienda + " ]";
    }
    
}
