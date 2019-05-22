/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Materialestecho;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface MaterialestechoFacadeLocal {

    void create(Materialestecho materialestecho);

    void edit(Materialestecho materialestecho);

    void remove(Materialestecho materialestecho);

    Materialestecho find(Object id);

    List<Materialestecho> findAll();

    List<Materialestecho> findRange(int[] range);

    int count();
    
}
