/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Espaciospecuarios;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface EspaciospecuariosFacadeLocal {

    void create(Espaciospecuarios espaciospecuarios);

    void edit(Espaciospecuarios espaciospecuarios);

    void remove(Espaciospecuarios espaciospecuarios);

    Espaciospecuarios find(Object id);

    List<Espaciospecuarios> findAll();

    List<Espaciospecuarios> findRange(int[] range);

    int count();
    
}
