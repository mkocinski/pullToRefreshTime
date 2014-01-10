package de.tricept.mko.codenameone;

import com.codename1.io.NetworkEvent;
import com.codename1.io.NetworkManager;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;

/**
 * Created by MKocinski on 07.01.14.
 */
public  class NetManager {

    public NetworkManager manager = NetworkManager.getInstance();

    public void manage ()
    {
        manager.start();
        manager.addErrorListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                NetworkEvent ne = (NetworkEvent) evt;
                ne.getError().printStackTrace();
            }
        });
    }
}
