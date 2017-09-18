/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package caseadminwar.pages;

import caseAdmin.entity.CaseEntries;
import caseAdmin.session.CaseEntriesFacadeLocal;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.MessageGroup;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import javax.ejb.EJB;
import javax.faces.FacesException;
import caseadminwar.ApplicationBean1;
import caseadminwar.SessionBean1;
import caseadminwar.RequestBean1;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version AddCase.java
 * @version Created on Sep 16, 2017, 2:53:38 AM
 * @author Andrei
 */

public class AddCase extends AbstractPageBean {
    @EJB
    private CaseEntriesFacadeLocal caseEntriesFacade;
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        txtCategoryDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("Civil Case", "Civil Case"), new com.sun.webui.jsf.model.Option("Criminal Case", "Criminal Case"), new com.sun.webui.jsf.model.Option("Special Case", "Special Case")});
        txtStatusDefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("Pending", "Pending")});
    }
    private SingleSelectOptionsList txtCategoryDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getTxtCategoryDefaultOptions() {
        return txtCategoryDefaultOptions;
    }

    public void setTxtCategoryDefaultOptions(SingleSelectOptionsList ssol) {
        this.txtCategoryDefaultOptions = ssol;
    }
    private SingleSelectOptionsList txtStatusDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getTxtStatusDefaultOptions() {
        return txtStatusDefaultOptions;
    }

    public void setTxtStatusDefaultOptions(SingleSelectOptionsList ssol) {
        this.txtStatusDefaultOptions = ssol;
    }
    private TextField txtNo = new TextField();

    public TextField getTxtNo() {
        return txtNo;
    }

    public void setTxtNo(TextField tf) {
        this.txtNo = tf;
    }
    private TextArea txtTitle = new TextArea();

    public TextArea getTxtTitle() {
        return txtTitle;
    }

    public void setTxtTitle(TextArea ta) {
        this.txtTitle = ta;
    }
    private DropDown txtCategory = new DropDown();

    public DropDown getTxtCategory() {
        return txtCategory;
    }

    public void setTxtCategory(DropDown dd) {
        this.txtCategory = dd;
    }
    private DropDown txtStatus = new DropDown();

    public DropDown getTxtStatus() {
        return txtStatus;
    }

    public void setTxtStatus(DropDown dd) {
        this.txtStatus = dd;
    }
    private Button btnBack = new Button();

    public Button getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(Button b) {
        this.btnBack = b;
    }
    private Button btnSubmit = new Button();

    public Button getBtnSubmit() {
        return btnSubmit;
    }

    public void setBtnSubmit(Button b) {
        this.btnSubmit = b;
    }
    private MessageGroup info = new MessageGroup();

    public MessageGroup getInfo() {
        return info;
    }

    public void setInfo(MessageGroup mg) {
        this.info = mg;
    }
    private TextArea txtNature = new TextArea();

    public TextArea getTxtNature() {
        return txtNature;
    }

    public void setTxtNature(TextArea ta) {
        this.txtNature = ta;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public AddCase() {
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
            log("AddCase Initialization Failure", e);
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

    public String btnBack_action() {
        return "addCase_menu";
    }

    public String btnSubmit_action() {
        String no = "";
        String title = "";
        String nature = (String) this.txtNature.getText();
        String category = "";
        String status = "Pending";
        try{
            no = (String) this.txtNo.getText();
            title = (String) this.txtTitle.getText();
            category = (String) this.txtCategory.getValue();
            boolean checkIfExists = caseEntriesFacade.checkCaseNo(no);
            if(!checkIfExists){
                CaseEntries newCase = new CaseEntries();
                int last_id = caseEntriesFacade.getLastid();
                newCase.setCaseNo(no);
                newCase.setCaseTitle(title);
                newCase.setCaseStatus(status);
                newCase.setNatureOfCase(nature);
                newCase.setCaseCategory(category);
                newCase.setId(last_id);
                caseEntriesFacade.create(newCase);
                this.info("New Case Added.");
            }else{
                this.info("Case No. already used.");
            }
        }catch(Exception e){
            this.info("Error");
        }
        return null;
    }
    
}

