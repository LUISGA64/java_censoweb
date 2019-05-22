/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Tipoespaciosproductivos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface TipoespaciosproductivosFacadeLocal {

    void create(Tipoespaciosproductivos tipoespaciosproductivos);

    void edit(Tipoespaciosproductivos tipoespaciosproductivos);

    void remove(Tipoespaciosproductivos tipoespaciosproductivos);

    Tipoespaciosproductivos find(Object id);

    List<Tipoespaciosproductivos> findAll();

    List<Tipoespaciosproductivos> findRange(int[] range);

    int count();
    
}
