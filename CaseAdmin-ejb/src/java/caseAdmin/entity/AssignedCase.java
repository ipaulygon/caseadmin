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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Andrei
 */
@Entity
@Table(name = "assigned_case")
@NamedQueries({@NamedQuery(name = "AssignedCase.findAll", query = "SELECT a FROM AssignedCase a"), @NamedQuery(name = "AssignedCase.findById", query = "SELECT a FROM AssignedCase a WHERE a.id = :id")})
@NamedNativeQueries({
    @NamedNativeQuery(name= "AssignedCase.checkIfLast", query = "SELECT * FROM assigned_case ORDER BY id DESC LIMIT 1", resultClass=AssignedCase.class),
    @NamedNativeQuery(name= "AssignedCase.getLast", query = "SELECT * FROM assigned_case ORDER BY id DESC LIMIT 1", resultClass=AssignedCase.class)

})
public class AssignedCase implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "case_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private CaseEntries caseId;
    @JoinColumn(name = "justice_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Justice justiceId;

    @Transient
    private String justiceName;
    @Transient
    private String caseNo;

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public String getJusticeName() {
        return justiceName;
    }

    public void setJusticeName(String justiceName) {
        this.justiceName = justiceName;
    }



    public AssignedCase() {
    }

    public AssignedCase(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CaseEntries getCaseId() {
        return caseId;
    }

    public void setCaseId(CaseEntries caseId) {
        this.caseId = caseId;
    }

    public Justice getJusticeId() {
        return justiceId;
    }

    public void setJusticeId(Justice justiceId) {
        this.justiceId = justiceId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AssignedCase)) {
            return false;
        }
        AssignedCase other = (AssignedCase) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "userEntry.AssignedCase[id=" + id + "]";
    }

}
