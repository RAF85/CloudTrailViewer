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

package com.haskins.cloudtrailviewer.requestInfo;

import com.haskins.cloudtrailviewer.model.event.Event;

/**
 *
 * @author mark
 */
public class CsResource extends AbstractRequest implements Request {

    private static final String CLOUDSEARCH_DOMAIN = "CloudSearch Domain";
    
    /**
     * Return the resource for the passed Event
     * @param event Event from which the resource is require
     * @param resources 
     */
    @Override
    public void populateRequestInfo(Event event, RequestInfo resources) {
                
        if (event.getEventName().equalsIgnoreCase("DescribeIndexFields")) {
            describeIndexFields(event, resources);
        }
    }
    
    private void describeIndexFields(Event event, RequestInfo resources) {
        getTopLevelResource(CLOUDSEARCH_DOMAIN, "domainName", event, resources);
    }
}