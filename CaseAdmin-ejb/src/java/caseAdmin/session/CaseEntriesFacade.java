/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package caseAdmin.session;

import caseAdmin.entity.CaseEntries;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Andrei
 */
@Stateless
public class CaseEntriesFacade implements CaseEntriesFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(CaseEntries caseEntries) {
        em.persist(caseEntries);
    }

    public void edit(CaseEntries caseEntries) {
        em.merge(caseEntries);
    }

    public void remove(CaseEntries caseEntries) {
        em.remove(em.merge(caseEntries));
    }

    public CaseEntries find(Object id) {
        return em.find(CaseEntries.class, id);
    }

    public List<CaseEntries> findAll() {
        return em.createQuery("select object(o) from CaseEntries as o").getResultList();
    }

    public int getLastid() {
        List<CaseEntries> list = em.createNamedQuery("CaseEntries.getLastId")
                .getResultList();
        if(list.size() <= 0){
            return 1;
        }
        else{
            CaseEntries[] array_of_case = list.toArray(new CaseEntries[0]);
            CaseEntries last_entry = array_of_case[0];
            return (last_entry.getId() + 1);
        }
    }

    public boolean checkCaseNo(String caseNumber) {
        List<CaseEntries> list = em.createNamedQuery("CaseEntries.getCaseNo")
                .setParameter(1, caseNumber)
                .getResultList();
        if(list.size() > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public List<CaseEntries> findCaseNumber(String find_case) {
        List<CaseEntries> list = em.createNamedQuery("CaseEntries.findCaseNumber")
                .setParameter(1, find_case)
                .getResultList();
        return list;
    }

    public boolean checkCaseCount(String find_case) {
        List<CaseEntries> list = em.createNamedQuery("CaseEntries.checkCaseCount")
                .setParameter(1, find_case)
                .getResultList();
        if(list.size() > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public List<CaseEntries> findAllPending() {
        List<CaseEntries> list = em.createNamedQuery("CaseEntries.findPending")
                .getResultList();
        return list;
    }

    public boolean checkPending() {
        List<CaseEntries> list = em.createNamedQuery("CaseEntries.checkPending")
                .getResultList();
        if(list.size() > 0){
            return true;
        }
        else{
            return false;
        }
    }

}
