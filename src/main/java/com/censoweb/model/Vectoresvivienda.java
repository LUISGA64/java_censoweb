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
@Table(name = "vectoresvivienda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vectoresvivienda.findAll", query = "SELECT v FROM Vectoresvivienda v")
    , @NamedQuery(name = "Vectoresvivienda.findByIdvectorVivienda", query = "SELECT v FROM Vectoresvivienda v WHERE v.idvectorVivienda = :idvectorVivienda")
    , @NamedQuery(name = "Vectoresvivienda.findByVectorVivienda", query = "SELECT v FROM Vectoresvivienda v WHERE v.vectorVivienda = :vectorVivienda")})
public class Vectoresvivienda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_vectorVivienda")
    private Integer idvectorVivienda;
    @Size(max = 45)
    @Column(name = "vectorVivienda")
    private String vectorVivienda;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idvectoresVivienda")
    private Collection<Fichasfamiliares> fichasfamiliaresCollection;

    public Vectoresvivienda() {
    }

    public Vectoresvivienda(Integer idvectorVivienda) {
        this.idvectorVivienda = idvectorVivienda;
    }

    public Integer getIdvectorVivienda() {
        return idvectorVivienda;
    }

    public void setIdvectorVivienda(Integer idvectorVivienda) {
        this.idvectorVivienda = idvectorVivienda;
    }

    public String getVectorVivienda() {
        return vectorVivienda;
    }

    public void setVectorVivienda(String vectorVivienda) {
        this.vectorVivienda = vectorVivienda;
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
        hash += (idvectorVivienda != null ? idvectorVivienda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vectoresvivienda)) {
            return false;
        }
        Vectoresvivienda other = (Vectoresvivienda) object;
        if ((this.idvectorVivienda == null && other.idvectorVivienda != null) || (this.idvectorVivienda != null && !this.idvectorVivienda.equals(other.idvectorVivienda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Vectoresvivienda[ idvectorVivienda=" + idvectorVivienda + " ]";
    }
    
}
