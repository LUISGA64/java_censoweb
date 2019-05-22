/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Materialescocinar;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface MaterialescocinarFacadeLocal {

    void create(Materialescocinar materialescocinar);

    void edit(Materialescocinar materialescocinar);

    void remove(Materialescocinar materialescocinar);

    Materialescocinar find(Object id);

    List<Materialescocinar> findAll();

    List<Materialescocinar> findRange(int[] range);

    int count();
    
}
