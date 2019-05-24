/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.controller;

import com.censoweb.model.Login;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author luisg
 */
@ManagedBean(name = "utilbean")
@SessionScoped
class Utilbean implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private Login tbllogin;
    
    public Utilbean(){
        this.tbllogin = new Login();
    }

    public Login getTbllogin() {
        return tbllogin;
    }

    public void setTbllogin(Login tbllogin) {
        this.tbllogin = tbllogin;
    }
}
