
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop.frimble;


/**
 * Interface FrimbleAware allows apps to have menus and titles (plus more)
 * without being tied to JFrame etc.
 *
 *
 * @author <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a> Dec 2000.
 * @version $Revision: 1.1 $
 */
public interface FrimbleAware {

    /**
     * Method setFrimble allows the JComponent based app to be given a way of
* interacting with it's menu and title (and others) without knowing the
* implementation of that container.
*
* This is the point at which the app may choose to instantiate and place it
* view.
     *
     * @param frimble the frimble that has the methods needed for container
* interaction.
     *
     */
    void setFrimble(Frimble frimble);
}
