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
@Table(name = "resguardo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Resguardo.findAll", query = "SELECT r FROM Resguardo r")
    , @NamedQuery(name = "Resguardo.findByIdResguardo", query = "SELECT r FROM Resguardo r WHERE r.idResguardo = :idResguardo")
    , @NamedQuery(name = "Resguardo.findByResguardo", query = "SELECT r FROM Resguardo r WHERE r.resguardo = :resguardo")
    , @NamedQuery(name = "Resguardo.findByPueblo", query = "SELECT r FROM Resguardo r WHERE r.pueblo = :pueblo")
    , @NamedQuery(name = "Resguardo.findByResolucion", query = "SELECT r FROM Resguardo r WHERE r.resolucion = :resolucion")
    , @NamedQuery(name = "Resguardo.findByDireccion", query = "SELECT r FROM Resguardo r WHERE r.direccion = :direccion")
    , @NamedQuery(name = "Resguardo.findByTelefono", query = "SELECT r FROM Resguardo r WHERE r.telefono = :telefono")
    , @NamedQuery(name = "Resguardo.findByLogo", query = "SELECT r FROM Resguardo r WHERE r.logo = :logo")
    , @NamedQuery(name = "Resguardo.findByCorreoElectronico", query = "SELECT r FROM Resguardo r WHERE r.correoElectronico = :correoElectronico")
    , @NamedQuery(name = "Resguardo.findByIdentificacionResguado", query = "SELECT r FROM Resguardo r WHERE r.identificacionResguado = :identificacionResguado")
    , @NamedQuery(name = "Resguardo.findByJurisdiccion", query = "SELECT r FROM Resguardo r WHERE r.jurisdiccion = :jurisdiccion")})
public class Resguardo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_resguardo")
    private Integer idResguardo;
    @Size(max = 45)
    @Column(name = "resguardo")
    private String resguardo;
    @Size(max = 45)
    @Column(name = "pueblo")
    private String pueblo;
    @Size(max = 45)
    @Column(name = "resolucion")
    private String resolucion;
    @Size(max = 45)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 15)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 45)
    @Column(name = "logo")
    private String logo;
    @Size(max = 45)
    @Column(name = "correoElectronico")
    private String correoElectronico;
    @Size(max = 45)
    @Column(name = "identificacionResguado")
    private String identificacionResguado;
    @Size(max = 45)
    @Column(name = "jurisdiccion")
    private String jurisdiccion;
    @JoinColumn(name = "id_tipoDoc", referencedColumnName = "id_tipoDoc")
    @ManyToOne
    private Tiposdocumento idtipoDoc;
    @OneToMany(mappedBy = "idResguardo")
    private Collection<Veredas> veredasCollection;

    public Resguardo() {
    }

    public Resguardo(Integer idResguardo) {
        this.idResguardo = idResguardo;
    }

    public Integer getIdResguardo() {
        return idResguardo;
    }

    public void setIdResguardo(Integer idResguardo) {
        this.idResguardo = idResguardo;
    }

    public String getResguardo() {
        return resguardo;
    }

    public void setResguardo(String resguardo) {
        this.resguardo = resguardo;
    }

    public String getPueblo() {
        return pueblo;
    }

    public void setPueblo(String pueblo) {
        this.pueblo = pueblo;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getIdentificacionResguado() {
        return identificacionResguado;
    }

    public void setIdentificacionResguado(String identificacionResguado) {
        this.identificacionResguado = identificacionResguado;
    }

    public String getJurisdiccion() {
        return jurisdiccion;
    }

    public void setJurisdiccion(String jurisdiccion) {
        this.jurisdiccion = jurisdiccion;
    }

    public Tiposdocumento getIdtipoDoc() {
        return idtipoDoc;
    }

    public void setIdtipoDoc(Tiposdocumento idtipoDoc) {
        this.idtipoDoc = idtipoDoc;
    }

    @XmlTransient
    public Collection<Veredas> getVeredasCollection() {
        return veredasCollection;
    }

    public void setVeredasCollection(Collection<Veredas> veredasCollection) {
        this.veredasCollection = veredasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idResguardo != null ? idResguardo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resguardo)) {
            return false;
        }
        Resguardo other = (Resguardo) object;
        if ((this.idResguardo == null && other.idResguardo != null) || (this.idResguardo != null && !this.idResguardo.equals(other.idResguardo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Resguardo[ idResguardo=" + idResguardo + " ]";
    }
    
}
