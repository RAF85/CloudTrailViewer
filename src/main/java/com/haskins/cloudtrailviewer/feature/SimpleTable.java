/*    
CloudTrail Viewer, is a Java desktop application for reading AWS CloudTrail logs
files.

Copyright (C) 2015  Mark P. Haskins

This program is free software: you can redistribute it and/or modify it under the
terms of the GNU General Public License as published by the Free Software Foundation,
either version 3 of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,but WITHOUT ANY 
WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
PARTICULAR PURPOSE.  See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.haskins.cloudtrailviewer.feature;

import com.haskins.cloudtrailviewer.components.EventTablePanel;
import com.haskins.cloudtrailviewer.core.FilteredEventDatabase;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 * Feature that provides a Table view of the loaded events
 *  
 * @author mark
 */
public class SimpleTable extends JPanel implements Feature {
    
    public static final String NAME = "Simple Table";
        
    private final EventTablePanel tablePanel;
    
    /**
     * Default constructor
     * @param eventsDatabase reference to an Event Database 
     */
    public SimpleTable(FilteredEventDatabase eventsDatabase) {
              
        tablePanel = new EventTablePanel(eventsDatabase);
        
        buildUI();
    }
    
    ////////////////////////////////////////////////////////////////////////////
    ///// Feature implementation
    ////////////////////////////////////////////////////////////////////////////
    @Override
    public void eventLoadingComplete() {
        tablePanel.eventLoadingComplete();
    }
    
    @Override
    public boolean providesSideBar() {
        return true;
    }
    
    @Override
    public boolean showOnToolBar() {
        return true;
    }
        
    @Override
    public String getIcon() {
        return "Table-48.png";
    }

    @Override
    public String getTooltip() {
        return "Select Table view";
    }
    
    @Override
    public void toggleSideBar() {
        tablePanel.toggleSideBar();
    } 
    
    @Override
    public String getName() {
        return SimpleTable.NAME;
    }
    
    @Override
    public void will_hide() { }
    
    @Override
    public void will_appear() {
        tablePanel.will_appear();
    }

    ////////////////////////////////////////////////////////////////////////////
    ///// private methods
    //////////////////////////////////////////////////////////////////////////// 
    private void buildUI() {

        this.setLayout(new BorderLayout());
        
        add(tablePanel, BorderLayout.CENTER);
    }
}
