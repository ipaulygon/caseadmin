/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package caseadminwar.pages;

import caseAdmin.entity.AssignedCase;
import caseAdmin.entity.CaseEntries;
import caseAdmin.entity.Justice;
import caseAdmin.session.AssignedCaseFacadeLocal;
import caseAdmin.session.CaseEntriesFacadeLocal;
import caseAdmin.session.JusticeFacadeLocal;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.model.DefaultTableDataProvider;
import javax.ejb.EJB;
import javax.faces.FacesException;
import caseadminwar.RequestBean1;
import caseadminwar.ApplicationBean1;
import caseadminwar.SessionBean1;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version Raffle.java
 * @version Created on Sep 16, 2017, 10:45:02 AM
 * @author Andrei
 */

public class Raffle extends AbstractPageBean {
    @EJB
    private AssignedCaseFacadeLocal assignedCaseFacade;
    @EJB
    private JusticeFacadeLocal justiceFacade;
    @EJB
    private CaseEntriesFacadeLocal caseEntriesFacade;
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private Button btnGenerate = new Button();

    public Button getBtnGenerate() {
        return btnGenerate;
    }

    public void setBtnGenerate(Button b) {
        this.btnGenerate = b;
    }
    private Button btnBack = new Button();

    public Button getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(Button b) {
        this.btnBack = b;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public Raffle() {
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
            log("Raffle Initialization Failure", e);
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
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
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

    public String btnGenerate_action() {
        boolean checkPending = caseEntriesFacade.checkPending();
        if(checkPending){
            List<Justice> list_of_justice = justiceFacade.findAll();
            Justice[] array_of_justice = list_of_justice.toArray(new Justice[0]);
            List<CaseEntries> list_of_pending = caseEntriesFacade.findAllPending();
            CaseEntries[] array_of_pending = list_of_pending.toArray(new CaseEntries[0]);
            List<AssignedCase> list_of_assigned_case = new ArrayList<AssignedCase>();
            Random rand = new Random();
            for(int i = 0; i < array_of_pending.length; i++){
                array_of_pending[i].setCaseStatus("Assigned");
                caseEntriesFacade.edit(array_of_pending[i]);
                int j_id = rand.nextInt(array_of_justice.length);
                AssignedCase new_assigned = new AssignedCase();
                int id = 0;
                boolean checkIfLast = assignedCaseFacade.checkIfLast();
                if(checkIfLast == true){
                    id = 1;
                }
                else{
                    id = assignedCaseFacade.getLast();
                }
                new_assigned.setId(id);
                new_assigned.setJusticeId(array_of_justice[j_id]);
                new_assigned.setCaseId(array_of_pending[i]);
                new_assigned.setCaseNo(array_of_pending[i].getCaseNo());
                new_assigned.setJusticeName(array_of_justice[j_id].getName());
                list_of_assigned_case.add(new_assigned);
                assignedCaseFacade.create(new_assigned);
            }
            SessionBean1 sb1 = this.getSessionBean1();
            AssignedCase[] new_cases = list_of_assigned_case.toArray(new AssignedCase[0]);
            sb1.setAssigned_case_array(new_cases);
        }
        else{
            this.info("No pending");
        }
        return null;
    }

    public String btnBack_action() {
        return "raffle_menu";
    }
    
}

