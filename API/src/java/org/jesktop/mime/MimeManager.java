
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop.mime;

import org.jesktop.mime.MimeInfo;
import org.jesktop.mime.MimeAlreadyRegisteredException;
import org.jesktop.mime.MimeNotRegisteredException;


/**
 * Interface MimeManager
 *
 *
 * @author Paul Hammant <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a>
 * @version * $Revision: 1.1 $
 */
public interface MimeManager {

    /**
     * Method getMimeInfo
     *
     *
     * @param index
     *
     * @return
     *
     */
    MimeInfo getMimeInfo(int index);

    /**
     * Method unregisterMime
     *
     *
     * @param mime
     *
     * @throws MimeNotRegisteredException
     *
     */
    void unregisterMime(String mime) throws MimeNotRegisteredException;

    /**
     * Method registerExtensionsForMime
     *
     *
     * @param extensions
     * @param minfo
     *
     * @throws MimeAlreadyRegisteredException
     *
     */
    void registerExtensionsForMime(String extensions, MimeInfo minfo)
        throws MimeAlreadyRegisteredException;

    /**
     * Method unregisterExtensionsForMime
     *
     *
     * @param minfo
     *
     */
    void unregisterExtensionsForMime(MimeInfo minfo);

    /**
     * Method createMimeInfo
     *
     *
     * @param mime
     * @param description
     *
     * @return
     *
     * @throws MimeAlreadyRegisteredException
     *
     */
    MimeInfo createMimeInfo(String mime, String description)
        throws MimeAlreadyRegisteredException;

    /**
     * Method registerMime
     *
     *
     * @param minfo
     *
     * @throws MimeAlreadyRegisteredException
     *
     */
    void registerMime(MimeInfo minfo) throws MimeAlreadyRegisteredException;

    /**
     * Method updateMimeInfo
     *
     *
     * @param minfo
     * @param mime
     * @param description
     *
     * @return
     *
     * @throws MimeAlreadyRegisteredException
     * @throws MimeNotRegisteredException
     *
     */
    MimeInfo updateMimeInfo(MimeInfo minfo, String mime, String description)
        throws MimeAlreadyRegisteredException, MimeNotRegisteredException;

    /**
     * Method countRegisteredMimes
     *
     *
     * @return
     *
     */
    int countRegisteredMimes();
}
