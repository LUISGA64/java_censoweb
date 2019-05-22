/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Niveleducativo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface NiveleducativoFacadeLocal {

    void create(Niveleducativo niveleducativo);

    void edit(Niveleducativo niveleducativo);

    void remove(Niveleducativo niveleducativo);

    Niveleducativo find(Object id);

    List<Niveleducativo> findAll();

    List<Niveleducativo> findRange(int[] range);

    int count();
    
}
