package de.tricept.mko.codenameone;

import com.codename1.ui.Display;
import com.codename1.ui.Form;
import userclasses.StateMachine;

/**
 * Created by MKocinski on 13.12.13.
 */
public class RefreshApp {
    private Form current;

    public void init(Object context) {
    }

    public void start() {
        if(current != null){
            current.show();
            return;
        }
        new StateMachine("/theme");        
    }

    public void stop() {
        current = Display.getInstance().getCurrent();
    }

    public void destroy() {
    }
}
