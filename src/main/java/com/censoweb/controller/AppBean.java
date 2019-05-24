
package com.censoweb.controller;

import com.censoweb.util.MyUtil;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;


@ManagedBean
@ApplicationScoped
public class AppBean {
    
    
    private Boolean tipoDoc = false;
    private Boolean persona = false;
    private Boolean ficha = false;
    private Boolean cabildo = false;

    public AppBean() {
    }
    
    
    public String getBaseUrl(){
        return MyUtil.baseUrl();
    }
    
    public String getBasePath(){
        return MyUtil.basePath();
    }
    
    public String getBasePathMenu(){
        return MyUtil.basePathMenu();
    }
    
    public void esAdmin(){
        setTipoDoc((Boolean) true);
        setPersona((Boolean) true);
        setFicha((Boolean) true);
        setCabildo((Boolean) true);
        
    }
    

    public Boolean getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(Boolean tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public Boolean getPersona() {
        return persona;
    }

    public void setPersona(Boolean persona) {
        this.persona = persona;
    }

    public Boolean getFicha() {
        return ficha;
    }

    public void setFicha(Boolean ficha) {
        this.ficha = ficha;
    }

    public Boolean getCabildo() {
        return cabildo;
    }

    public void setCabildo(Boolean cabildo) {
        this.cabildo = cabildo;
    }
    
    
    
    
    
    
}
