/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package caseAdmin.session;

import caseAdmin.entity.Permissiontbl;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Andrei
 */
@Local
public interface PermissiontblFacadeLocal {

    public List<Permissiontbl> getUserAvailablePermissions(Integer id);

    void create(Permissiontbl permissiontbl);

    void edit(Permissiontbl permissiontbl);

    void remove(Permissiontbl permissiontbl);

    Permissiontbl find(Object id);

    List<Permissiontbl> findAll();

}
