
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop.frimble;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import java.awt.BorderLayout;


/**
 * Class JInternalFrameFrimbleFactory
 *
 *
 * @author Paul Hammant <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a>
 * @version $Revision: 1.1 $
 */
public class JInternalFrameFrimbleFactory implements FrimbleFactory {

    private JDesktopPane jdp;

    /**
     * Constructor JInternalFrameFrimbleFactory
     *
     *
     * @param jdp
     *
     */
    public JInternalFrameFrimbleFactory(JDesktopPane jdp) {
        this.jdp = jdp;
    }

    /**
     * Method getFrimble
     *
     *
     * @return
     *
     */
    public Frimble getFrimble() {
        return this.getFrimble(null);
    }

    /**
     * Method getFrimble
     *
     *
     * @param title
     *
     * @return
     *
     */
    public Frimble getFrimble(String title) {

        JInternalFrame jif = new JInternalFrame(title, true, true, true, false);

        jif.getContentPane().setLayout(new BorderLayout());
        jdp.add(jif, JDesktopPane.DEFAULT_LAYER);

        Frimble frimble = JInternalFrameFrimble.createJInternalFrameFrimble(jif);

        return frimble;
    }
}
