/**
 * Your application code goes here
 */
package userclasses;

import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkManager;
import de.tricept.mko.codenameone.NetManager;
import de.tricept.mko.codenameone.handler.JsonTestHandler;
import de.tricept.mko.codenameone.handler.SomeWsHandler;
import de.tricept.mko.codenameone.handler.Tini3000Handler;
import de.tricept.mko.codenameone.handler.TweetHandler;
import generated.StateMachineBase;
import com.codename1.ui.*; 
import com.codename1.ui.events.*;
import com.codename1.ui.util.Resources;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Hashtable;

/**
 * Created by MKocinski on 13.12.13.
 */
public class StateMachine extends StateMachineBase {
    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }
    
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars(Resources res) {
    }

    @Override
    protected void beforeMain(final Form f) {
      f.getContentPane().addPullToRefresh(new Runnable() {
          @Override
          public void run() {
              f.addComponent(0, new Label(new Date().toString()));
              f.revalidate();
          }
      });
    
    }

    @Override
    protected void onZwo_BtnTweetAction(final Component c, ActionEvent event) {
     String input = findUserInput().getText();
     if(null != input && !"".equals(input.trim()))
     {
         TweetHandler th = new TweetHandler(c, findUserInput().getText());
         try {
             th.retrieveTweet();
         }
         catch (Exception ex)
         {Dialog.show("ZOOONK!",ex.toString()+": -->"+ ex.getMessage(), "ja ich weiß","Pappel?");}

     }
        else
     {   //no input done
        Dialog.show("ZOOONK!","Du nix Text eingegeben", "ja ich weiß","Pappel?");
     }
    }

    @Override
    protected void onDrei_SubmitAction(Component c, ActionEvent event) {
        String fName = findFirstName().getText();
        String lName = findSurname().getText();
        String occ = findOccupation().getSelectedItem().toString();
        String comm = findComments().getText();

        SomeWsHandler someHandler = new SomeWsHandler(fName,lName,occ,comm);
        someHandler.handle();
    }

    @Override
    protected void onDrei_ButtonAction(Component c, ActionEvent event) {


            ConnectionRequest req = new ConnectionRequest(){

                @Override
                protected void readResponse(InputStream input) throws IOException {
                    //super.readResponse(input);

                    InputStreamReader reader = new InputStreamReader(input);
                    JSONParser parser = new JSONParser();
                    Hashtable response = parser.parse(reader);
                    String version = (String)response.get("version");
                    Hashtable feed = (Hashtable)response.get("feed");
                    Hashtable title = (Hashtable)feed.get("title");
                    String titleStr = (String)title.get("$t");

                    // .. Work with content some more

                }

            };

            req.setPost(false);
            req.setHttpMethod("GET");
            req.setUrl("http://gdata.youtube.com/feeds/api/standardfeeds/most_popular?v=2&alt=json");

            NetworkManager.getInstance().addToQueue(req);

    
    }

    @Override
    protected void onDrei_Button2Action(Component c, ActionEvent event) {
        JsonTestHandler test = new JsonTestHandler(findFirstName().getText());


    
    }

    @Override
    protected void onTiniUser_BtnTestAction(Component c, ActionEvent event) {
        Tini3000Handler tini = new Tini3000Handler(findUsename().getText(),findPassword().getText());

        boolean ok = tini.testTini(true);

        if(ok)
          Dialog.show("Test erfolgreich!",null,"OK",null);
        else
            Dialog.show("Test NICHT erfolgreich!",null,"OK",null);
    }


    private boolean hasValidInput (Component c)
    { //let's pretend it's ok to have at least 1 symbol...
      return (findUsename(c).getText().trim().length() > 0 && findPassword(c).getText().trim().length() > 0);
    }

    @Override
    protected void onTiniUser_BtnOKAction(Component c, ActionEvent event) {
      if(hasValidInput(c))
      {
        if(Dialog.show("Einstellungen Testen?","Daten Testen?", "Ja", "Nein"))
        {
            Tini3000Handler tini = new Tini3000Handler(findUsename().getText(),findPassword().getText());

            boolean ok = tini.testTini(false);
            if(ok)
                Dialog.show("Test erfolgreich!",null,"SAVE","Nope");
            else
                Dialog.show("Test NICHT erfolgreich!",null,"OK",null);
        }
      }
        else
      {
          Dialog.show("Schade","Username und/oder PW sind leer","Naja, einen Versuch war es Wert...",null);
      }
    
    }

    @Override
    protected void beforeTiniUser(Form f) {
        NetManager nm = new NetManager();

    }
}
