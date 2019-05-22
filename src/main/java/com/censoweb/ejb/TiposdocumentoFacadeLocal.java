/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.censoweb.ejb;

import com.censoweb.model.Tiposdocumento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author luisg
 */
@Local
public interface TiposdocumentoFacadeLocal {

    void create(Tiposdocumento tiposdocumento);

    void edit(Tiposdocumento tiposdocumento);

    void remove(Tiposdocumento tiposdocumento);

    Tiposdocumento find(Object id);

    List<Tiposdocumento> findAll();

    List<Tiposdocumento> findRange(int[] range);

    int count();
    
}
