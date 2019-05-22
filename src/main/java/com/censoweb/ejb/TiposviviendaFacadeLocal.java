/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Tiposvivienda;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface TiposviviendaFacadeLocal {

    void create(Tiposvivienda tiposvivienda);

    void edit(Tiposvivienda tiposvivienda);

    void remove(Tiposvivienda tiposvivienda);

    Tiposvivienda find(Object id);

    List<Tiposvivienda> findAll();

    List<Tiposvivienda> findRange(int[] range);

    int count();
    
}
