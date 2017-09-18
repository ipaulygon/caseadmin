/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package caseAdmin.session;

import caseAdmin.entity.AssignedPermission;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Andrei
 */
@Local
public interface AssignedPermissionFacadeLocal {

    public void changeStatus(String string, Integer id);

    public boolean checkIfHavePermissionToRegister(Integer id);

    public AssignedPermission getLastPermission();

    public List<AssignedPermission> getUserPermissions(Integer id);

    void create(AssignedPermission assignedPermission);

    void edit(AssignedPermission assignedPermission);

    void remove(AssignedPermission assignedPermission);

    AssignedPermission find(Object id);

    List<AssignedPermission> findAll();

}
