/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package caseAdmin.session;

import caseAdmin.entity.AssignedCase;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Andrei
 */
@Local
public interface AssignedCaseFacadeLocal {

    public boolean checkIfLast();

    public int getLast();

    void create(AssignedCase assignedCase);

    void edit(AssignedCase assignedCase);

    void remove(AssignedCase assignedCase);

    AssignedCase find(Object id);

    List<AssignedCase> findAll();

}
