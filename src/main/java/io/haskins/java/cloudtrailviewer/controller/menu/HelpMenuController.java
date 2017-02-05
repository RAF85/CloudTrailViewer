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

package io.haskins.java.cloudtrailviewer.controller.menu;

import javafx.fxml.FXML;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Controller that handles the Help menu
 *
 * Created by markhaskins on 06/01/2017.
 */
@Component
public class HelpMenuController {

    @FXML
    private void showUserGuide() {

        StringBuilder result = new StringBuilder();

        ClassLoader classLoader = this.getClass().getClassLoader();
        InputStreamReader io = new InputStreamReader(classLoader.getResourceAsStream("docs/UserGuide.md"));

        try( BufferedReader br = new BufferedReader(io) ) {

            String line;
            while ((line = br.readLine()) != null) {
                result.append(line).append("\n");
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        Parser parser = Parser.builder().build();
        Node document = parser.parse(result.toString());
        HtmlRenderer renderer = HtmlRenderer.builder().build();
        String userGuide = renderer.render(document);

//        System.out.print(userGuide);

    }
}