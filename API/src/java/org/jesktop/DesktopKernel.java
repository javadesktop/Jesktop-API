
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop;

import org.jesktop.launchable.LaunchableTarget;
import org.jesktop.launchable.DecoratorLaunchableTarget;
import org.jesktop.launchable.ConfigletLaunchableTarget;
import org.jesktop.mime.MimeManager;
import org.jesktop.appsupport.DraggedItem;

import javax.swing.JComponent;
import java.beans.PropertyChangeListener;
import java.net.URL;
import java.awt.Point;


/**
 * @author Paul Hammant <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a>
 * @version 1.0
 */
public interface DesktopKernel {
	
    String ROLE = "org.jesktop.DesktopKernel";

    String SHUTDOWN_SHUTDOWN = "org.jesktop.SHUTDOWN";
    String SHUTDOWN_REBOOT = "org.jesktop.REBOOT";
    String LAUNCHABLE_TARGET_CHANGE = "org.jesktop.LAUNCHABLETARGETCHANGE";

    /**
     * Method addPropertyChangeListener
     *
     *
     * @param listener
     *
     */
    void addPropertyChangeListener(PropertyChangeListener listener);
    void addPropertyChangeListener(String propertyName, PropertyChangeListener listener);

    /**
     * Method removePropertyChangeListener
     *
     *
     * @param listener
     *
     */
    void removePropertyChangeListener(PropertyChangeListener listener);
    void removePropertyChangeListener(String propertyName, PropertyChangeListener listener);

    /**
     * Method launchedTargetSelected
     *
     *
     * @param launchedTarget
     *
     */
    void launchedTargetSelected(LaunchedTarget launchedTarget);

    /**
     * Method launchedTargetCloseRequested
     *
     *
     * @param launchedTarget
     *
     */
    void launchedTargetCloseRequested(LaunchedTarget launchedTarget);

    /**
     * Method itemBeingDragged
     *
     *
     * @param draggedItem
     * @param pt
     *
     */
    void itemBeingDragged(DraggedItem draggedItem, Point pt);

    /**
     * These will use internal associations to launch an app (see above)
     * for the mime type of the document in question.  Each mime type has a queue
     * of associations for it, for both view and edit.  The queue overcomes the
     * issue in Windows where if you de-install a package, there may be no
     * association left for a mime type. It also provides an alternaive choice on
     * a context sensitive menu...
     *
     * @param docURL
     */
    void viewDocument(URL docURL) throws JesktopLaunchException;

    /**
    * Method viewDocument
    *
    *
    * @param docURL
    * @param inHere
    * @param thumbNail
    *
    */
    void viewDocument(URL docURL, JComponent inHere, boolean thumbNail)
        throws JesktopLaunchException;

    /**
    * Method editDocument
    *
    *
    * @param docURL
    *
    */
    void editDocument(URL docURL);

    /**
    * this is usable for local file system installs as well as over the web installs.
    */

    //public void installApps(String jarFileName); // used to help debugging
    void runAsychronously(Runnable runnable);

    /**
     * Method getNormalLaunchableTargets
     *
     *
     * @return
     *
     */
    LaunchableTarget[] getNormalLaunchableTargets();

    /**
     * Method getAllLaunchableTargets
     *
     *
     * @return
     *
     */
    LaunchableTarget[] getAllLaunchableTargets();

    /**
     * Method uninstall
     *
     *
     * @param launchableTarget
     *
     */
    void uninstall(LaunchableTarget launchableTarget);

    /**
     * Method notifyLaunchableTargetListeners
     *
     *
     */
    void notifyLaunchableTargetListeners();

    /**
     * Method initiateShutdown
     *
     *
     * @param shutdownType
     *
     * @throws JesktopLaunchException
     *
     */
    void initiateShutdown(String shutdownType) throws JesktopLaunchException;

    /**
     * Method getDecoratorLaunchableTargets
     *
     *
     * @return
     *
     */
    DecoratorLaunchableTarget[] getDecoratorLaunchableTargets();

    /**
     * Method getConfigletLaunchableTargets
     *
     *
     * @return
     *
     */
    ConfigletLaunchableTarget[] getConfigletLaunchableTargets();

    /**
     * Method setDecoratorLaunchableTarget
     *
     *
     * @param newDecorator
     *
     */
    void setDecoratorLaunchableTarget(DecoratorLaunchableTarget newDecorator);

    // public Collection listMimeTypes();
    // public void addAssociation(String mimeType, String launchableTarget, int queuePosition);
    // others......
    //
    // shutdown request ? vetoable?
    // shutdown incl serialization of state to "standby" file
    //
    // reboot ?
    // login ?
    // remote operation ?
    // concept of user? for jesktop only
    //
    //
    //
}
