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
@Table(name = "permissiontbl")
@NamedQueries({@NamedQuery(name = "Permissiontbl.findAll", query = "SELECT p FROM Permissiontbl p"), @NamedQuery(name = "Permissiontbl.findById", query = "SELECT p FROM Permissiontbl p WHERE p.id = :id"), @NamedQuery(name = "Permissiontbl.findByName", query = "SELECT p FROM Permissiontbl p WHERE p.name = :name"), @NamedQuery(name = "Permissiontbl.findByValue", query = "SELECT p FROM Permissiontbl p WHERE p.value = :value")})
@NamedNativeQueries({
    @NamedNativeQuery(name = "Permissiontbl.getAvailablePermissions", query = "select * from permissiontbl where permissiontbl.id  not in (select permission_id from assigned_permission s inner join permissiontbl c on s.permission_id  = c.id where s.user_id = ?)", resultClass=Permissiontbl.class)
})
public class Permissiontbl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "value")
    private String value;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permissionId")
    private List<AssignedPermission> assignedPermissionCollection;

    public Permissiontbl() {
    }

    public Permissiontbl(Integer id) {
        this.id = id;
    }

    public Permissiontbl(Integer id, String name, String value) {
        this.id = id;
        this.name = name;
        this.value = value;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<AssignedPermission> getAssignedPermissionCollection() {
        return assignedPermissionCollection;
    }

    public void setAssignedPermissionCollection(List<AssignedPermission> assignedPermissionCollection) {
        this.assignedPermissionCollection = assignedPermissionCollection;
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
        if (!(object instanceof Permissiontbl)) {
            return false;
        }
        Permissiontbl other = (Permissiontbl) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "caseAdmin.entity.Permissiontbl[id=" + id + "]";
    }

}
