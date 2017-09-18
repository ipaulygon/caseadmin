/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package caseAdmin.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Andrei
 */
@Entity
@Table(name = "idgenerator")
@NamedQueries({@NamedQuery(name = "Idgenerator.findAll", query = "SELECT i FROM Idgenerator i"), @NamedQuery(name = "Idgenerator.findByTableName", query = "SELECT i FROM Idgenerator i WHERE i.tableName = :tableName"), @NamedQuery(name = "Idgenerator.findByNextNumber", query = "SELECT i FROM Idgenerator i WHERE i.nextNumber = :nextNumber")})
@NamedNativeQueries({
    @NamedNativeQuery(name="Idgenerator.updateNextNumber",query="UPDATE idgenerator SET nextNumber = ? WHERE tableName = ?")
})
public class Idgenerator implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "tableName")
    private String tableName;
    @Basic(optional = false)
    @Column(name = "nextNumber")
    private int nextNumber;

    public Idgenerator() {
    }

    public Idgenerator(String tableName) {
        this.tableName = tableName;
    }

    public Idgenerator(String tableName, int nextNumber) {
        this.tableName = tableName;
        this.nextNumber = nextNumber;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public int getNextNumber() {
        return nextNumber;
    }

    public void setNextNumber(int nextNumber) {
        this.nextNumber = nextNumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tableName != null ? tableName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Idgenerator)) {
            return false;
        }
        Idgenerator other = (Idgenerator) object;
        if ((this.tableName == null && other.tableName != null) || (this.tableName != null && !this.tableName.equals(other.tableName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "caseAdmin.entity.Idgenerator[tableName=" + tableName + "]";
    }

}
