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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Andrei
 */
@Entity
@Table(name = "justice")
@NamedQueries({@NamedQuery(name = "Justice.findAll", query = "SELECT j FROM Justice j"), @NamedQuery(name = "Justice.findById", query = "SELECT j FROM Justice j WHERE j.id = :id"), @NamedQuery(name = "Justice.findByName", query = "SELECT j FROM Justice j WHERE j.name = :name")})
public class Justice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "justiceId")
    private List<AssignedCase> assignedCaseCollection;

    public Justice() {
    }

    public Justice(Integer id) {
        this.id = id;
    }

    public Justice(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (!(object instanceof Justice)) {
            return false;
        }
        Justice other = (Justice) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "caseAdmin.entity.Justice[id=" + id + "]";
    }

}
