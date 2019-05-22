/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Materialespared;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface MaterialesparedFacadeLocal {

    void create(Materialespared materialespared);

    void edit(Materialespared materialespared);

    void remove(Materialespared materialespared);

    Materialespared find(Object id);

    List<Materialespared> findAll();

    List<Materialespared> findRange(int[] range);

    int count();
    
}
