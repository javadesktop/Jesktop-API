/*
 * Copyright (C) The Apache Software Foundation. All rights reserved.
 *
 * This software is published under the terms of the Apache Software License
 * version 1.1, a copy of which has been included with this distribution in
 * the LICENSE file.
 */
package org.jesktop.frimble.demo;

import org.jesktop.frimble.FrimbleAware;
import org.jesktop.frimble.Frimble;
import org.jesktop.frimble.JFrameFrimble;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.BorderLayout;


/**
 * This class shows how to use Frimble in a gui app where it is intended
 * that the app will fun in standalone mode and run inside jesktop.
 * There are important differences between JFrame and JInternalFrame
 * to make and either/or solution possible.
 *
 * The Frimble adapter concept hides the parent.
 *
 * See bug 4195715 on the BugParade:
 * http://developer.java.sun.com/developer/bugParade/bugs/4195715.html
 * *
 * @author Paul Hammant <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a>
 * @version 1.0
 */
public class FrimbleDemo extends JPanel implements FrimbleAware {

    /**
     * Constructor FrimbleDemo
     *
     *
     */
    public FrimbleDemo() {
        this.add(new JLabel("Hello World"), BorderLayout.CENTER);
    }

    // Javadocs will automatically import from interface.

    /**
     * Method setFrimble
     *
     *
     * @param f
     *
     */
    public void setFrimble(Frimble f) {

        f.setTitle("Hey this really works");

        // you can now setTitle, setJMenuBar agaist this
        // and do not need to worry whether you are contained
        // within a JFrame from your main method below or
        // some gui-container from <i>jesktop</>
    }

    /**
     * Method main
     *
     *
     * @param args
     *
     */
    public static void main(String[] args) {

        Frimble frimble = JFrameFrimble.createJFrameFrimble(new JFrame("FrimbleDemo"));

        frimble.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frimble.getContentPane().setLayout(new BorderLayout());

        FrimbleDemo fd = new FrimbleDemo();

        frimble.getContentPane().add(fd, BorderLayout.CENTER);
        fd.setFrimble(frimble);
        frimble.pack();
        frimble.setVisible(true);
    }
}
