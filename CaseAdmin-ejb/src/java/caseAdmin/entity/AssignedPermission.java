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

/**
 *
 * @author Andrei
 */
@Entity
@Table(name = "assigned_permission")
@NamedQueries({@NamedQuery(name = "AssignedPermission.findAll", query = "SELECT a FROM AssignedPermission a"), @NamedQuery(name = "AssignedPermission.findById", query = "SELECT a FROM AssignedPermission a WHERE a.id = :id"), @NamedQuery(name = "AssignedPermission.findByDescription", query = "SELECT a FROM AssignedPermission a WHERE a.description = :description"), @NamedQuery(name = "AssignedPermission.findByPermissionStatus", query = "SELECT a FROM AssignedPermission a WHERE a.permissionStatus = :permissionStatus")})
@NamedNativeQueries({
    @NamedNativeQuery(name = "AssignedPermission.getUserPermissions", query = "SELECT * FROM assigned_permission WHERE user_id = ?", resultClass=AssignedPermission.class),
    @NamedNativeQuery(name = "AssignedPermission.setStatus", query = "UPDATE assigned_permission SET permission_status = ? WHERE id = ?"),
    @NamedNativeQuery(name = "AssignedPermission.getLast", query = "SELECT * from assigned_permission ORDER BY id DESC LIMIT 1;", resultClass=AssignedPermission.class),
    @NamedNativeQuery(name = "AssignedPermission.checkIfHavePermissionToRegister", query = "SELECT * FROM assigned_permission where user_id = ? AND permission_id = 1", resultClass = AssignedPermission.class)
})
public class AssignedPermission implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "permission_status")
    private String permissionStatus;
    @JoinColumn(name = "permission_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Permissiontbl permissionId;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Tbluser userId;

    public AssignedPermission() {
    }

    public AssignedPermission(Integer id) {
        this.id = id;
    }

    public AssignedPermission(Integer id, String permissionStatus) {
        this.id = id;
        this.permissionStatus = permissionStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPermissionStatus() {
        return permissionStatus;
    }

    public void setPermissionStatus(String permissionStatus) {
        this.permissionStatus = permissionStatus;
    }

    public Permissiontbl getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Permissiontbl permissionId) {
        this.permissionId = permissionId;
    }

    public Tbluser getUserId() {
        return userId;
    }

    public void setUserId(Tbluser userId) {
        this.userId = userId;
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
        if (!(object instanceof AssignedPermission)) {
            return false;
        }
        AssignedPermission other = (AssignedPermission) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "caseAdmin.entity.AssignedPermission[id=" + id + "]";
    }

}
