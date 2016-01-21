/*
 * Copyright (C) 2016 Mark P. Haskins
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.haskins.cloudtrailviewer.dialog.s3filechooser;

/**
 *
 * @author markhaskins
 */
public interface S3FileListListener {
    
    /**
     * Fired when a selection is made
     * 
     * @param isValid 
     */
    public void listItemSelected(boolean isValid);
    
    /**
     * Fired when files / folder has been selected and the dialog can be closed.
     */
    public void selectionComplete();
    
    /**
     * Fired when an exception is caught
     * 
     * @param e 
     */
    public void exceptionCaught(Exception e);
}