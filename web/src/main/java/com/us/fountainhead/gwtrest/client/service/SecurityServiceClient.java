package com.us.fountainhead.gwtrest.client.service;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.http.client.*;
import com.google.gwt.user.client.Window;
import com.us.fountainhead.gwtrest.client.entity.User;

/**
 *
 * @author Andrews
 */
public class SecurityServiceClient extends ServiceClient {
    

    public void findUserByUsername(String username, final FindUserByUsername caller) {
        RequestBuilder request = post("securityService/findUserByUsername");

        try {
            FindUserByUsernameRequest findUserByUsernameRequest = (FindUserByUsernameRequest) JavaScriptObject.createObject();
            findUserByUsernameRequest.setUsername(username);
            
            request.sendRequest(findUserByUsernameRequest.json(), new RequestCallback() {

                @Override
                public void onResponseReceived(Request request, Response response) {
                    int statusCode = response.getStatusCode();

                    if (statusCode == Response.SC_OK) {
                        try {
                            String responseBody = response.getText();
                            FindUserByUsernameResponse findUserByUsernameResponse = JsonUtils.safeEval(responseBody);
                            caller.onFindUserByUsername(findUserByUsernameResponse);
                        } catch (Throwable exception) {
                            caller.onFindUserByUsernameError(exception);
                        }
                    } else {
                        //TO-DO Add response error handling code.
                    }
                }

                @Override
                public void onError(Request request, Throwable exception) {
                    caller.onFindUserByUsernameError(exception);
                }
            });
        } catch (RequestException ex) {
            caller.onFindUserByUsernameError(ex);
        }
    }
    
    public class FindUserByUsernameResponse extends ServiceResponse {
        
        protected FindUserByUsernameResponse() {}
        
        public final native User getValue() /*-{
        return this.value;
        }-*/;
        
    }
    
    public class FindUserByUsernameRequest extends JavaScriptObject {
        
        protected FindUserByUsernameRequest() {}
        
        public final native String getUsername() /*-{
        return this.username; 
        }-*/;
        
        public final native void setUsername(String username) /*-{
        this.username = username;
        }-*/;
        
        public final native String json() /*-{
        return JSON.stringify(this);
        }-*/;
        
    }

    /**
     * Callers must implement this interface to handle the callback
     */
    public interface FindUserByUsername {

        public void onFindUserByUsername(FindUserByUsernameResponse response);

        public void onFindUserByUsernameError(Throwable exception);
    }
    
}
