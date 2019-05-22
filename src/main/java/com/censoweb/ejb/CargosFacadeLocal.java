/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Cargos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface CargosFacadeLocal {

    void create(Cargos cargos);

    void edit(Cargos cargos);

    void remove(Cargos cargos);

    Cargos find(Object id);

    List<Cargos> findAll();

    List<Cargos> findRange(int[] range);

    int count();
    
}
