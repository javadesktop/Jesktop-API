
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop.api;

import javax.swing.ImageIcon;


/**
 * Interface ImageRepository
 *
 *
 * @author Paul Hammant <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a>
 * @version * $Revision: 1.1 $
 */
public interface ImageRepository {

    String MIME = "MimeIcon-";
    String APP = "AppIcon-";

    // for applications by target name - Tools/Clock (etc)

    /**
     * Method getAppSmallImageIcon
     *
     *
     * @param targetName
     *
     * @return
     *
     */
    ImageIcon getAppSmallImageIcon(String targetName);

    /**
     * Method getAppBigImageIcon
     *
     *
     * @param targetName
     *
     * @return
     *
     */
    ImageIcon getAppBigImageIcon(String targetName);

    /**
     * Method getAppImageIcon
     *
     *
     * @param targetName
     * @param defaultIcon
     *
     * @return
     *
     */
    ImageIcon getAppImageIcon(String targetName, ImageIcon defaultIcon);

    // for files by mime type - text/plain (etc)

    /**
     * Method getFileSmallImageIcon
     *
     *
     * @param mimeType
     *
     * @return
     *
     */
    ImageIcon getFileSmallImageIcon(String mimeType);

    /**
     * Method getFileBigImageIcon
     *
     *
     * @param mimeType
     *
     * @return
     *
     */
    ImageIcon getFileBigImageIcon(String mimeType);

    /**
     * Method getFileImageIcon
     *
     *
     * @param mimeType
     * @param defaultIcon
     *
     * @return
     *
     */
    ImageIcon getFileImageIcon(String mimeType, ImageIcon defaultIcon);

    /**
     * Method setImageIcon
     *
     *
     * @param name
     * @param imageIcon
     *
     */
    void setImageIcon(String name, ImageIcon imageIcon);
}
