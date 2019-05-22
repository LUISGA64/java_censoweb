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
@Table(name = "tipoespaciosproductivos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoespaciosproductivos.findAll", query = "SELECT t FROM Tipoespaciosproductivos t")
    , @NamedQuery(name = "Tipoespaciosproductivos.findByIdtipoEspacioProductivo", query = "SELECT t FROM Tipoespaciosproductivos t WHERE t.idtipoEspacioProductivo = :idtipoEspacioProductivo")
    , @NamedQuery(name = "Tipoespaciosproductivos.findByTipoEspacioProductivo", query = "SELECT t FROM Tipoespaciosproductivos t WHERE t.tipoEspacioProductivo = :tipoEspacioProductivo")})
public class Tipoespaciosproductivos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tipoEspacioProductivo")
    private Integer idtipoEspacioProductivo;
    @Size(max = 45)
    @Column(name = "tipoEspacioProductivo")
    private String tipoEspacioProductivo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipoEspacioProductivo")
    private Collection<Fichasfamiliares> fichasfamiliaresCollection;

    public Tipoespaciosproductivos() {
    }

    public Tipoespaciosproductivos(Integer idtipoEspacioProductivo) {
        this.idtipoEspacioProductivo = idtipoEspacioProductivo;
    }

    public Integer getIdtipoEspacioProductivo() {
        return idtipoEspacioProductivo;
    }

    public void setIdtipoEspacioProductivo(Integer idtipoEspacioProductivo) {
        this.idtipoEspacioProductivo = idtipoEspacioProductivo;
    }

    public String getTipoEspacioProductivo() {
        return tipoEspacioProductivo;
    }

    public void setTipoEspacioProductivo(String tipoEspacioProductivo) {
        this.tipoEspacioProductivo = tipoEspacioProductivo;
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
        hash += (idtipoEspacioProductivo != null ? idtipoEspacioProductivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoespaciosproductivos)) {
            return false;
        }
        Tipoespaciosproductivos other = (Tipoespaciosproductivos) object;
        if ((this.idtipoEspacioProductivo == null && other.idtipoEspacioProductivo != null) || (this.idtipoEspacioProductivo != null && !this.idtipoEspacioProductivo.equals(other.idtipoEspacioProductivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Tipoespaciosproductivos[ idtipoEspacioProductivo=" + idtipoEspacioProductivo + " ]";
    }
    
}
