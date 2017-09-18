/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package caseAdmin.session;

import caseAdmin.entity.AssignedCase;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Andrei
 */
@Stateless
public class AssignedCaseFacade implements AssignedCaseFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(AssignedCase assignedCase) {
        em.persist(assignedCase);
    }

    public void edit(AssignedCase assignedCase) {
        em.merge(assignedCase);
    }

    public void remove(AssignedCase assignedCase) {
        em.remove(em.merge(assignedCase));
    }

    public AssignedCase find(Object id) {
        return em.find(AssignedCase.class, id);
    }

    public List<AssignedCase> findAll() {
        return em.createQuery("select object(o) from AssignedCase as o").getResultList();
    }

    public boolean checkIfLast() {
        List<AssignedCase> list_of_case = em.createNamedQuery("AssignedCase.checkIfLast")
                .getResultList();
        if(list_of_case.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public int getLast() {
        List<AssignedCase> list_of_case = em.createNamedQuery("AssignedCase.getLast")
                .getResultList();
        if(list_of_case.size() > 0){
            AssignedCase[] array = list_of_case.toArray(new AssignedCase[0]);
            AssignedCase ascase = array[0];
            return ascase.getId() + 1;
        }
        else{
            return 1;
        }
    }

}
