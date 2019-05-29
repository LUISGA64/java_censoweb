package com.censoweb.controller;

import com.censoweb.model.Login;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


@Named
@ViewScoped
public class PlantillaController implements Serializable {
    
    public void verificarSesion(){
        try{
            FacesContext context = FacesContext.getCurrentInstance();
            Login lg = (Login) context.getExternalContext().getSessionMap().get("login");
            
            if(lg == null){
                context.getExternalContext().redirect("./../permisos.xhtml");
            }
        }catch(Exception e){
            //LOG
        }
    }
    
}
