
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop.frimble;



/**
 * Class FrimbleAdapter
 *
 *
 * @author <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a> Dec 2000.
 * @version $Revision: 1.1 $
 */
public abstract class FrimbleAdapter implements FrimbleListener {

    /**
     * Method frimbleOpened
     *
     *
     * @param e
     *
     */
    public void frimbleOpened(FrimbleEvent e) {}

    /**
     * Method frimbleClosing
     *
     *
     * @param e
     *
     */
    public void frimbleClosing(FrimbleEvent e) {}

    /**
     * Method frimbleClosed
     *
     *
     * @param e
     *
     */
    public void frimbleClosed(FrimbleEvent e) {}

    /**
     * Method frimbleIconified
     *
     *
     * @param e
     *
     */
    public void frimbleIconified(FrimbleEvent e) {}

    /**
     * Method frimbleDeiconified
     *
     *
     * @param e
     *
     */
    public void frimbleDeiconified(FrimbleEvent e) {}

    /**
     * Method frimbleActivated
     *
     *
     * @param e
     *
     */
    public void frimbleActivated(FrimbleEvent e) {}

    /**
     * Method frimbleDeactivated
     *
     *
     * @param e
     *
     */
    public void frimbleDeactivated(FrimbleEvent e) {}
}
