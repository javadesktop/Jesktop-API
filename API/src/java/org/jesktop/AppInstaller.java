
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop;



import java.net.URL;

import java.io.InputStream;


/**
 * Interface AppInstaller
 *
 *
 * @author Paul Hammant <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a>
 * @version * $Revision: 1.1 $
 */
public interface AppInstaller {

    /**
     * Method installApps
     *
     *
     * @param url
     *
     * @throws org.jesktop.JesktopPackagingException
     *
     */
    void installApps(URL url) throws JesktopPackagingException;

    /**
     * Method installApps
     *
     *
     * @param urls
     *
     * @throws JesktopPackagingException
     *
     */
    void installApps(URL[] urls) throws JesktopPackagingException;
}
