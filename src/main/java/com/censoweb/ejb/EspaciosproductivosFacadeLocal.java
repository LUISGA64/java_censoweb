/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Espaciosproductivos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface EspaciosproductivosFacadeLocal {

    void create(Espaciosproductivos espaciosproductivos);

    void edit(Espaciosproductivos espaciosproductivos);

    void remove(Espaciosproductivos espaciosproductivos);

    Espaciosproductivos find(Object id);

    List<Espaciosproductivos> findAll();

    List<Espaciosproductivos> findRange(int[] range);

    int count();
    
}
