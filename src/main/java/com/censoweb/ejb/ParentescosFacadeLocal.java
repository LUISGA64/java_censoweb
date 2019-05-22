/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Parentescos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface ParentescosFacadeLocal {

    void create(Parentescos parentescos);

    void edit(Parentescos parentescos);

    void remove(Parentescos parentescos);

    Parentescos find(Object id);

    List<Parentescos> findAll();

    List<Parentescos> findRange(int[] range);

    int count();
    
}
