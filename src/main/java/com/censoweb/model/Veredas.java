/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "veredas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Veredas.findAll", query = "SELECT v FROM Veredas v")
    , @NamedQuery(name = "Veredas.findByIdVereda", query = "SELECT v FROM Veredas v WHERE v.idVereda = :idVereda")
    , @NamedQuery(name = "Veredas.findByVereda", query = "SELECT v FROM Veredas v WHERE v.vereda = :vereda")})
public class Veredas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_vereda")
    private Integer idVereda;
    @Size(max = 45)
    @Column(name = "vereda")
    private String vereda;
    @JoinColumn(name = "id_resguardo", referencedColumnName = "id_resguardo")
    @ManyToOne
    private Resguardo idResguardo;
    @OneToMany(mappedBy = "idVereda")
    private Collection<Fichasfamiliares> fichasfamiliaresCollection;

    public Veredas() {
    }

    public Veredas(Integer idVereda) {
        this.idVereda = idVereda;
    }

    public Integer getIdVereda() {
        return idVereda;
    }

    public void setIdVereda(Integer idVereda) {
        this.idVereda = idVereda;
    }

    public String getVereda() {
        return vereda;
    }

    public void setVereda(String vereda) {
        this.vereda = vereda;
    }

    public Resguardo getIdResguardo() {
        return idResguardo;
    }

    public void setIdResguardo(Resguardo idResguardo) {
        this.idResguardo = idResguardo;
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
        hash += (idVereda != null ? idVereda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Veredas)) {
            return false;
        }
        Veredas other = (Veredas) object;
        if ((this.idVereda == null && other.idVereda != null) || (this.idVereda != null && !this.idVereda.equals(other.idVereda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Veredas[ idVereda=" + idVereda + " ]";
    }
    
}
