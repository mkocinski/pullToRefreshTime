package de.tricept.mko.codenameone.requests;

import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.processing.Result;
import com.codename1.ui.Dialog;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Hashtable;

/**
 * Created by MKocinski on 07.01.14.
 */
public class SpecificConnectionRequest extends ConnectionRequest {

    Hashtable ht;
    StringBuffer buffer;

    public String getResponse() {
        return response;
    }

    String response;
    boolean isJson = true;
    boolean isTestConnection = false;
    private boolean isXML = false;

    public static String ERROR_PREFIX = "ERROR:";

    public void setIsTestConnection (boolean pIsTestCon) {isTestConnection = pIsTestCon;}

    public void setIsJsonResponse (boolean pIsJsonResp)
    {
        isJson = pIsJsonResp;
    }

    public SpecificConnectionRequest (String url, Boolean doPost)
    {
        super();

        setUrl(url);
        setPost(doPost.booleanValue());
        buffer = new StringBuffer();
        setContentType("application/json");
    }


    @Override
    protected void readResponse(InputStream input) throws IOException {        
       // if(isJson)
       //     readJsonResponse(input);
       // else if(isXML)
       //     readXmlResponse(input);
       // else
          readStringResponse(input);

    }

    private void readXmlResponse(InputStream input) {
    }

    private void readJsonResponse(InputStream input) throws IOException {
        JSONParser parser = new JSONParser();
        ht = parser.parse(new InputStreamReader(input));
        input.close();
        //Result res = Result.fromContent(new InputStreamReader(input), Result.JSON);
    }

    private void readStringResponse(InputStream input) throws IOException {
        int ch;
        while ((ch = input.read()) != -1)
        {
            buffer.append((char)ch);
        }
        response = buffer.toString().trim();

        //Dialog.show("Response", response ,"OK" ,null);
    }

    @Override
    protected void handleException(Exception err) {
        //super.handleException(err);
        Dialog.show("No Exception","nononononono", "noo", null);

    }

    @Override
    protected void handleIOException(IOException err) {
        //'strange' handling for no connection...
        if("Unreachable".equals(err.getMessage()))
            Dialog.show("Online?","Bitte gehen Sie online!", "OK",null);
        else
            super.handleIOException(err);
    }


}
