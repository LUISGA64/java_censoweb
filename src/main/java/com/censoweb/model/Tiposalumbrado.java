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
@Table(name = "tiposalumbrado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiposalumbrado.findAll", query = "SELECT t FROM Tiposalumbrado t")
    , @NamedQuery(name = "Tiposalumbrado.findByIdtipoAlumbrado", query = "SELECT t FROM Tiposalumbrado t WHERE t.idtipoAlumbrado = :idtipoAlumbrado")
    , @NamedQuery(name = "Tiposalumbrado.findByTipoAlumbrado", query = "SELECT t FROM Tiposalumbrado t WHERE t.tipoAlumbrado = :tipoAlumbrado")})
public class Tiposalumbrado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipoAlumbrado")
    private Integer idtipoAlumbrado;
    @Size(max = 45)
    @Column(name = "tipoAlumbrado")
    private String tipoAlumbrado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipoAlumbrado")
    private Collection<Fichasfamiliares> fichasfamiliaresCollection;

    public Tiposalumbrado() {
    }

    public Tiposalumbrado(Integer idtipoAlumbrado) {
        this.idtipoAlumbrado = idtipoAlumbrado;
    }

    public Integer getIdtipoAlumbrado() {
        return idtipoAlumbrado;
    }

    public void setIdtipoAlumbrado(Integer idtipoAlumbrado) {
        this.idtipoAlumbrado = idtipoAlumbrado;
    }

    public String getTipoAlumbrado() {
        return tipoAlumbrado;
    }

    public void setTipoAlumbrado(String tipoAlumbrado) {
        this.tipoAlumbrado = tipoAlumbrado;
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
        hash += (idtipoAlumbrado != null ? idtipoAlumbrado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiposalumbrado)) {
            return false;
        }
        Tiposalumbrado other = (Tiposalumbrado) object;
        if ((this.idtipoAlumbrado == null && other.idtipoAlumbrado != null) || (this.idtipoAlumbrado != null && !this.idtipoAlumbrado.equals(other.idtipoAlumbrado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Tiposalumbrado[ idtipoAlumbrado=" + idtipoAlumbrado + " ]";
    }
    
}
