/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Actividadeconomica;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface ActividadeconomicaFacadeLocal {

    void create(Actividadeconomica actividadeconomica);

    void edit(Actividadeconomica actividadeconomica);

    void remove(Actividadeconomica actividadeconomica);

    Actividadeconomica find(Object id);

    List<Actividadeconomica> findAll();

    List<Actividadeconomica> findRange(int[] range);

    int count();
    
}
