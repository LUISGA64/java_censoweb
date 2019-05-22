/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Veredas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface VeredasFacadeLocal {

    void create(Veredas veredas);

    void edit(Veredas veredas);

    void remove(Veredas veredas);

    Veredas find(Object id);

    List<Veredas> findAll();

    List<Veredas> findRange(int[] range);

    int count();
    
}
