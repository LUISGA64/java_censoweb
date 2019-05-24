
package com.censoweb.controller;

import com.censoweb.ejb.TiposdocumentoFacadeLocal;
import com.censoweb.model.Tiposdocumento;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TipoDocController implements Serializable{ 
    
    @EJB
    private List<Tiposdocumento> tiposDocs;
    private TiposdocumentoFacadeLocal tipodocEJB;
    private Tiposdocumento tipodoc;
    
    //metodos Getter & Setter

    public List<Tiposdocumento> getTiposDocs() {
        return tiposDocs;
    }

    public void setTiposDocs(List<Tiposdocumento> tiposDocs) {
        this.tiposDocs = tiposDocs;
    }

    
    
    public Tiposdocumento getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(Tiposdocumento tipodoc) {
        this.tipodoc = tipodoc;
    }
    
    
       
    @PostConstruct
    public void init(){
        tipodoc = new Tiposdocumento();
        setTipodoc((Tiposdocumento) tipodocEJB.findAll());
    }
    
    public void registrar(){
        try{
            tipodocEJB.create(tipodoc);
        }catch(Exception e){
            //
        }
    }
}
