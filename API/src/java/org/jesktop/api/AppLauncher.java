
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop.api;



import org.jesktop.launchable.LaunchableTarget;

import javax.swing.JComponent;

import java.net.URL;


/**
 * Interface AppLauncher
 *
 *
 * @author Paul Hammant <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a>
 * @version * $Revision: 1.1 $
 */
public interface AppLauncher {

    /**
     * Ask the desktop to launch an application by it's name.
     * it may be that a separate instance of the app is launched, or
     * the app opens another window, if it is MDI.
     *
     *
     * @param launchableTarget
     *
     * @return
     */
    Object launchApp(LaunchableTarget launchableTarget) throws JesktopLaunchException;

    /**
     * Method launchApp
     *
     *
     * @param launchableTarget
     * @param inHere
     *
     * @return
     *
     * @throws JesktopLaunchException
     *
     */
    Object launchApp(LaunchableTarget launchableTarget, JComponent inHere)
        throws JesktopLaunchException;

    /**
     * Method launchAppWithoutInstallation
     *
     *
     * @param jarURL
     *
     * @return
     *
     * @throws JesktopLaunchException
     * @throws JesktopPackagingException
     *
     */
    Object launchAppWithoutInstallation(URL jarURL)
        throws JesktopPackagingException, JesktopLaunchException;

    /**
     * Method launchAppByName
     *
     *
     * @param appTargetName
     *
     * @return
     *
     * @throws JesktopLaunchException
     *
     */
    Object launchAppByName(String appTargetName) throws JesktopLaunchException;

    /**
     * Method getAllAppList
     *
     *
     * @return
     *
     */
    String[] getAllAppList();
}
