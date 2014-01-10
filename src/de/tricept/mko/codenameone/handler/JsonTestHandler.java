package de.tricept.mko.codenameone.handler;

import de.tricept.mko.codenameone.NetManager;
import de.tricept.mko.codenameone.requests.SpecificConnectionRequest;

/**
 * Created by MKocinski on 07.01.14.
 */
public class JsonTestHandler {
    private JsonTestHandler()
    { //naaah
    }
    SpecificConnectionRequest conReq;
    public JsonTestHandler(String input)
    {
        //http://md5.jsontest.com/?text=example_text

        NetManager nManager = new NetManager();
        nManager.manage();

        conReq = new SpecificConnectionRequest("http://md5.jsontest.com/?text="+input, false);

        nManager.manager.addToQueue(conReq);
    }
}
