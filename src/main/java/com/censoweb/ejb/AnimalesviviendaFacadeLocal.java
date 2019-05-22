/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Animalesvivienda;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface AnimalesviviendaFacadeLocal {

    void create(Animalesvivienda animalesvivienda);

    void edit(Animalesvivienda animalesvivienda);

    void remove(Animalesvivienda animalesvivienda);

    Animalesvivienda find(Object id);

    List<Animalesvivienda> findAll();

    List<Animalesvivienda> findRange(int[] range);

    int count();
    
}
