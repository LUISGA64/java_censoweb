/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Tratamientosagua;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface TratamientosaguaFacadeLocal {

    void create(Tratamientosagua tratamientosagua);

    void edit(Tratamientosagua tratamientosagua);

    void remove(Tratamientosagua tratamientosagua);

    Tratamientosagua find(Object id);

    List<Tratamientosagua> findAll();

    List<Tratamientosagua> findRange(int[] range);

    int count();
    
}
