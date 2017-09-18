/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package caseAdmin.session;

import caseAdmin.entity.Tbluser;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Andrei
 */
@Local
public interface TbluserFacadeLocal {

    public void updatePassword(String pass, Integer id);

    boolean checkUsername(String username);

    public boolean checkValid(String username, String password);

    public List<Tbluser> findThisRecord(String search);

    public boolean findThisRecordTF(String search);

    public Tbluser findThisUser(String username, String password);

    void create(Tbluser tbluser);

    void edit(Tbluser tbluser);

    void remove(Tbluser tbluser);

    Tbluser find(Object id);

    List<Tbluser> findAll();

}
