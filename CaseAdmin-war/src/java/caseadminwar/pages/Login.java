/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package caseadminwar.pages;

import caseAdmin.entity.Tbluser;
import caseAdmin.session.TbluserFacadeLocal;
import caseadminwar.ApplicationBean1;
import caseadminwar.RequestBean1;
import caseadminwar.SessionBean1;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.MessageGroup;
import com.sun.webui.jsf.component.PasswordField;
import com.sun.webui.jsf.component.TextField;
import javax.ejb.EJB;
import javax.faces.FacesException;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version Login.java
 * @version Created on Sep 15, 2017, 11:59:24 PM
 * @author Andrei
 */

public class Login extends AbstractPageBean {
    @EJB
    private TbluserFacadeLocal tbluserFacade;
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private TextField txtUser = new TextField();

    public TextField getTxtUser() {
        return txtUser;
    }

    public void setTxtUser(TextField tf) {
        this.txtUser = tf;
    }
    private PasswordField txtPass = new PasswordField();

    public PasswordField getTxtPass() {
        return txtPass;
    }

    public void setTxtPass(PasswordField pf) {
        this.txtPass = pf;
    }
    private Button btnLogin = new Button();

    public Button getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(Button b) {
        this.btnLogin = b;
    }
    private Button btnRegister = new Button();

    public Button getBtnRegister() {
        return btnRegister;
    }

    public void setBtnRegister(Button b) {
        this.btnRegister = b;
    }
    private MessageGroup info = new MessageGroup();

    public MessageGroup getInfo() {
        return info;
    }

    public void setInfo(MessageGroup mg) {
        this.info = mg;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public Login() {
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
            log("Login Initialization Failure", e);
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

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    public String btnLogin_action() {
        SessionBean1 sb1 = this.getSessionBean1();
        String username = "";
        String password = "";
        try{
           username = txtUser.getText().toString();
           password = txtPass.getText().toString();
           boolean checkIfValid = tbluserFacade.checkValid(username, password);
           if(checkIfValid){
               Tbluser user = tbluserFacade.findThisUser(username, password);
               sb1.setUserForPermission(user);
               sb1.setLoggged_in_user(user);
               return "login_menu";
           }
           else{
               this.info("Invalid credentials!");
           }
        }catch(NullPointerException e){
            this.info("Error");
        }
        return null;
    }

    public String btnRegister_action() {
        return "login_register";
    }

}

