/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package caseadminwar.pages;

import caseAdmin.entity.AssignedPermission;
import caseAdmin.entity.CaseEntries;
import caseAdmin.entity.Permissiontbl;
import caseAdmin.entity.Tbluser;
import caseAdmin.session.AssignedPermissionFacadeLocal;
import caseAdmin.session.CaseEntriesFacadeLocal;
import caseAdmin.session.PermissiontblFacadeLocal;
import caseAdmin.session.TbluserFacadeLocal;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.Table;
import com.sun.webui.jsf.component.TableRowGroup;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.DefaultTableDataProvider;
import javax.ejb.EJB;
import javax.faces.FacesException;
import caseadminwar.ApplicationBean1;
import caseadminwar.SessionBean1;
import caseadminwar.RequestBean1;
import com.sun.data.provider.RowKey;
import java.util.List;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version MainMenu.java
 * @version Created on Sep 16, 2017, 12:14:13 AM
 * @author Andrei
 */

public class MainMenu extends AbstractPageBean {
    @EJB
    private CaseEntriesFacadeLocal caseEntriesFacade;
    @EJB
    private TbluserFacadeLocal tbluserFacade;
    @EJB
    private PermissiontblFacadeLocal permissiontblFacade;
    @EJB
    private AssignedPermissionFacadeLocal assignedPermissionFacade;
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private TextField logged_user = new TextField();

    public TextField getLogged_user() {
        return logged_user;
    }

    public void setLogged_user(TextField tf) {
        this.logged_user = tf;
    }
    private Button btnAdd = new Button();

    public Button getBtnAdd() {
        return btnAdd;
    }

    public void setBtnAdd(Button b) {
        this.btnAdd = b;
    }
    private Button btnRemove = new Button();

    public Button getBtnRemove() {
        return btnRemove;
    }

    public void setBtnRemove(Button b) {
        this.btnRemove = b;
    }
    private TableRowGroup tableRowGroup4 = new TableRowGroup();

    public TableRowGroup getTableRowGroup4() {
        return tableRowGroup4;
    }

    public void setTableRowGroup4(TableRowGroup trg) {
        this.tableRowGroup4 = trg;
    }
    private TableRowGroup tableRowGroup3 = new TableRowGroup();

    public TableRowGroup getTableRowGroup3() {
        return tableRowGroup3;
    }

    public void setTableRowGroup3(TableRowGroup trg) {
        this.tableRowGroup3 = trg;
    }
    private TableRowGroup tableRowGroup2 = new TableRowGroup();

    public TableRowGroup getTableRowGroup2() {
        return tableRowGroup2;
    }

