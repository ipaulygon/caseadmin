/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package caseAdmin.session;

import caseAdmin.entity.Justice;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Andrei
 */
@Local
public interface JusticeFacadeLocal {

    void create(Justice justice);

    void edit(Justice justice);

    void remove(Justice justice);

    Justice find(Object id);

    List<Justice> findAll();

}
