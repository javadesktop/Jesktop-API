
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop;

import org.jesktop.JesktopLaunchException;
import org.jesktop.LaunchedTarget;


/**
 * Class AlreadyLaunchedException
 *
 *
 * @author Paul Hammant <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a>
 * @version $Revision: 1.1 $
 */
public class AlreadyLaunchedException extends JesktopLaunchException {

    private LaunchedTarget launchedTarget;

    /**
     * Constructor AlreadyLaunchedException
     *
     *
     * @param lt
     *
     */
    public AlreadyLaunchedException(LaunchedTarget lt) {

        super("Single instances can't be launched twice");

        launchedTarget = lt;
    }

    /**
     * Method getAlreadyLaunchedTarget
     *
     *
     * @return
     *
     */
    public LaunchedTarget getAlreadyLaunchedTarget() {
        return launchedTarget;
    }
}
