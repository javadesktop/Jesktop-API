
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop.appsupport;



import java.net.URL;


/**
 * Apps that implement this can edit certain types of content.  When the mime
 * registry is finished the manifest will register the app for a particulr mime
 * type at installation time.
 *
 * @author  <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a>
 * @version 1.0
 */
interface ContentEditor extends ContentAction {

    /**
     * Method editCon is used for editing content specified by the URL.
     *
     * @param url the content to be edit
     *
     */
    void editContent(URL url);
}
