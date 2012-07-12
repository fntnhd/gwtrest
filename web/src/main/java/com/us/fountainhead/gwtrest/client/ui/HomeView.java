package com.us.fountainhead.gwtrest.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.us.fountainhead.gwtrest.client.entity.User;
import com.us.fountainhead.gwtrest.client.service.SessionService;
import com.us.fountainhead.gwtrest.client.service.SessionServiceAsync;

/**
 *
 */
public class HomeView extends VerticalPanel {

    public HomeView() {
        init();
    }

    private void init() {
        SessionServiceAsync async = GWT.create(SessionService.class);
        AsyncCallback<String> callback = new AsyncCallback<String>() {

            @Override
            public void onFailure(Throwable throwable) {
                Window.alert(throwable.getMessage());
            }

            @Override
            public void onSuccess(String json) {
                User user = JsonUtils.safeEval(json);
                RootPanel.get("current-user").add(new Label(user.getName()));
            }
        };

        async.getCurrentUser(callback);
    }

}
