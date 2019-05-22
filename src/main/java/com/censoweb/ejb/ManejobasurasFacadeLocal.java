/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Manejobasuras;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface ManejobasurasFacadeLocal {

    void create(Manejobasuras manejobasuras);

    void edit(Manejobasuras manejobasuras);

    void remove(Manejobasuras manejobasuras);

    Manejobasuras find(Object id);

    List<Manejobasuras> findAll();

    List<Manejobasuras> findRange(int[] range);

    int count();
    
}
