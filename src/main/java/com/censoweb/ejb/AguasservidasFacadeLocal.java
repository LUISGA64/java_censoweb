/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Aguasservidas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface AguasservidasFacadeLocal {

    void create(Aguasservidas aguasservidas);

    void edit(Aguasservidas aguasservidas);

    void remove(Aguasservidas aguasservidas);

    Aguasservidas find(Object id);

    List<Aguasservidas> findAll();

    List<Aguasservidas> findRange(int[] range);

    int count();
    
}
