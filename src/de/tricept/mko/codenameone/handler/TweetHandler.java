package de.tricept.mko.codenameone.handler;

import com.codename1.components.InfiniteProgress;
import com.codename1.ui.Component;
import com.codename1.ui.Dialog;
import de.tricept.mko.codenameone.NetManager;
import de.tricept.mko.codenameone.requests.SpecificConnectionRequest;

/**
 * Created by MKocinski on 13.12.13.
 */
public class TweetHandler {

    String inputString;
    Component comp;

    private TweetHandler()
    {
       //not to use right now
    }

    public TweetHandler (final Component c,String input)
    {
        inputString = input;
        comp = c;
    }

    public void retrieveTweet() {
        NetManager manager = new NetManager();
        manager.manage();
        SpecificConnectionRequest conReq = new SpecificConnectionRequest("http://search.twitter.com/search.json", Boolean.FALSE);
        conReq.addArgument("q",inputString);

        InfiniteProgress infProg = new InfiniteProgress();
        Dialog dial = infProg.showInifiniteBlocking();
        conReq.setDisposeOnCompletion(dial);
        manager.manager.addToQueue(conReq);
        conReq.getResponseData();

    }
}
