/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("RadioButton", com.codename1.ui.RadioButton.class);
        UIBuilder.registerCustomComponent("CheckBox", com.codename1.ui.CheckBox.class);
        UIBuilder.registerCustomComponent("Dialog", com.codename1.ui.Dialog.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Main";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("RadioButton", com.codename1.ui.RadioButton.class);
        UIBuilder.registerCustomComponent("CheckBox", com.codename1.ui.CheckBox.class);
        UIBuilder.registerCustomComponent("Dialog", com.codename1.ui.Dialog.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Main");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Container findContainer3(Component root) {
        return (com.codename1.ui.Container)findByName("Container3", root);
    }

    public com.codename1.ui.Container findContainer3() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer2(Component root) {
        return (com.codename1.ui.Container)findByName("Container2", root);
    }

    public com.codename1.ui.Container findContainer2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findSkilled(Component root) {
        return (com.codename1.ui.CheckBox)findByName("skilled", root);
    }

    public com.codename1.ui.CheckBox findSkilled() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("skilled", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("skilled", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer1(Component root) {
        return (com.codename1.ui.Container)findByName("Container1", root);
    }

    public com.codename1.ui.Container findContainer1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findUsename(Component root) {
        return (com.codename1.ui.TextField)findByName("usename", root);
    }

    public com.codename1.ui.TextField findUsename() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("usename", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("usename", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton2(Component root) {
        return (com.codename1.ui.Button)findByName("Button2", root);
    }

    public com.codename1.ui.Button findButton2() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSurname(Component root) {
        return (com.codename1.ui.TextField)findByName("surname", root);
    }

    public com.codename1.ui.TextField findSurname() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("surname", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("surname", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findCancel(Component root) {
        return (com.codename1.ui.Button)findByName("cancel", root);
    }

    public com.codename1.ui.Button findCancel() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("cancel", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("cancel", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPassword(Component root) {
        return (com.codename1.ui.TextField)findByName("password", root);
    }

    public com.codename1.ui.TextField findPassword() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("password", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("password", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton(Component root) {
        return (com.codename1.ui.Button)findByName("Button", root);
    }

    public com.codename1.ui.Button findButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel1(Component root) {
        return (com.codename1.ui.Label)findByName("Label1", root);
    }

    public com.codename1.ui.Label findLabel1() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findUserInput(Component root) {
        return (com.codename1.ui.TextArea)findByName("userInput", root);
    }

    public com.codename1.ui.TextArea findUserInput() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("userInput", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("userInput", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel3(Component root) {
        return (com.codename1.ui.Label)findByName("Label3", root);
    }

    public com.codename1.ui.Label findLabel3() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel2(Component root) {
        return (com.codename1.ui.Label)findByName("Label2", root);
    }

    public com.codename1.ui.Label findLabel2() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFirstName(Component root) {
        return (com.codename1.ui.TextField)findByName("firstName", root);
    }

    public com.codename1.ui.TextField findFirstName() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("firstName", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("firstName", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findCommunicative(Component root) {
        return (com.codename1.ui.CheckBox)findByName("communicative", root);
    }

    public com.codename1.ui.CheckBox findCommunicative() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("communicative", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("communicative", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findOccupation(Component root) {
        return (com.codename1.ui.ComboBox)findByName("occupation", root);
    }

    public com.codename1.ui.ComboBox findOccupation() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("occupation", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("occupation", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findSubmit(Component root) {
        return (com.codename1.ui.Button)findByName("submit", root);
    }

    public com.codename1.ui.Button findSubmit() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("submit", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("submit", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.RadioButton findMale(Component root) {
        return (com.codename1.ui.RadioButton)findByName("male", root);
    }

    public com.codename1.ui.RadioButton findMale() {
        com.codename1.ui.RadioButton cmp = (com.codename1.ui.RadioButton)findByName("male", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.RadioButton)findByName("male", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel6(Component root) {
        return (com.codename1.ui.Label)findByName("Label6", root);
    }

    public com.codename1.ui.Label findLabel6() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label6", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label6", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnCancel(Component root) {
        return (com.codename1.ui.Button)findByName("btnCancel", root);
    }

    public com.codename1.ui.Button findBtnCancel() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btnCancel", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btnCancel", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findOrganized(Component root) {
        return (com.codename1.ui.CheckBox)findByName("organized", root);
    }

    public com.codename1.ui.CheckBox findOrganized() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("organized", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("organized", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel4(Component root) {
        return (com.codename1.ui.Label)findByName("Label4", root);
    }

    public com.codename1.ui.Label findLabel4() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel5(Component root) {
        return (com.codename1.ui.Label)findByName("Label5", root);
    }

    public com.codename1.ui.Label findLabel5() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnOK(Component root) {
        return (com.codename1.ui.Button)findByName("btnOK", root);
    }

    public com.codename1.ui.Button findBtnOK() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btnOK", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btnOK", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnTest(Component root) {
        return (com.codename1.ui.Button)findByName("btnTest", root);
    }

    public com.codename1.ui.Button findBtnTest() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btnTest", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btnTest", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnTweet(Component root) {
        return (com.codename1.ui.Button)findByName("btnTweet", root);
    }

    public com.codename1.ui.Button findBtnTweet() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btnTweet", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btnTweet", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.RadioButton findFemale(Component root) {
        return (com.codename1.ui.RadioButton)findByName("female", root);
    }

    public com.codename1.ui.RadioButton findFemale() {
        com.codename1.ui.RadioButton cmp = (com.codename1.ui.RadioButton)findByName("female", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.RadioButton)findByName("female", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton1(Component root) {
        return (com.codename1.ui.Button)findByName("Button1", root);
    }

    public com.codename1.ui.Button findButton1() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findComments(Component root) {
        return (com.codename1.ui.TextField)findByName("comments", root);
    }

    public com.codename1.ui.TextField findComments() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("comments", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("comments", aboutToShowThisContainer);
        }
        return cmp;
    }

    public static final int COMMAND_MainGo2zwo = 2;
    public static final int COMMAND_MainTini = 4;
    public static final int COMMAND_MainGo2drei = 3;

    protected boolean onMainGo2zwo() {
        return false;
    }

    protected boolean onMainTini() {
        return false;
    }

    protected boolean onMainGo2drei() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_MainGo2zwo:
                if(onMainGo2zwo()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainTini:
                if(onMainTini()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainGo2drei:
                if(onMainGo2drei()) {
                    ev.consume();
                    return;
                }
                break;

        }
        if(ev.getComponent() != null) {
            handleComponentAction(ev.getComponent(), ev);
        }
    }

    protected void exitForm(Form f) {
        if("zwo".equals(f.getName())) {
            exitZwo(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("tiniUser".equals(f.getName())) {
            exitTiniUser(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("drei".equals(f.getName())) {
            exitDrei(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitZwo(Form f) {
    }


    protected void exitMain(Form f) {
    }


    protected void exitTiniUser(Form f) {
    }


    protected void exitDrei(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("zwo".equals(f.getName())) {
            beforeZwo(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("tiniUser".equals(f.getName())) {
            beforeTiniUser(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("drei".equals(f.getName())) {
            beforeDrei(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeZwo(Form f) {
    }


    protected void beforeMain(Form f) {
    }


    protected void beforeTiniUser(Form f) {
    }


    protected void beforeDrei(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("zwo".equals(c.getName())) {
            beforeContainerZwo(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("tiniUser".equals(c.getName())) {
            beforeContainerTiniUser(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("drei".equals(c.getName())) {
            beforeContainerDrei(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerZwo(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }


    protected void beforeContainerTiniUser(Container c) {
    }


    protected void beforeContainerDrei(Container c) {
    }

    protected void postShow(Form f) {
        if("zwo".equals(f.getName())) {
            postZwo(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("tiniUser".equals(f.getName())) {
            postTiniUser(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("drei".equals(f.getName())) {
            postDrei(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postZwo(Form f) {
    }


    protected void postMain(Form f) {
    }


    protected void postTiniUser(Form f) {
    }


    protected void postDrei(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("zwo".equals(c.getName())) {
            postContainerZwo(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("tiniUser".equals(c.getName())) {
            postContainerTiniUser(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("drei".equals(c.getName())) {
            postContainerDrei(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerZwo(Container c) {
    }


    protected void postContainerMain(Container c) {
    }


    protected void postContainerTiniUser(Container c) {
    }


    protected void postContainerDrei(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("zwo".equals(rootName)) {
            onCreateZwo();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

        if("tiniUser".equals(rootName)) {
            onCreateTiniUser();
            aboutToShowThisContainer = null;
            return;
        }

        if("drei".equals(rootName)) {
            onCreateDrei();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateZwo() {
    }


    protected void onCreateMain() {
    }


    protected void onCreateTiniUser() {
    }


    protected void onCreateDrei() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("zwo".equals(f.getName())) {
            getStateZwo(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("tiniUser".equals(f.getName())) {
            getStateTiniUser(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("drei".equals(f.getName())) {
            getStateDrei(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateZwo(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }


    protected void getStateTiniUser(Form f, Hashtable h) {
    }


    protected void getStateDrei(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("zwo".equals(f.getName())) {
            setStateZwo(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("tiniUser".equals(f.getName())) {
            setStateTiniUser(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("drei".equals(f.getName())) {
            setStateDrei(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateZwo(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }


    protected void setStateTiniUser(Form f, Hashtable state) {
    }


    protected void setStateDrei(Form f, Hashtable state) {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("occupation".equals(listName)) {
            return initListModelOccupation(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelOccupation(List cmp) {
        return false;
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("zwo")) {
            if("userInput".equals(c.getName())) {
                onZwo_UserInputAction(c, event);
                return;
            }
            if("btnTweet".equals(c.getName())) {
                onZwo_BtnTweetAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("tiniUser")) {
            if("usename".equals(c.getName())) {
                onTiniUser_UsenameAction(c, event);
                return;
            }
            if("password".equals(c.getName())) {
                onTiniUser_PasswordAction(c, event);
                return;
            }
            if("btnTest".equals(c.getName())) {
                onTiniUser_BtnTestAction(c, event);
                return;
            }
            if("btnCancel".equals(c.getName())) {
                onTiniUser_BtnCancelAction(c, event);
                return;
            }
            if("btnOK".equals(c.getName())) {
                onTiniUser_BtnOKAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("drei")) {
            if("firstName".equals(c.getName())) {
                onDrei_FirstNameAction(c, event);
                return;
            }
            if("surname".equals(c.getName())) {
                onDrei_SurnameAction(c, event);
                return;
            }
            if("occupation".equals(c.getName())) {
                onDrei_OccupationAction(c, event);
                return;
            }
            if("male".equals(c.getName())) {
                onDrei_MaleAction(c, event);
                return;
            }
            if("female".equals(c.getName())) {
                onDrei_FemaleAction(c, event);
                return;
            }
            if("organized".equals(c.getName())) {
                onDrei_OrganizedAction(c, event);
                return;
            }
            if("skilled".equals(c.getName())) {
                onDrei_SkilledAction(c, event);
                return;
            }
            if("communicative".equals(c.getName())) {
                onDrei_CommunicativeAction(c, event);
                return;
            }
            if("comments".equals(c.getName())) {
                onDrei_CommentsAction(c, event);
                return;
            }
            if("submit".equals(c.getName())) {
                onDrei_SubmitAction(c, event);
                return;
            }
            if("cancel".equals(c.getName())) {
                onDrei_CancelAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onDrei_ButtonAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onDrei_Button1Action(c, event);
                return;
            }
            if("Button2".equals(c.getName())) {
                onDrei_Button2Action(c, event);
                return;
            }
        }
    }

      protected void onZwo_UserInputAction(Component c, ActionEvent event) {
      }

      protected void onZwo_BtnTweetAction(Component c, ActionEvent event) {
      }

      protected void onTiniUser_UsenameAction(Component c, ActionEvent event) {
      }

      protected void onTiniUser_PasswordAction(Component c, ActionEvent event) {
      }

      protected void onTiniUser_BtnTestAction(Component c, ActionEvent event) {
      }

      protected void onTiniUser_BtnCancelAction(Component c, ActionEvent event) {
      }

      protected void onTiniUser_BtnOKAction(Component c, ActionEvent event) {
      }

      protected void onDrei_FirstNameAction(Component c, ActionEvent event) {
      }

      protected void onDrei_SurnameAction(Component c, ActionEvent event) {
      }

      protected void onDrei_OccupationAction(Component c, ActionEvent event) {
      }

      protected void onDrei_MaleAction(Component c, ActionEvent event) {
      }

      protected void onDrei_FemaleAction(Component c, ActionEvent event) {
      }

      protected void onDrei_OrganizedAction(Component c, ActionEvent event) {
      }

      protected void onDrei_SkilledAction(Component c, ActionEvent event) {
      }

      protected void onDrei_CommunicativeAction(Component c, ActionEvent event) {
      }

      protected void onDrei_CommentsAction(Component c, ActionEvent event) {
      }

      protected void onDrei_SubmitAction(Component c, ActionEvent event) {
      }

      protected void onDrei_CancelAction(Component c, ActionEvent event) {
      }

      protected void onDrei_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onDrei_Button1Action(Component c, ActionEvent event) {
      }

      protected void onDrei_Button2Action(Component c, ActionEvent event) {
      }

}
