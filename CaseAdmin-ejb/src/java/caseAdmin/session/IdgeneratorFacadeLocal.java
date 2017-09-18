/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package caseAdmin.session;

import caseAdmin.entity.Idgenerator;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Andrei
 */
@Local
public interface IdgeneratorFacadeLocal {

    public void updateNextNumber(int parseInt, String string);

    void create(Idgenerator idgenerator);

    void edit(Idgenerator idgenerator);

    void remove(Idgenerator idgenerator);

    Idgenerator find(Object id);

    List<Idgenerator> findAll();

}
