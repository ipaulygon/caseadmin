/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package caseAdmin.session;

import caseAdmin.entity.Justice;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Andrei
 */
@Stateless
public class JusticeFacade implements JusticeFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(Justice justice) {
        em.persist(justice);
    }

    public void edit(Justice justice) {
        em.merge(justice);
    }

    public void remove(Justice justice) {
        em.remove(em.merge(justice));
    }

    public Justice find(Object id) {
        return em.find(Justice.class, id);
    }

    public List<Justice> findAll() {
        return em.createQuery("select object(o) from Justice as o").getResultList();
    }

}
