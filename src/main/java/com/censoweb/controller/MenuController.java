package com.censoweb.controller;

import com.censoweb.ejb.MenuFacadeLocal;
import com.censoweb.ejb.RolFacadeLocal;
import com.censoweb.ejb.SubmenuFacadeLocal;
import com.censoweb.model.Login;
import com.censoweb.model.Menu;
import com.censoweb.model.Rol;
import com.censoweb.model.Submenu;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

@Named
@SessionScoped
public class MenuController implements Serializable {

    @EJB
    private MenuFacadeLocal EJBMenu;
    private SubmenuFacadeLocal EJBSubMenu;
    private RolFacadeLocal EJBRol;
    private List<Menu> listaMenu;
    private List<Submenu> listaSubmenu;
    private List<Rol> listaRol;
    private MenuModel model;

    public MenuModel getModel() {
        return model;
    }

    public void setModel(MenuModel model) {
        this.model = model;
    }

    @PostConstruct
    public void init() {
        this.listarMenus();
        model = new DefaultMenuModel();
        this.establecerPermisos();
    }

    public void listarMenus() {
        try {
            listaMenu = EJBMenu.findAll();
            listaSubmenu = EJBSubMenu.findAll();
            listaRol = EJBRol.findAll();
        } catch (Exception e) {
            //
        }
    }

    public void establecerPermisos() {
        Login lg = (Login) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("login");
        
        for (Menu m : listaMenu) {
            if(m.getIdRol().equals(lg.getIdRol())){
                if (m.getMenu() != null) {
                DefaultSubMenu firstSubmenu = new DefaultSubMenu(m.getMenu());
                model.addElement(firstSubmenu);
            }
            }
        }
    }
}
