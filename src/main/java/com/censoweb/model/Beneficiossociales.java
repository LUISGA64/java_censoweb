/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author luisg
 */
@Entity
@Table(name = "beneficiossociales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Beneficiossociales.findAll", query = "SELECT b FROM Beneficiossociales b")
    , @NamedQuery(name = "Beneficiossociales.findByIdbeneficioSocial", query = "SELECT b FROM Beneficiossociales b WHERE b.idbeneficioSocial = :idbeneficioSocial")
    , @NamedQuery(name = "Beneficiossociales.findByBeneficioSocial", query = "SELECT b FROM Beneficiossociales b WHERE b.beneficioSocial = :beneficioSocial")
    , @NamedQuery(name = "Beneficiossociales.findByTipoBeneficio", query = "SELECT b FROM Beneficiossociales b WHERE b.tipoBeneficio = :tipoBeneficio")})
public class Beneficiossociales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_beneficioSocial")
    private Integer idbeneficioSocial;
    @Size(max = 45)
    @Column(name = "beneficioSocial")
    private String beneficioSocial;
    @Size(max = 45)
    @Column(name = "tipoBeneficio")
    private String tipoBeneficio;

    public Beneficiossociales() {
    }

    public Beneficiossociales(Integer idbeneficioSocial) {
        this.idbeneficioSocial = idbeneficioSocial;
    }

    public Integer getIdbeneficioSocial() {
        return idbeneficioSocial;
    }

    public void setIdbeneficioSocial(Integer idbeneficioSocial) {
        this.idbeneficioSocial = idbeneficioSocial;
    }

    public String getBeneficioSocial() {
        return beneficioSocial;
    }

    public void setBeneficioSocial(String beneficioSocial) {
        this.beneficioSocial = beneficioSocial;
    }

    public String getTipoBeneficio() {
        return tipoBeneficio;
    }

    public void setTipoBeneficio(String tipoBeneficio) {
        this.tipoBeneficio = tipoBeneficio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbeneficioSocial != null ? idbeneficioSocial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Beneficiossociales)) {
            return false;
        }
        Beneficiossociales other = (Beneficiossociales) object;
        if ((this.idbeneficioSocial == null && other.idbeneficioSocial != null) || (this.idbeneficioSocial != null && !this.idbeneficioSocial.equals(other.idbeneficioSocial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Beneficiossociales[ idbeneficioSocial=" + idbeneficioSocial + " ]";
    }
    
}
