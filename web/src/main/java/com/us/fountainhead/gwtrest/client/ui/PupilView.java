package com.us.fountainhead.gwtrest.client.ui;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.us.fountainhead.gwtrest.client.entity.Pupil;
import com.us.fountainhead.gwtrest.client.entity.User;
import com.us.fountainhead.gwtrest.client.service.PupilEntityServiceClient;
import com.us.fountainhead.gwtrest.client.service.SecurityServiceClient;
import com.us.fountainhead.gwtrest.client.service.SecurityServiceClient.FindUserByUsernameResponse;

/**
 *
 * @author Andrews
 */
public class PupilView extends VerticalPanel implements PupilEntityServiceClient.FindAll {

    private FlexTable table;

    public PupilView() {
        layout();
        findAllPupil();
    }

    private void layout() {
        add(new Label("Pupils"));

        table = new FlexTable();
        add(table);

        RootPanel.get("layout").add(this);
    }

    @Override
    public void onFindAllPupilResponse(PupilEntityServiceClient.FindAllResponse response) {
        JsArray<Pupil> pupilList = response.getPupilList();
        
        for (int i = 0; i < pupilList.length(); i++) {
            Pupil pupil = pupilList.get(i);
            table.setWidget(i, 1, new Label(pupil.getName()));
            table.setWidget(i, 2, new Label(pupil.getUsername()));
        }
    }

    private void findAllPupil() {
        new PupilEntityServiceClient().findAll(this);
    }

    @Override
    public void onFindAllPupilError(Throwable exception) {
    }
}
