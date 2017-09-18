/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package caseAdmin.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Andrei
 */
@Entity
@Table(name = "case_entries")
@NamedQueries({@NamedQuery(name = "CaseEntries.findAll", query = "SELECT c FROM CaseEntries c"), @NamedQuery(name = "CaseEntries.findById", query = "SELECT c FROM CaseEntries c WHERE c.id = :id"), @NamedQuery(name = "CaseEntries.findByCaseNo", query = "SELECT c FROM CaseEntries c WHERE c.caseNo = :caseNo"), @NamedQuery(name = "CaseEntries.findByCaseTitle", query = "SELECT c FROM CaseEntries c WHERE c.caseTitle = :caseTitle"), @NamedQuery(name = "CaseEntries.findByNatureOfCase", query = "SELECT c FROM CaseEntries c WHERE c.natureOfCase = :natureOfCase"), @NamedQuery(name = "CaseEntries.findByCaseCategory", query = "SELECT c FROM CaseEntries c WHERE c.caseCategory = :caseCategory"), @NamedQuery(name = "CaseEntries.findByCaseStatus", query = "SELECT c FROM CaseEntries c WHERE c.caseStatus = :caseStatus")})
@NamedNativeQueries({
    @NamedNativeQuery(name = "CaseEntries.getLastId", query = "SELECT * FROM case_entries ORDER BY id DESC LIMIT 1", resultClass=CaseEntries.class),
    @NamedNativeQuery(name = "CaseEntries.getCaseNo", query = "SELECT * FROM case_entries WHERE caseNo = ?", resultClass = CaseEntries.class),
    @NamedNativeQuery(name = "CaseEntries.findCaseNumber", query = "SELECT * FROM case_entries WHERE caseNo = ?", resultClass=CaseEntries.class),
    @NamedNativeQuery(name = "CaseEntries.checkCaseCount", query = "SELECT * FROM case_entries WHERE caseNo = ?", resultClass=CaseEntries.class),
    @NamedNativeQuery(name = "CaseEntries.findPending", query = "SELECT * FROM case_entries WHERE caseStatus = 'Pending'", resultClass=CaseEntries.class),
    @NamedNativeQuery(name = "CaseEntries.checkPending", query = "SELECT * FROM case_entries WHERE caseStatus = 'Pending'", resultClass=CaseEntries.class)
})
public class CaseEntries implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "caseNo")
    private String caseNo;
    @Basic(optional = false)
    @Column(name = "caseTitle")
    private String caseTitle;
    @Column(name = "natureOfCase")
    private String natureOfCase;
    @Basic(optional = false)
    @Column(name = "caseCategory")
    private String caseCategory;
    @Basic(optional = false)
    @Column(name = "caseStatus")
    private String caseStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "caseId")
    private List<AssignedCase> assignedCaseCollection;

    public CaseEntries() {
    }

    public CaseEntries(Integer id) {
        this.id = id;
    }

    public CaseEntries(Integer id, String caseNo, String caseTitle, String caseCategory, String caseStatus) {
        this.id = id;
        this.caseNo = caseNo;
        this.caseTitle = caseTitle;
        this.caseCategory = caseCategory;
        this.caseStatus = caseStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public String getCaseTitle() {
        return caseTitle;
    }

    public void setCaseTitle(String caseTitle) {
        this.caseTitle = caseTitle;
    }

    public String getNatureOfCase() {
        return natureOfCase;
    }

    public void setNatureOfCase(String natureOfCase) {
        this.natureOfCase = natureOfCase;
    }

    public String getCaseCategory() {
        return caseCategory;
    }

    public void setCaseCategory(String caseCategory) {
        this.caseCategory = caseCategory;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    public List<AssignedCase> getAssignedCaseCollection() {
        return assignedCaseCollection;
    }

    public void setAssignedCaseCollection(List<AssignedCase> assignedCaseCollection) {
        this.assignedCaseCollection = assignedCaseCollection;
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
        if (!(object instanceof CaseEntries)) {
            return false;
        }
        CaseEntries other = (CaseEntries) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "caseAdmin.entity.CaseEntries[id=" + id + "]";
    }

}
