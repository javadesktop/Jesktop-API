
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop;



import org.jesktop.frimble.Frimble;
import org.jesktop.launchable.LaunchableTarget;


/**
 * Class Decorator is used to decorate frimbles as they are oepned on the desktop.
 *
 *
 * @author <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a> Dec 2000.
 * @version $Revision: 1.1 $
 */
public interface Decorator {

    /**
     * Method end finishes the the decoration in this style.  Some decoration concepts
* may insert hooks that need to be specifically undone.
     *
     */
    void end();

    /**
     * Method decorate is called when a new frimble has been openon of the desktop.
     *
     *
     * @param frimble the frimble to decorate.
     * @param launchableTarget the launchable tartget that it is from.
     *
     */
    void decorate(Frimble frimble, LaunchableTarget launchableTarget);
}
