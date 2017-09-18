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
@Table(name = "tbluser")
@NamedQueries({@NamedQuery(name = "Tbluser.findAll", query = "SELECT t FROM Tbluser t"), @NamedQuery(name = "Tbluser.findById", query = "SELECT t FROM Tbluser t WHERE t.id = :id"), @NamedQuery(name = "Tbluser.findByFirstName", query = "SELECT t FROM Tbluser t WHERE t.firstName = :firstName"), @NamedQuery(name = "Tbluser.findByMiddleName", query = "SELECT t FROM Tbluser t WHERE t.middleName = :middleName"), @NamedQuery(name = "Tbluser.findByLastName", query = "SELECT t FROM Tbluser t WHERE t.lastName = :lastName"), @NamedQuery(name = "Tbluser.findByUsername", query = "SELECT t FROM Tbluser t WHERE t.username = :username"), @NamedQuery(name = "Tbluser.findByPassword", query = "SELECT t FROM Tbluser t WHERE t.password = :password"), @NamedQuery(name = "Tbluser.findByIsAdmin", query = "SELECT t FROM Tbluser t WHERE t.isAdmin = :isAdmin")})
@NamedNativeQueries({
    @NamedNativeQuery(name="Tbluser.updatePassword",query="UPDATE tbluser SET password = SHA(?) WHERE id = ?"),
    @NamedNativeQuery(name="TblUser.findThisRecordTF",query="SELECT * FROM tbluser WHERE username = ?", resultClass=Tbluser.class),
    @NamedNativeQuery(name="TblUser.findThisRecord",query="SELECT* FROM tbluser WHERE username = ?", resultClass=Tbluser.class),
    @NamedNativeQuery(name="Tbluser.checkLogin",query="SELECt * FROM tbluser WHERE username = ? AND password = SHA(?)", resultClass=Tbluser.class),
    @NamedNativeQuery(name="Tbluser.checkUsername",query="SELECT * FROM tbluser WHERE username = ?", resultClass=Tbluser.class),
    @NamedNativeQuery(name="Tbluser.getUser",query="SELECT * FROM tbluser WHERE username = ? AND password = SHA(?)", resultClass=Tbluser.class)
})
public class Tbluser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "middleName")
    private String middleName;
    @Basic(optional = false)
    @Column(name = "lastName")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "isAdmin")
    private String isAdmin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private List<AssignedPermission> assignedPermissionCollection;

    public Tbluser() {
    }

    public Tbluser(Integer id) {
        this.id = id;
    }

    public Tbluser(Integer id, String firstName, String lastName, String username, String password, String isAdmin) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
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
        if (!(object instanceof Tbluser)) {
            return false;
        }
        Tbluser other = (Tbluser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "caseAdmin.entity.Tbluser[id=" + id + "]";
    }

}
