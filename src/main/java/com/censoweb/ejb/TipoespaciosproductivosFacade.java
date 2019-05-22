/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Tipoespaciosproductivos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author luisg
 */
@Stateless
public class TipoespaciosproductivosFacade extends AbstractFacade<Tipoespaciosproductivos> implements TipoespaciosproductivosFacadeLocal {

    @PersistenceContext(unitName = "censowebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoespaciosproductivosFacade() {
        super(Tipoespaciosproductivos.class);
    }
    
}
