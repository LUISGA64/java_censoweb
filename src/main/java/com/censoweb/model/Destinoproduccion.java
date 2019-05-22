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
@Table(name = "destinoproduccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Destinoproduccion.findAll", query = "SELECT d FROM Destinoproduccion d")
    , @NamedQuery(name = "Destinoproduccion.findByIddestinoProduccion", query = "SELECT d FROM Destinoproduccion d WHERE d.iddestinoProduccion = :iddestinoProduccion")
    , @NamedQuery(name = "Destinoproduccion.findByDestinoProduccion", query = "SELECT d FROM Destinoproduccion d WHERE d.destinoProduccion = :destinoProduccion")})
public class Destinoproduccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_destinoProduccion")
    private Integer iddestinoProduccion;
    @Size(max = 45)
    @Column(name = "destinoProduccion")
    private String destinoProduccion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddestinoProduccion")
    private Collection<Fichasfamiliares> fichasfamiliaresCollection;

    public Destinoproduccion() {
    }

    public Destinoproduccion(Integer iddestinoProduccion) {
        this.iddestinoProduccion = iddestinoProduccion;
    }

    public Integer getIddestinoProduccion() {
        return iddestinoProduccion;
    }

    public void setIddestinoProduccion(Integer iddestinoProduccion) {
        this.iddestinoProduccion = iddestinoProduccion;
    }

    public String getDestinoProduccion() {
        return destinoProduccion;
    }

    public void setDestinoProduccion(String destinoProduccion) {
        this.destinoProduccion = destinoProduccion;
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
        hash += (iddestinoProduccion != null ? iddestinoProduccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Destinoproduccion)) {
            return false;
        }
        Destinoproduccion other = (Destinoproduccion) object;
        if ((this.iddestinoProduccion == null && other.iddestinoProduccion != null) || (this.iddestinoProduccion != null && !this.iddestinoProduccion.equals(other.iddestinoProduccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Destinoproduccion[ iddestinoProduccion=" + iddestinoProduccion + " ]";
    }
    
}
