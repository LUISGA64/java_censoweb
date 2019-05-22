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
@Table(name = "procesosjudiciales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Procesosjudiciales.findAll", query = "SELECT p FROM Procesosjudiciales p")
    , @NamedQuery(name = "Procesosjudiciales.findByIdprocesoJudicial", query = "SELECT p FROM Procesosjudiciales p WHERE p.idprocesoJudicial = :idprocesoJudicial")
    , @NamedQuery(name = "Procesosjudiciales.findByProcesoJudicial", query = "SELECT p FROM Procesosjudiciales p WHERE p.procesoJudicial = :procesoJudicial")})
public class Procesosjudiciales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_procesoJudicial")
    private Integer idprocesoJudicial;
    @Size(max = 45)
    @Column(name = "procesoJudicial")
    private String procesoJudicial;
    @OneToMany(mappedBy = "idprocesoJudicial")
    private Collection<Personas> personasCollection;

    public Procesosjudiciales() {
    }

    public Procesosjudiciales(Integer idprocesoJudicial) {
        this.idprocesoJudicial = idprocesoJudicial;
    }

    public Integer getIdprocesoJudicial() {
        return idprocesoJudicial;
    }

    public void setIdprocesoJudicial(Integer idprocesoJudicial) {
        this.idprocesoJudicial = idprocesoJudicial;
    }

    public String getProcesoJudicial() {
        return procesoJudicial;
    }

    public void setProcesoJudicial(String procesoJudicial) {
        this.procesoJudicial = procesoJudicial;
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
        hash += (idprocesoJudicial != null ? idprocesoJudicial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Procesosjudiciales)) {
            return false;
        }
        Procesosjudiciales other = (Procesosjudiciales) object;
        if ((this.idprocesoJudicial == null && other.idprocesoJudicial != null) || (this.idprocesoJudicial != null && !this.idprocesoJudicial.equals(other.idprocesoJudicial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Procesosjudiciales[ idprocesoJudicial=" + idprocesoJudicial + " ]";
    }
    
}
