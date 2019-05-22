/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Fichasfamiliares;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface FichasfamiliaresFacadeLocal {

    void create(Fichasfamiliares fichasfamiliares);

    void edit(Fichasfamiliares fichasfamiliares);

    void remove(Fichasfamiliares fichasfamiliares);

    Fichasfamiliares find(Object id);

    List<Fichasfamiliares> findAll();

    List<Fichasfamiliares> findRange(int[] range);

    int count();
    
}
