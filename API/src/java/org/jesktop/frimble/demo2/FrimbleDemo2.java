/*
 * Copyright (C) The Apache Software Foundation. All rights reserved.
 *
 * This software is published under the terms of the Apache Software License
 * version 1.1, a copy of which has been included with this distribution in
 * the LICENSE file.
 */
package org.jesktop.frimble.demo2;

import org.jesktop.frimble.JFrimble;

import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.BorderLayout;


/**
 * This class shows how to use JFrimble in a gui app where it is intended
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
public class FrimbleDemo2 extends JFrimble {

    /**
     * Constructor FrimbleDemo
     *
     *
     */
    public FrimbleDemo2() {

        JLabel lbl = new JLabel("<html><p bgcolor=#9bbad6>Hello <b>Armond!</b></p></html>");

        lbl.setBackground(Color.white);
        this.getContentPane().add(lbl, BorderLayout.CENTER);
        this.setTitle("Hey this also really works");
    }

    /**
     * Method main
     *
     *
     * @param args
     *
     */
    public static void main(String[] args) {

        FrimbleDemo2 fd = new FrimbleDemo2();

        fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fd.pack();
        fd.setVisible(true);
    }
}
