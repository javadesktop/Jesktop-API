
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop.frimble;

import javax.swing.event.EventListenerList;
import java.awt.Frame;
import java.awt.Component;


/**
 * AbstractFrimble is just a helper class.  It provides a common
 * access to JFrame and JInternalFrame
 *
 * Actually if someone want to write a container that has a least
 *   a) visible title
 *   b) menu bar
 *   c) multi panes/layers
 *   d) can be in front or behind others
 *
 * @author Paul Hammant <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a>
 * @version 1.0
 */
public abstract class AbstractFrimble implements Frimble {

    protected EventListenerList listenerList = new EventListenerList();
    private FrimbleCallback frimbleCallback;

    /**
     * Method addFrimbleListener
     *
     *
     * @param fl
     *
     */
    public final void addFrimbleListener(FrimbleListener fl) {
        listenerList.add(FrimbleListener.class, fl);
    }

    /**
     * Method removeFrimbleListener
     *
     *
     * @param fl
     *
     */
    public final void removeFrimbleListener(FrimbleListener fl) {
        listenerList.remove(FrimbleListener.class, fl);
    }

    /**
     * Method getOwnerFrame
     *
     *
     * @return
     *
     */
    public final Frame getOwnerFrame() {

        Component comp = getFrimbleContained();

        while ((comp != null) &&!(comp instanceof Frame)) {
            comp = comp.getParent();
        }

        if (comp == null) {
            return null;
        } else {
            return (Frame) comp;
        }
    }

    /**
     * Method makeFrimble
     *
     *
     *
     */
    public final Frimble makeFrimble(FrimbleAware frimbleAwareComponent) {

        if (frimbleCallback != null) {
            return frimbleCallback.makeFrimble(frimbleAwareComponent);
        } else {
            Frimble fr = this.makeFrimble2(frimbleAwareComponent);

            fr.setVisible(true);

            return fr;
        }
    }

    protected abstract Frimble makeFrimble2(FrimbleAware frimbleAwareComponent);

    /**
     * Method registerFrimbleCallback
     *
     *
     * @param fcb
     *
     */
    public final void registerFrimbleCallback(FrimbleCallback fcb) {
        frimbleCallback = fcb;
    }
}
