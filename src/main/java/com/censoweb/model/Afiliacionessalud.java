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
@Table(name = "afiliacionessalud")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Afiliacionessalud.findAll", query = "SELECT a FROM Afiliacionessalud a")
    , @NamedQuery(name = "Afiliacionessalud.findByIdafiliacionSalud", query = "SELECT a FROM Afiliacionessalud a WHERE a.idafiliacionSalud = :idafiliacionSalud")
    , @NamedQuery(name = "Afiliacionessalud.findByEmpresaAfiliacion", query = "SELECT a FROM Afiliacionessalud a WHERE a.empresaAfiliacion = :empresaAfiliacion")
    , @NamedQuery(name = "Afiliacionessalud.findByCodEmpresa", query = "SELECT a FROM Afiliacionessalud a WHERE a.codEmpresa = :codEmpresa")})
public class Afiliacionessalud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_afiliacionSalud")
    private Integer idafiliacionSalud;
    @Size(max = 45)
    @Column(name = "empresaAfiliacion")
    private String empresaAfiliacion;
    @Size(max = 6)
    @Column(name = "cod_empresa")
    private String codEmpresa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAfiliacionSalud")
    private Collection<Personas> personasCollection;

    public Afiliacionessalud() {
    }

    public Afiliacionessalud(Integer idafiliacionSalud) {
        this.idafiliacionSalud = idafiliacionSalud;
    }

    public Integer getIdafiliacionSalud() {
        return idafiliacionSalud;
    }

    public void setIdafiliacionSalud(Integer idafiliacionSalud) {
        this.idafiliacionSalud = idafiliacionSalud;
    }

    public String getEmpresaAfiliacion() {
        return empresaAfiliacion;
    }

    public void setEmpresaAfiliacion(String empresaAfiliacion) {
        this.empresaAfiliacion = empresaAfiliacion;
    }

    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
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
        hash += (idafiliacionSalud != null ? idafiliacionSalud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Afiliacionessalud)) {
            return false;
        }
        Afiliacionessalud other = (Afiliacionessalud) object;
        if ((this.idafiliacionSalud == null && other.idafiliacionSalud != null) || (this.idafiliacionSalud != null && !this.idafiliacionSalud.equals(other.idafiliacionSalud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Afiliacionessalud[ idafiliacionSalud=" + idafiliacionSalud + " ]";
    }
    
}
