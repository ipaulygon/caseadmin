/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package caseadminwar;

import caseAdmin.entity.AssignedCase;
import caseAdmin.entity.AssignedPermission;
import caseAdmin.entity.CaseEntries;
import caseAdmin.entity.Justice;
import caseAdmin.entity.Permissiontbl;
import caseAdmin.entity.Tbluser;
import com.sun.rave.web.ui.appbase.AbstractSessionBean;
import javax.faces.FacesException;

/**
 * <p>Session scope data bean for your application.  Create properties
 *  here to represent cached data that should be made available across
 *  multiple HTTP requests for an individual user.</p>
 *
 * <p>An instance of this class will be created for you automatically,
 * the first time your application evaluates a value binding expression
 * or method binding expression that references a managed bean using
 * this class.</p>
 *
 * @version SessionBean1.java
 * @version Created on Sep 15, 2017, 11:58:55 PM
 * @author Andrei
 */

public class SessionBean1 extends AbstractSessionBean {    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    // </editor-fold>

    private Tbluser userData;
    private Tbluser[] userArray;
    private Tbluser[] userArrayForEdit;
    private Tbluser userDataForEdit;
    private String searchFor;
    private Permissiontbl[] permissionarray;
    private Tbluser userForPermission;

    private AssignedPermission[] assigned_permissions_array;
    private AssignedPermission assigned_permission;

    private Tbluser loggged_in_user;

    private CaseEntries[] case_entry_view_raffle;
    private CaseEntries case_entry_for_edit;
    private Permissiontbl[] available_permission_array;

    public Permissiontbl[] getAvailable_permission_array() {
        return available_permission_array;
    }

    public void setAvailable_permission_array(Permissiontbl[] available_permission_array) {
        this.available_permission_array = available_permission_array;
    }

    public AssignedCase[] getAssigned_case_array() {
        return assigned_case_array;
    }

    public void setAssigned_case_array(AssignedCase[] assigned_case_array) {
        this.assigned_case_array = assigned_case_array;
    }

    public AssignedPermission getAssigned_permission() {
        return assigned_permission;
    }

    public void setAssigned_permission(AssignedPermission assigned_permission) {
        this.assigned_permission = assigned_permission;
    }

    public AssignedPermission[] getAssigned_permissions_array() {
        return assigned_permissions_array;
    }

    public void setAssigned_permissions_array(AssignedPermission[] assigned_permissions_array) {
        this.assigned_permissions_array = assigned_permissions_array;
    }

    public CaseEntries getCase_entry_for_edit() {
        return case_entry_for_edit;
    }

    public void setCase_entry_for_edit(CaseEntries case_entry_for_edit) {
        this.case_entry_for_edit = case_entry_for_edit;
    }

    public CaseEntries[] getCase_entry_view_raffle() {
        return case_entry_view_raffle;
    }

    public void setCase_entry_view_raffle(CaseEntries[] case_entry_view_raffle) {
        this.case_entry_view_raffle = case_entry_view_raffle;
    }

    public Justice[] getJustice_array() {
        return justice_array;
    }

    public void setJustice_array(Justice[] justice_array) {
        this.justice_array = justice_array;
    }

    public Tbluser getLoggged_in_user() {
        return loggged_in_user;
    }

    public void setLoggged_in_user(Tbluser loggged_in_user) {
        this.loggged_in_user = loggged_in_user;
    }

    public Permissiontbl[] getPermissionarray() {
        return permissionarray;
    }

    public void setPermissionarray(Permissiontbl[] permissionarray) {
        this.permissionarray = permissionarray;
    }

    public String getSearchFor() {
        return searchFor;
    }

    public void setSearchFor(String searchFor) {
        this.searchFor = searchFor;
    }

    public Tbluser[] getUserArray() {
        return userArray;
    }

    public void setUserArray(Tbluser[] userArray) {
        this.userArray = userArray;
    }

    public Tbluser[] getUserArrayForEdit() {
        return userArrayForEdit;
    }

    public void setUserArrayForEdit(Tbluser[] userArrayForEdit) {
        this.userArrayForEdit = userArrayForEdit;
    }

    public Tbluser getUserData() {
        return userData;
    }

    public void setUserData(Tbluser userData) {
        this.userData = userData;
    }

    public Tbluser getUserDataForEdit() {
        return userDataForEdit;
    }

    public void setUserDataForEdit(Tbluser userDataForEdit) {
        this.userDataForEdit = userDataForEdit;
    }

    public Tbluser getUserForPermission() {
        return userForPermission;
    }

    public void setUserForPermission(Tbluser userForPermission) {
        this.userForPermission = userForPermission;
    }

    private Justice[] justice_array;
    private AssignedCase[] assigned_case_array;
    /**
     * <p>Construct a new session data bean instance.</p>
     */
    public SessionBean1() {
    }


    /**
     * <p>This method is called when this bean is initially added to
     * session scope.  Typically, this occurs as a result of evaluating
     * a value binding or method binding expression, which utilizes the
     * managed bean facility to instantiate this bean and store it into
     * session scope.</p>
     * 
     * <p>You may customize this method to initialize and cache data values
     * or resources that are required for the lifetime of a particular
     * user session.</p>
     */
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("SessionBean1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }

    /**
     * <p>This method is called when the session containing it is about to be
     * passivated.  Typically, this occurs in a distributed servlet container
     * when the session is about to be transferred to a different
     * container instance, after which the <code>activate()</code> method
     * will be called to indicate that the transfer is complete.</p>
     * 
     * <p>You may customize this method to release references to session data
     * or resources that can not be serialized with the session itself.</p>
     */
    @Override
    public void passivate() {
    }

    /**
     * <p>This method is called when the session containing it was
     * reactivated.</p>
     * 
     * <p>You may customize this method to reacquire references to session
     * data or resources that could not be serialized with the
     * session itself.</p>
     */
    @Override
    public void activate() {
    }

    /**
     * <p>This method is called when this bean is removed from
     * session scope.  Typically, this occurs as a result of
     * the session timing out or being terminated by the application.</p>
     * 
     * <p>You may customize this method to clean up resources allocated
     * during the execution of the <code>init()</code> method, or
     * at any later time during the lifetime of the application.</p>
     */
    @Override
    public void destroy() {
    }
    
    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

}
