
package com.censoweb.ejb;

import com.censoweb.model.Tiposdocumento;
import java.util.List;
import javax.ejb.Local;


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
