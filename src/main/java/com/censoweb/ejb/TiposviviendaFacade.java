/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Tiposvivienda;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author luisg
 */
@Stateless
public class TiposviviendaFacade extends AbstractFacade<Tiposvivienda> implements TiposviviendaFacadeLocal {

    @PersistenceContext(unitName = "censowebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TiposviviendaFacade() {
        super(Tiposvivienda.class);
    }
    
}
