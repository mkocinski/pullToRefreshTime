package de.tricept.mko.codenameone.handler;

import de.tricept.mko.codenameone.NetManager;
import de.tricept.mko.codenameone.requests.SpecificConnectionRequest;

/**
 * Created by MKocinski on 07.01.14.
 */
public class SomeWsHandler {
    static final String thisUrl = "http://some.webservice.com/newuser.jsp?";
    String fName;
    String lName;
    String occ;
    String comment;

    SpecificConnectionRequest conReq;

    private SomeWsHandler()
    {
        //i think we do not need this
    }

    public SomeWsHandler(String pFName, String pLName, String pOcc, String pComm)
    {
        fName = pFName;
        lName = pLName;
        occ = pOcc;
        comment = pComm;
    }

    public void handle()
    {
      NetManager nManager = new NetManager();
      nManager.manage();

      String url = thisUrl +"fname=" + fName + "&sname=" + lName + "&occ=" + occ + "&comm=" + comment;
      conReq = new SpecificConnectionRequest(url,false);

      nManager.manager.addToQueue(conReq);

    }



}
