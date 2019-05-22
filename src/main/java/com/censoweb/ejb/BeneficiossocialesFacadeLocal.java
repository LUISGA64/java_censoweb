/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Beneficiossociales;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface BeneficiossocialesFacadeLocal {

    void create(Beneficiossociales beneficiossociales);

    void edit(Beneficiossociales beneficiossociales);

    void remove(Beneficiossociales beneficiossociales);

    Beneficiossociales find(Object id);

    List<Beneficiossociales> findAll();

    List<Beneficiossociales> findRange(int[] range);

    int count();
    
}
