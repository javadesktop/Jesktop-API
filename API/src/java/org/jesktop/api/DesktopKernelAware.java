
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop.api;




/**
 * @author Paul Hammant <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a>
 * @version 1.0
 */
public interface DesktopKernelAware {

    /**
     * Method setDesktopKernel provides a callback for the app to the Kernel
     *
     *
     * @param desktopKernel the DesktopKernel instance.
     *
     */
    void setDesktopKernel(DesktopKernel desktopKernel);
}
