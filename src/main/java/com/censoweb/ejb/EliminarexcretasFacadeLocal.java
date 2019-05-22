/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Eliminarexcretas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface EliminarexcretasFacadeLocal {

    void create(Eliminarexcretas eliminarexcretas);

    void edit(Eliminarexcretas eliminarexcretas);

    void remove(Eliminarexcretas eliminarexcretas);

    Eliminarexcretas find(Object id);

    List<Eliminarexcretas> findAll();

    List<Eliminarexcretas> findRange(int[] range);

    int count();
    
}
