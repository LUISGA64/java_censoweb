
package com.censoweb.controller;

import com.censoweb.ejb.TiposdocumentoFacadeLocal;
import com.censoweb.model.Tiposdocumento;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TipoDocController implements Serializable{
    
    @EJB
    private TiposdocumentoFacadeLocal tipodocEJB;
    private Tiposdocumento tipodoc;
    
    //metodos Getter & Setter

    public Tiposdocumento getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(Tiposdocumento tipodoc) {
        this.tipodoc = tipodoc;
    }
    
    
       
    @PostConstruct
    public void init(){
        tipodoc = new Tiposdocumento();
    }
    
    public void registrar(){
        try{
            tipodocEJB.create(tipodoc);
        }catch(Exception e){
            //
        }
    }
}
