/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package caseAdmin.session;

import caseAdmin.entity.AssignedPermission;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Andrei
 */
@Stateless
public class AssignedPermissionFacade implements AssignedPermissionFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(AssignedPermission assignedPermission) {
        em.persist(assignedPermission);
    }

    public void edit(AssignedPermission assignedPermission) {
        em.merge(assignedPermission);
    }

    public void remove(AssignedPermission assignedPermission) {
        em.remove(em.merge(assignedPermission));
    }

    public AssignedPermission find(Object id) {
        return em.find(AssignedPermission.class, id);
    }

    public List<AssignedPermission> findAll() {
        return em.createQuery("select object(o) from AssignedPermission as o").getResultList();
    }

    public List<AssignedPermission> getUserPermissions(Integer id) {
        List<AssignedPermission> list_of_permission = em.createNamedQuery("AssignedPermission.getUserPermissions")
                .setParameter(1, id)
                .getResultList();
        return list_of_permission;
    }

    public void changeStatus(String string, Integer id) {
        int status = 0;
        if(string.equals("Y")){
            status = 0;
        }
        else{
            status = 1;
        }
        switch(status){
            case 0 :
                em.createNamedQuery("AssignedPermission.setStatus")
                .setParameter(2, id)
                .setParameter(1, "Y")
                .executeUpdate();
                break;
            case 1 :
                em.createNamedQuery("AssignedPermission.setStatus")
                .setParameter(2, id)
                .setParameter(1, "N")
                .executeUpdate();
                break;
        }
    }

    public AssignedPermission getLastPermission() {
        AssignedPermission permission;
        try{

        permission = (AssignedPermission) em.createNamedQuery("AssignedPermission.getLast")
                .getSingleResult();
        return permission;
        }
        catch(javax.persistence.NoResultException ex){
            return new AssignedPermission();
        }
    }

    public boolean checkIfHavePermissionToRegister(Integer id) {
        List<AssignedPermission> permission = em.createNamedQuery("AssignedPermission.checkIfHavePermissionToRegister")
                .setParameter(1, id)
                .getResultList();
        if(permission.size() == 0){
            return false;
        }
        else{
            return true;
        }
    }

}
