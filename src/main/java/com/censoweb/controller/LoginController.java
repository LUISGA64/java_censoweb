
package com.censoweb.controller;

import com.censoweb.ejb.LoginFacadeLocal;
import com.censoweb.model.Login;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class LoginController implements Serializable{
   
    @EJB
    private LoginFacadeLocal EJBLogin;
    private Login login;
    
    @PostConstruct
    public void init(){
        login = new Login();
    }

    //metodos Getter & Setter
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
    
    public String iniciarSesion(){
        Login lg;
        String redireccion = null;
        FacesContext context = FacesContext.getCurrentInstance();
        try{
            lg = EJBLogin.iniciarSesion(login);
            if(lg != null){
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("login", lg);
                redireccion = "/protegido/principal";
                
            } else{
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Error:","Datos incorrectos"));
            }
        }
        catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Error","Acceso denegado!"));
        }
        return redireccion;
    }
    
    
    public void registrar(){
        try{
            EJBLogin.create(login);
            EJBLogin.findAll();
            //
        }catch(Exception e){
            throw e;
            //
        }
    }
    
}
