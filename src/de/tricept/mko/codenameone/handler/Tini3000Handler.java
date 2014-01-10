package de.tricept.mko.codenameone.handler;

import com.codename1.components.InfiniteProgress;
import com.codename1.io.JSONParser;
import com.codename1.processing.Result;
import com.codename1.ui.Dialog;
import de.tricept.mko.codenameone.NetManager;
import de.tricept.mko.codenameone.requests.SpecificConnectionRequest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by MKocinski on 08.01.14.
 */
public class Tini3000Handler {

    String user;
    String pw;

    static final String NELSON_URL = "http://nelson:9083/TINI_GATEWAY_HTTPRouter/ProxyServlet?REQUEST_NAME=";
    static final String REQ_ORIGIN= "REQUEST_ORIGIN=Client";

    static final String PREFIX_SERVER_ERROR = "Error:";

    //Exceptions
    static final String SERVER_EXCEPTION_FRONTEND = "FRONTEND_EXCEPTIONS";
    static final String SERVER_EXCEPTION_BUSINESS_FUNCTION = "BUSINESS_FUNCTION_EXCEPTIONS";
    static final String SERVER_EXCEPTION_BUSINESS_LAYER = "BUSINESS_LAYER_EXCEPTIONS";
    static final String SERVER_EXCEPTION_SERVER = "SERVER_EXCEPTIONS";

    //parameters
    int year; //jahr
    int month;  //monat
    int kw;    //kw

    Date from;  //von
    Date until; //bis

    String pId; //projektId




   //http://nelson:9083/TINI_GATEWAY_HTTPRouter/ProxyServlet?REQUEST_NAME=processBuchungssaetzeFuerJahrUndMonatErmittelnREST
    // &REQUEST_USER=_USER_
    // &REQUEST_PASSWORT=_PWD_&REQUEST_ORIGIN=Client&JAHR=2013&MONAT=10&KW=

    private Tini3000Handler()
    {
    //yeah...
    }

    public Tini3000Handler(String pUser, String pPw)
    {
        user = pUser;
        pw = pPw;
    }

    public boolean testTini(boolean testConnection)
    {
        NetManager nManager = new NetManager();
        nManager.manage();
        SpecificConnectionRequest testReq;
        if(testConnection)
          testReq = new SpecificConnectionRequest(NELSON_URL+"processProjekteFuerPersonErmittelnREST&REQUEST_USER=_USER_&REQUEST_PASSWORT=_PWD_&"+REQ_ORIGIN,false);
        else
          testReq = new SpecificConnectionRequest(NELSON_URL+"processProjekteFuerPersonErmittelnREST&REQUEST_USER=" + user + "&REQUEST_PASSWORT=" + pw + "&"+REQ_ORIGIN,false);

        testReq.setIsTestConnection(true);
        InfiniteProgress infinity = new InfiniteProgress();
        Dialog d = infinity.showInifiniteBlocking();

        testReq.setDisposeOnCompletion(d);

        nManager.manager.addToQueueAndWait(testReq);

        String testResult = testReq.getResponse();

        return isValidTestResult(testResult);
    }



    private boolean isValidTestResult(String testResult) {
        if(null == testResult || testResult.length() <= 0)
            return false;

        if(testResult.startsWith(PREFIX_SERVER_ERROR))
        {
            Dialog.show("ServerError",testResult,"ok",null);
            return false;
        }


        try {
            //SERVER_EXCEPTION_SERVER,SERVER_EXCEPTION_BUSINESS_FUNCTION,SERVER_EXCEPTION_BUSINESS_LAYER,SERVER_EXCEPTION_FRONTEND
            Result res = Result.fromContent(testResult, Result.JSON);
            if(res.get("SERVER_EXCEPTION_SERVER") != null)
                return false;
            if(res.get("SERVER_EXCEPTION_BUSINESS_FUNCTION") != null)
                return false;
            if(res.get("SERVER_EXCEPTION_BUSINESS_LAYER") != null)
                return false;
            if(res.get("SERVER_EXCEPTION_FRONTEND") != null)
                return false;
        }   catch (IllegalArgumentException illegalArgEx)
        {
            return false;
        }

        return true;
    }



}
