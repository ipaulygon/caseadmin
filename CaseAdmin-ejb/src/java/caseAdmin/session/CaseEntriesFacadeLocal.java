/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package caseAdmin.session;

import caseAdmin.entity.CaseEntries;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Andrei
 */
@Local
public interface CaseEntriesFacadeLocal {

    public boolean checkCaseCount(String find_case);

    public boolean checkCaseNo(String caseNumber);

    public boolean checkPending();

    public List<CaseEntries> findAllPending();

    public List<CaseEntries> findCaseNumber(String find_case);

    public int getLastid();

    void create(CaseEntries caseEntries);

    void edit(CaseEntries caseEntries);

    void remove(CaseEntries caseEntries);

    CaseEntries find(Object id);

    List<CaseEntries> findAll();

}
