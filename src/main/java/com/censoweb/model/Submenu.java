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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "submenu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Submenu.findAll", query = "SELECT s FROM Submenu s")
    , @NamedQuery(name = "Submenu.findByIdsubMenu", query = "SELECT s FROM Submenu s WHERE s.idsubMenu = :idsubMenu")
    , @NamedQuery(name = "Submenu.findBySubMenu", query = "SELECT s FROM Submenu s WHERE s.subMenu = :subMenu")})
public class Submenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_subMenu")
    private Integer idsubMenu;
    @Size(max = 45)
    @Column(name = "subMenu")
    private String subMenu;
    @JoinColumn(name = "id_menu", referencedColumnName = "idmenu")
    @ManyToOne
    private Menu idMenu;

    public Submenu() {
    }

    public Submenu(Integer idsubMenu) {
        this.idsubMenu = idsubMenu;
    }

    public Integer getIdsubMenu() {
        return idsubMenu;
    }

    public void setIdsubMenu(Integer idsubMenu) {
        this.idsubMenu = idsubMenu;
    }

    public String getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(String subMenu) {
        this.subMenu = subMenu;
    }

    public Menu getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Menu idMenu) {
        this.idMenu = idMenu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsubMenu != null ? idsubMenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Submenu)) {
            return false;
        }
        Submenu other = (Submenu) object;
        if ((this.idsubMenu == null && other.idsubMenu != null) || (this.idsubMenu != null && !this.idsubMenu.equals(other.idsubMenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.censoweb.model.Submenu[ idsubMenu=" + idsubMenu + " ]";
    }
    
}
