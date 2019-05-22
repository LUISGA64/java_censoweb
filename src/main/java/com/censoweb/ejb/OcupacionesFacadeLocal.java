/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Ocupaciones;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface OcupacionesFacadeLocal {

    void create(Ocupaciones ocupaciones);

    void edit(Ocupaciones ocupaciones);

    void remove(Ocupaciones ocupaciones);

    Ocupaciones find(Object id);

    List<Ocupaciones> findAll();

    List<Ocupaciones> findRange(int[] range);

    int count();
    
}
