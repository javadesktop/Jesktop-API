
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop.frimble;



import java.util.EventListener;


/**
 * Interface FrimbleListener
 *
 *
 * @author <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a> Dec 2000.
 * @version $Revision: 1.1 $
 */
public interface FrimbleListener extends EventListener {

    /**
     * Method frimbleOpened
     *
     *
     * @param e
     *
     */
    void frimbleOpened(FrimbleEvent e);

    /**
     * Method frimbleClosing
     *
     *
     * @param e
     *
     */
    void frimbleClosing(FrimbleEvent e);

    /**
     * Method frimbleClosed
     *
     *
     * @param e
     *
     */
    void frimbleClosed(FrimbleEvent e);

    /**
     * Method frimbleIconified
     *
     *
     * @param e
     *
     */
    void frimbleIconified(FrimbleEvent e);

    /**
     * Method frimbleDeiconified
     *
     *
     * @param e
     *
     */
    void frimbleDeiconified(FrimbleEvent e);

    /**
     * Method frimbleActivated
     *
     *
     * @param e
     *
     */
    void frimbleActivated(FrimbleEvent e);

    /**
     * Method frimbleDeactivated
     *
     *
     * @param e
     *
     */
    void frimbleDeactivated(FrimbleEvent e);
}
