/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Vectoresvivienda;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface VectoresviviendaFacadeLocal {

    void create(Vectoresvivienda vectoresvivienda);

    void edit(Vectoresvivienda vectoresvivienda);

    void remove(Vectoresvivienda vectoresvivienda);

    Vectoresvivienda find(Object id);

    List<Vectoresvivienda> findAll();

    List<Vectoresvivienda> findRange(int[] range);

    int count();
    
}
