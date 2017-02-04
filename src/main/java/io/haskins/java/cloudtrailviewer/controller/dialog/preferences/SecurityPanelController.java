/*
CloudTrail Viewer, is a Java desktop application for reading AWS CloudTrail logs
files.

Copyright (C) 2017  Mark P. Haskins

This program is free software: you can redistribute it and/or modify it under the
terms of the GNU General Public License as published by the Free Software Foundation,
either version 3 of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,but WITHOUT ANY
WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
PARTICULAR PURPOSE.  See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package io.haskins.java.cloudtrailviewer.controller.dialog.preferences;

import io.haskins.java.cloudtrailviewer.model.observable.StringObservable;
import io.haskins.java.cloudtrailviewer.service.DatabaseService;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

/**
 * Created by markhaskins on 26/01/2017.
 */
public class SecurityPanelController extends PreferencesPanel {

    @FXML private ListView<StringObservable> listView;

    public void init(DatabaseService databaseService) {

        this.databaseService = databaseService;

        configureListView(listView);

        String query = "SELECT api_call FROM aws_security";
        populateListBySQL(listView, query);
    }

}
