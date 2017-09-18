/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package caseAdmin.session;

import caseAdmin.entity.Tbluser;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Andrei
 */
@Stateless
public class TbluserFacade implements TbluserFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(Tbluser tbluser) {
        em.persist(tbluser);
    }

    public void edit(Tbluser tbluser) {
        em.merge(tbluser);
    }

    public void remove(Tbluser tbluser) {
        em.remove(em.merge(tbluser));
    }

    public Tbluser find(Object id) {
        return em.find(Tbluser.class, id);
    }

    public List<Tbluser> findAll() {
        return em.createQuery("select object(o) from Tbluser as o").getResultList();
    }

    public boolean checkUsername(String username) {
        List<Tbluser> userList = em.createNamedQuery("Tbluser.checkUsername")
                .setParameter(1, username)
                .getResultList();
        if(userList.size()==0){
            return true;
        }
        return false;
    }

    public void updatePassword(String pass, Integer id) {
        em.createNamedQuery("Tbluser.updatePassword")
                .setParameter(1, pass)
                .setParameter(2, id)
                .executeUpdate();
    }

    public boolean findThisRecordTF(String search) {
        List<Tbluser> listOfUsers = em.createNamedQuery("TblUser.findThisRecordTF")
                .setParameter(1, search)
                .getResultList();
        if(listOfUsers.size() > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public List<Tbluser> findThisRecord(String search) {
        List<Tbluser> listOfUsers = em.createNamedQuery("TblUser.findThisRecord")
                .setParameter(1, search)
                .getResultList();

         if(listOfUsers.size() > 0){
                return listOfUsers;
        }
        return null;

    }

    public boolean checkValid(String username, String password) {
        List<Tbluser> i = em.createNamedQuery("Tbluser.checkLogin")
                .setParameter(1, username)
                .setParameter(2, password)
                .getResultList();
        if(i.size() > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public Tbluser findThisUser(String username, String password) {
        Tbluser user = (Tbluser) em.createNamedQuery("Tbluser.getUser")
                .setParameter(1, username)
                .setParameter(2, password)
                .getSingleResult();

        return user;
    }

}
