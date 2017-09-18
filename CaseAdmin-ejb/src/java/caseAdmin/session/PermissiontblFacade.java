/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package caseAdmin.session;

import caseAdmin.entity.Permissiontbl;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Andrei
 */
@Stateless
public class PermissiontblFacade implements PermissiontblFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(Permissiontbl permissiontbl) {
        em.persist(permissiontbl);
    }

    public void edit(Permissiontbl permissiontbl) {
        em.merge(permissiontbl);
    }

    public void remove(Permissiontbl permissiontbl) {
        em.remove(em.merge(permissiontbl));
    }

    public Permissiontbl find(Object id) {
        return em.find(Permissiontbl.class, id);
    }

    public List<Permissiontbl> findAll() {
        return em.createQuery("select object(o) from Permissiontbl as o").getResultList();
    }

    public List<Permissiontbl> getUserAvailablePermissions(Integer id) {
        List<Permissiontbl> available_permissions = em.createNamedQuery("Permissiontbl.getAvailablePermissions")
                .setParameter(1, id)
                .getResultList();
        return available_permissions;
    }

}
