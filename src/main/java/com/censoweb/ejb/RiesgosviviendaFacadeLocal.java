/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Riesgosvivienda;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface RiesgosviviendaFacadeLocal {

    void create(Riesgosvivienda riesgosvivienda);

    void edit(Riesgosvivienda riesgosvivienda);

    void remove(Riesgosvivienda riesgosvivienda);

    Riesgosvivienda find(Object id);

    List<Riesgosvivienda> findAll();

    List<Riesgosvivienda> findRange(int[] range);

    int count();
    
}
