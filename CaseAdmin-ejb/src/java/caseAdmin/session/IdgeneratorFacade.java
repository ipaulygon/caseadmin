/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package caseAdmin.session;

import caseAdmin.entity.Idgenerator;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Andrei
 */
@Stateless
public class IdgeneratorFacade implements IdgeneratorFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(Idgenerator idgenerator) {
        em.persist(idgenerator);
    }

    public void edit(Idgenerator idgenerator) {
        em.merge(idgenerator);
    }

    public void remove(Idgenerator idgenerator) {
        em.remove(em.merge(idgenerator));
    }

    public Idgenerator find(Object id) {
        return em.find(Idgenerator.class, id);
    }

    public List<Idgenerator> findAll() {
        return em.createQuery("select object(o) from Idgenerator as o").getResultList();
    }

    public void updateNextNumber(int parseInt, String string) {
        em.createNamedQuery("Idgenerator.updateNextNumber")
                .setParameter(1, parseInt)
                .setParameter(2, string)
                .executeUpdate();
    }

}
