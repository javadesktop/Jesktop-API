
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop.mime;



import org.jesktop.launchable.LaunchableTarget;

import javax.swing.ImageIcon;


/**
 *
 * Interface that represents all informations about a Mime type
 *
 * @author  Laurent Cornelis <nelis2@yahoo.com>
 * @version 1.0
 */
public interface MimeInfo {

    /**
     * Get mime string (p.e. image/gif)
     */
    String getMime();

    /**
     * Get all registered extensions for this Mime
     */
    String[] getExtensions();

    /**
     * Get all registered extensions for this Mime as a coma-separated String
     */
    String getExtensionsAsString();

    /**
     * Get the description of this Mime (p.e. Image GIF)
     */
    String getDescription();

    /**
     * Get the image icon associated with this Mime
     */
    ImageIcon getIcon();

    /**
     * Get all actions associated with this Mime (View, Edit, Print, ...)
     */
    LaunchableTarget[] getActions();
}