    public void setTableRowGroup2(TableRowGroup trg) {
        this.tableRowGroup2 = trg;
    }
    private TableRowGroup tableRowGroup1 = new TableRowGroup();

    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }

    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
    }
    private Button bntLogout = new Button();

    public Button getBntLogout() {
        return bntLogout;
    }

    public void setBntLogout(Button b) {
        this.bntLogout = b;
    }
    private Table table1 = new Table();

    public Table getTable1() {
        return table1;
    }

    public void setTable1(Table t) {
        this.table1 = t;
    }
    private Table table2 = new Table();

    public Table getTable2() {
        return table2;
    }

    public void setTable2(Table t) {
        this.table2 = t;
    }
    private Table table3 = new Table();

    public Table getTable3() {
        return table3;
    }

    public void setTable3(Table t) {
        this.table3 = t;
    }
    private Table table4 = new Table();

    public Table getTable4() {
        return table4;
    }

    public void setTable4(Table t) {
        this.table4 = t;
    }
    private Table table5 = new Table();

    public Table getTable5() {
        return table5;
    }

    public void setTable5(Table t) {
        this.table5 = t;
    }
    private TableRowGroup tableRowGroup5 = new TableRowGroup();

    public TableRowGroup getTableRowGroup5() {
        return tableRowGroup5;
    }

    public void setTableRowGroup5(TableRowGroup trg) {
        this.tableRowGroup5 = trg;
    }
    private Button btnUpdate = new Button();

    public Button getBtnUpdate() {
        return btnUpdate;
    }

    public void setBtnUpdate(Button b) {
        this.btnUpdate = b;
    }
    private Button btnUpdate1 = new Button();

    public Button getBtnUpdate1() {
        return btnUpdate1;
    }

    public void setBtnUpdate1(Button b) {
        this.btnUpdate1 = b;
    }
    private Table table6 = new Table();

    public Table getTable6() {
        return table6;
    }

    public void setTable6(Table t) {
        this.table6 = t;
    }
    private TableRowGroup tableRowGroup6 = new TableRowGroup();

    public TableRowGroup getTableRowGroup6() {
        return tableRowGroup6;
    }

    public void setTableRowGroup6(TableRowGroup trg) {
        this.tableRowGroup6 = trg;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public MainMenu() {
    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     * 
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
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
            log("MainMenu Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    @Override
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    @Override
    public void prerender() {
        SessionBean1 sb1 = this.getSessionBean1();
        Tbluser user = sb1.getUserForPermission();
        Tbluser logged_in_user = sb1.getLoggged_in_user();
        this.logged_user.setText(logged_in_user.getFirstName() + " " + logged_in_user.getLastName());
        List<Permissiontbl> permissions = permissiontblFacade.findAll();
        Permissiontbl[] array_of_permissions = permissions.toArray(new Permissiontbl[0]);
        sb1.setPermissionarray(array_of_permissions);
        List<AssignedPermission> list_of_assigned_permission = assignedPermissionFacade.getUserPermissions(user.getId());
        AssignedPermission[] assigned_permission_array = list_of_assigned_permission.toArray(new AssignedPermission[0]);
        sb1.setAssigned_permissions_array(assigned_permission_array);
        List<Permissiontbl> list_of_available_permission = permissiontblFacade.getUserAvailablePermissions(user.getId());
        Permissiontbl[] array_of_available_permission = list_of_available_permission.toArray(new Permissiontbl[0]);
        sb1.setAvailable_permission_array(array_of_available_permission);
        List<CaseEntries> list_of_case = caseEntriesFacade.findAll();
        CaseEntries[] array_of_cases = list_of_case.toArray(new CaseEntries[0]);
        sb1.setCase_entry_view_raffle(array_of_cases);
        List<Tbluser> list_of_users = tbluserFacade.findAll();
        Tbluser[] array_of_users = list_of_users.toArray(new Tbluser[0]);
        sb1.setUserArray(array_of_users);
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
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

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    public String btnAdd_action() {
        int new_id = 1;
        try{
             AssignedPermission last_perm = assignedPermissionFacade.getLastPermission();
             new_id = last_perm.getId() + 1;
        }
        catch(NullPointerException ex){
        }
        AssignedPermission new_perm = new AssignedPermission();
        SessionBean1 sb1 = this.getSessionBean1();
        RowKey rowKey = this.tableRowGroup3.getRowKey();
        String rowId = rowKey.getRowId();
        Permissiontbl[] array_of_available_permission = sb1.getAvailable_permission_array();
        Permissiontbl selected_permission = array_of_available_permission[Integer.parseInt(rowId)];
        new_perm.setId(new_id);
        new_perm.setPermissionId(selected_permission);
        new_perm.setUserId(sb1.getUserForPermission());
        new_perm.setPermissionStatus("Y");
        new_perm.setDescription(selected_permission.getName());
        assignedPermissionFacade.create(new_perm);
        List<AssignedPermission> list_of_assigned_permission = assignedPermissionFacade.getUserPermissions(sb1.getUserForPermission().getId());
        AssignedPermission[] assigned_permission_array = list_of_assigned_permission.toArray(new AssignedPermission[0]);
        sb1.setAssigned_permissions_array(assigned_permission_array);

        return null;
    }

    public String btnRemove_action() {
        SessionBean1 sb1 = this.getSessionBean1();
        RowKey rowKey = this.tableRowGroup4.getRowKey();
        String rowId = rowKey.getRowId();
        AssignedPermission[] a_permissions = sb1.getAssigned_permissions_array();
        AssignedPermission asperm = a_permissions[Integer.parseInt(rowId)];
        assignedPermissionFacade.remove(asperm);
        return null;
    }

    public String hyperlink1_action() {
        SessionBean1 sb1 = this.getSessionBean1();
        RowKey rowKey = this.tableRowGroup1.getRowKey();
        String rowId = rowKey.getRowId();
        AssignedPermission[] a_permissions = sb1.getAssigned_permissions_array();
        AssignedPermission asperm = a_permissions[Integer.parseInt(rowId)];
        String link_target = "";
        List<Permissiontbl> list_of_permissions = permissiontblFacade.findAll();
        Permissiontbl[] array_of_permissions = list_of_permissions.toArray(new Permissiontbl[0]);

        for(int i = 0; i < array_of_permissions.length; i++){
            if(array_of_permissions[i].getId().toString().equals(asperm.getPermissionId().getId().toString())){
                link_target = array_of_permissions[i].getValue().toString();
                if(link_target.equals("menu_editCase")){
                    this.table5.setVisible(true);
                    this.table6.setVisible(false);
                }else if(link_target.equals("menu_editUser")){
                    this.table6.setVisible(true);
                    this.table5.setVisible(false);
                }
                else{
                    this.table5.setVisible(false);
                    this.table6.setVisible(false);
                    return link_target;
                }
            }
        }
        return null;
    }

    public String bntLogout_action() {
        SessionBean1 sb1 = this.getSessionBean1();
        Tbluser resetUser = new Tbluser();
        sb1.setUserForPermission(resetUser);
        sb1.setLoggged_in_user(resetUser);
        return "menu_login";
    }

    public String btnUpdate1_action() {
        SessionBean1 sb1 = this.getSessionBean1();
        RowKey rowKey = this.tableRowGroup6.getRowKey();
        String rowId = rowKey.getRowId();
        Tbluser[] userArray = sb1.getUserArray();
        Tbluser userForEdit = userArray[Integer.parseInt(rowId)];
        sb1.setUserDataForEdit(userForEdit);
        return "menu_editUser";
    }

    public String btnUpdate_action() {
        SessionBean1 sb1 = this.getSessionBean1();
        RowKey rowKey = this.tableRowGroup5.getRowKey();
        String rowId = rowKey.getRowId();
        CaseEntries[] caseArray = sb1.getCase_entry_view_raffle();
        CaseEntries caseForEdit = caseArray[Integer.parseInt(rowId)];
        sb1.setCase_entry_for_edit(caseForEdit);
        return "menu_editCase";
    }
    
}

