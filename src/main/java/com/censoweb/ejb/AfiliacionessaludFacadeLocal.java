/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Afiliacionessalud;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface AfiliacionessaludFacadeLocal {

    void create(Afiliacionessalud afiliacionessalud);

    void edit(Afiliacionessalud afiliacionessalud);

    void remove(Afiliacionessalud afiliacionessalud);

    Afiliacionessalud find(Object id);

    List<Afiliacionessalud> findAll();

    List<Afiliacionessalud> findRange(int[] range);

    int count();
    
}
