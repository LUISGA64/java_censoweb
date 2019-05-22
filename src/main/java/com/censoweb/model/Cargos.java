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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author luisg
 */
@Entity
@Table(name = "cargos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cargos.findAll", query = "SELECT c FROM Cargos c")
    , @NamedQuery(name = "Cargos.findByIdCargo", query = "SELECT c FROM Cargos c WHERE c.idCargo = :idCargo")
    , @NamedQuery(name = "Cargos.findByCargo", query = "SELECT c FROM Cargos c WHERE c.cargo = :cargo")
    , @NamedQuery(name = "Cargos.findByTipoCargo", query = "SELECT c FROM Cargos c WHERE c.tipoCargo = :tipoCargo")})
public class Cargos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cargo")
    private Integer idCargo;
    @Size(max = 25)
    @Column(name = "cargo")
    private String cargo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipoCargo")
    private Character tipoCargo;

    public Cargos() {
    }

    public Cargos(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public Cargos(Integer idCargo, Character tipoCargo) {
        this.idCargo = idCargo;
        this.tipoCargo = tipoCargo;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Character getTipoCargo() {
        return tipoCargo;
    }

    public void setTipoCargo(Character tipoCargo) {
        this.tipoCargo = tipoCargo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCargo != null ? idCargo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cargos)) {
            return false;
        }
        Cargos other = (Cargos) object;
        if ((this.idCargo == null && other.idCargo != null) || (this.idCargo != null && !this.idCargo.equals(other.idCargo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Cargos[ idCargo=" + idCargo + " ]";
    }
    
}
