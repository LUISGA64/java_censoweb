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
@Table(name = "tiposdocumento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiposdocumento.findAll", query = "SELECT t FROM Tiposdocumento t")
    , @NamedQuery(name = "Tiposdocumento.findByIdtipoDoc", query = "SELECT t FROM Tiposdocumento t WHERE t.idtipoDoc = :idtipoDoc")
    , @NamedQuery(name = "Tiposdocumento.findByCodtipoDoc", query = "SELECT t FROM Tiposdocumento t WHERE t.codtipoDoc = :codtipoDoc")
    , @NamedQuery(name = "Tiposdocumento.findByDestipoDoc", query = "SELECT t FROM Tiposdocumento t WHERE t.destipoDoc = :destipoDoc")
    , @NamedQuery(name = "Tiposdocumento.findByTipodocumento", query = "SELECT t FROM Tiposdocumento t WHERE t.tipodocumento = :tipodocumento")})
public class Tiposdocumento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipoDoc")
    private Integer idtipoDoc;
    @Size(max = 45)
    @Column(name = "cod_tipoDoc")
    private String codtipoDoc;
    @Size(max = 45)
    @Column(name = "des_tipoDoc")
    private String destipoDoc;
    @Column(name = "tipodocumento")
    private Character tipodocumento;
    @OneToMany(mappedBy = "idtipoDoc")
    private Collection<Resguardo> resguardoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipoDoc")
    private Collection<Personas> personasCollection;

    public Tiposdocumento() {
    }

    public Tiposdocumento(Integer idtipoDoc) {
        this.idtipoDoc = idtipoDoc;
    }

    public Integer getIdtipoDoc() {
        return idtipoDoc;
    }

    public void setIdtipoDoc(Integer idtipoDoc) {
        this.idtipoDoc = idtipoDoc;
    }

    public String getCodtipoDoc() {
        return codtipoDoc;
    }

    public void setCodtipoDoc(String codtipoDoc) {
        this.codtipoDoc = codtipoDoc;
    }

    public String getDestipoDoc() {
        return destipoDoc;
    }

    public void setDestipoDoc(String destipoDoc) {
        this.destipoDoc = destipoDoc;
    }

    public Character getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(Character tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    @XmlTransient
    public Collection<Resguardo> getResguardoCollection() {
        return resguardoCollection;
    }

    public void setResguardoCollection(Collection<Resguardo> resguardoCollection) {
        this.resguardoCollection = resguardoCollection;
    }

    @XmlTransient
    public Collection<Personas> getPersonasCollection() {
        return personasCollection;
    }

    public void setPersonasCollection(Collection<Personas> personasCollection) {
        this.personasCollection = personasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoDoc != null ? idtipoDoc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiposdocumento)) {
            return false;
        }
        Tiposdocumento other = (Tiposdocumento) object;
        if ((this.idtipoDoc == null && other.idtipoDoc != null) || (this.idtipoDoc != null && !this.idtipoDoc.equals(other.idtipoDoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Tiposdocumento[ idtipoDoc=" + idtipoDoc + " ]";
    }
    
}
