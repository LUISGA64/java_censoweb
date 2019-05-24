
package com.censoweb.controller;

import com.censoweb.ejb.LoginFacadeLocal;
import com.censoweb.model.Login;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class LoginController implements Serializable{
    private List<Login> logins;
    private Login login;
    private Login loginNew;
    private Login loginSelect;
    private Login loginSesion;

    public List<Login> getLogins() {
        return logins;
    }

    public void setLogins(List<Login> logins) {
        this.logins = logins;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Login getLoginNew() {
        return loginNew;
    }

    public void setLoginNew(Login loginNew) {
        this.loginNew = loginNew;
    }

    public Login getLoginSelect() {
        return loginSelect;
    }

    public void setLoginSelect(Login loginSelect) {
        this.loginSelect = loginSelect;
    }

    public Login getLoginSesion() {
        return loginSesion;
    }

    public void setLoginSesion(Login loginSesion) {
        this.loginSesion = loginSesion;
    }
    
    @ManagedProperty("#{utilbean}")
    private Utilbean utilbean;

    @ManagedProperty("#{appBean}")
    private AppBean appBean;
    
        
    @EJB
    private LoginFacadeLocal loginEJB;
    
    @PostConstruct
    public void init(){
        setLogins(loginEJB.findAll());
        loginNew = new Login();
    }
    
    public LoginController(){
        if(this.login == null){
            this.login = new Login();
            loginSelect = new Login();
            loginNew = new Login();
        }
    }
    
}
