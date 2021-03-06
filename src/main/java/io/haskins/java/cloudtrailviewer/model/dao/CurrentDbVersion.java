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

package io.haskins.java.cloudtrailviewer.model.dao;

/**
 * Model that holds the latest version of the database configuration
 *
 * Created by markhaskins on 05/01/2017.
 */
public class CurrentDbVersion {

    private int dbVersion = 0;

    private  void setDbVersionInteger(Integer newVersion) {
        this.dbVersion = newVersion;
    }

    public void setDbVersion(int newVersion) {
        this.dbVersion = newVersion;
    }
    public int getDbVersion() {
        return this.dbVersion;
    }
}
