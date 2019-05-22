/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Discapacidad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface DiscapacidadFacadeLocal {

    void create(Discapacidad discapacidad);

    void edit(Discapacidad discapacidad);

    void remove(Discapacidad discapacidad);

    Discapacidad find(Object id);

    List<Discapacidad> findAll();

    List<Discapacidad> findRange(int[] range);

    int count();
    
}
