/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Consumoagua;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface ConsumoaguaFacadeLocal {

    void create(Consumoagua consumoagua);

    void edit(Consumoagua consumoagua);

    void remove(Consumoagua consumoagua);

    Consumoagua find(Object id);

    List<Consumoagua> findAll();

    List<Consumoagua> findRange(int[] range);

    int count();
    
}
