/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Login;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author luisg
 */
@Stateless
public class LoginFacade extends AbstractFacade<Login> implements LoginFacadeLocal {

    @PersistenceContext(unitName = "censowebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LoginFacade() {
        super(Login.class);
    }
    
    @Override
    public Login iniciarSesion(Login lg){
        Login login = null;
        String consulta;
        try{
            consulta = "FROM Login l WHERE l.usuario = ?1 and l.password = ?2";
            Query query = em.createQuery(consulta);
            query.setParameter(1, lg.getUsuario());
            query.setParameter(2, lg.getPassword());
            List<Login> lista = query.getResultList();
            if(!lista.isEmpty()){
                login = lista.get(0);
            }
        }catch(Exception e){
            throw e;
        } 
        return login;
    }
    
}
