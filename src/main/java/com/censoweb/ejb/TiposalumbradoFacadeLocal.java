/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Tiposalumbrado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface TiposalumbradoFacadeLocal {

    void create(Tiposalumbrado tiposalumbrado);

    void edit(Tiposalumbrado tiposalumbrado);

    void remove(Tiposalumbrado tiposalumbrado);

    Tiposalumbrado find(Object id);

    List<Tiposalumbrado> findAll();

    List<Tiposalumbrado> findRange(int[] range);

    int count();
    
}
