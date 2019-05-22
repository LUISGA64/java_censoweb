/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Destinoproduccion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface DestinoproduccionFacadeLocal {

    void create(Destinoproduccion destinoproduccion);

    void edit(Destinoproduccion destinoproduccion);

    void remove(Destinoproduccion destinoproduccion);

    Destinoproduccion find(Object id);

    List<Destinoproduccion> findAll();

    List<Destinoproduccion> findRange(int[] range);

    int count();
    
}
