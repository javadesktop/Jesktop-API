
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop.frimble;

import javax.swing.JMenuBar;
import javax.swing.JLayeredPane;
import javax.swing.JRootPane;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyListener;
import java.beans.PropertyVetoException;


/**
 * Frimble is just a helper class.  It provides a common
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
public interface Frimble {

    /**
     * Method addFrimbleListener
     *
     *
     * @param fl
     *
     */
    public void addFrimbleListener(FrimbleListener fl);

    /**
     * Method removeFrimbleListener
     *
     *
     * @param fl
     *
     */
    public void removeFrimbleListener(FrimbleListener fl);

    /**
     * Method setJMenuBar allows the menu bar to be set for the frimble.
     *
     */
    public void setJMenuBar(JMenuBar m);

    /**
     * Gets the Jemnubar for the frimble.
     *
     */
    public JMenuBar getJMenuBar();

    /**
     * Method setTitle sets a title from the frimble
     *
     *
     * @param t title
     *
     */
    public void setTitle(String t);

    /**
     * Method getTitle gets the title for a frimble.
     *
     *
     * @return the title.
     *
     */
    public String getTitle();

    /**
     * Method pack packs the frimble.
     *
     *
     */
    public void pack();

    /**
     * Method setVisible controls the visibility of the frimble.
     *
     *
     * @param yesOrNo visible or invisible.
     *
     */
    public void setVisible(boolean yesOrNo);

    /**
     * Method getFocusOwner gets the Component that is the focus owner for the frimble.
     *
     *
     */
    public Component getFocusOwner();

    /**
     * Method getGlassPane gets the glass pane for the frimble.
     *
     *
     * @return the glass pane.
     *
     */
    public Component getGlassPane();

    /**
     * Method getContentPane gets the content pane for the frimble.
     *
     *
     * @return the content pane.
     *
     */
    public Container getContentPane();

    /**
     * Method getLayeredPane gets the layered pane for the frimble.
     *
     *
     * @return the layered pane.
     *
     */
    public JLayeredPane getLayeredPane();

    /**
     * Method getRootPane gets the root pane for the frimble.
     *
     *
     * @return the root pane.
     *
     */
    public JRootPane getRootPane();

    /**
     * Method isResizable determines of the frimble supports resize.
     *
     *
     * @return true for does resize.
     *
     */
    public boolean isResizable();

    /**
     * Method getDefaultCloseOperation gets the default close operation for frimble
     * //TODO - still needs true adaption?
     *
     * @return the default close operation.
     *
     */
    public int getDefaultCloseOperation();

    /**
     * Method dispose initiates a close sequence for the frimble.
     *
     *
     */
    public void dispose();

    /**
     * Method setContentPane places a container as the content pane.
     *
     *
     * @param contentPane the new content pane
     *
     */
    public void setContentPane(Container contentPane);

    /**
     * Method setDefaultCloseOperation sets the default close operation
     * //TODO ints the same for JFrame and JInternalFrame?
     *
     * @param operation new default close action
     *
     */
    public void setDefaultCloseOperation(int operation);

    /**
     * Method setGlassPane sets teh glass pane.
     *
     */
    public void setGlassPane(Component glassPane);

    /**
     * Method setLayeredPane sets the layered pane.
     *
     *
     */
    public void setLayeredPane(JLayeredPane layeredPane);

    /**
     * Method setResizable sets the resizability of this frimble.
     *
     *
     */
    public void setResizable(boolean resizable);

    /**
     * Method show same as setVisible(true).
     *
     */
    public void show();

    /**
     * Method toBack  moves the frimble to the back of it's peer set of frimbles.
     *
     *
     */
    public void toBack();

    /**
     * Method toFront moves the frimble to the front of it's peer set of frimbles.
     *
     *
     */
    public void toFront();

    /**
     * Method showOpenDialog shows an open dialog (attached to this frimble).
     *
     *
     * @param chooser the file chooser to open.
     *
     * @return the action chosen - see JFileChooser.
     *
     */
    public int showOpenDialog(JFileChooser chooser);

    /**
     * Method showSaveDialog shows an save dialog (attached to this frimble).
     *
     *
     * @param chooser the file chooser to open.
     *
     * @return the action chosen - see JFileChooser.
     *
     */
    public int showSaveDialog(JFileChooser chooser);

    /**
     * Method showOpenDialog shows an save dialog (attached to this frimble).
     *
     *
     * @return
     *
     */
    public Component getFrimbleContained();

    /**
     * Method getOwnerFrame
     *
     *
     * @return
     *
     */
    public Frame getOwnerFrame();

    /**
     * Method getSize
     *
     *
     * @return
     *
     */
    public Dimension getSize();

    /**
     * Method setSize
     *
     *
     * @param dim
     *
     */
    public void setSize(Dimension dim);

    /**
     * Method setIconImage
     *
     *
     * @param image
     *
     */
    public void setIconImage(java.awt.Image image);

    //public void setFrameIcon(Icon icon);

    /**
     * Method setBackground
     *
     *
     * @param col
     *
     */
    public void setBackground(Color col);

    /**
     * Method setClosed
     *
     *
     * @param b
     *
     * @throws PropertyVetoException
     *
     */
    public void setClosed(boolean b) throws PropertyVetoException;

    /**
     * Method setFrameIcon
     *
     *
     * @param imageIcon
     *
     */
    public void setFrameIcon(ImageIcon imageIcon);

    /**
     * Method makeFrimble
     *
     *
     *
     */
    public Frimble makeFrimble(FrimbleAware frimbleAwareComponent);

    /**
     * Method registerFrimbleCallback
     *
     *
     * @param fcb
     *
     */
    public void registerFrimbleCallback(FrimbleCallback fcb);

    /**
     * Method validate
     *
     *
     */
    public void validate();

    /**
     * Method getPreferredSize
     *
     *
     * @return
     *
     */
    public Dimension getPreferredSize();

    /**
     * Method getLocation
     *
     *
     * @return
     *
     */
    public Point getLocation();

    /**
     * Method setLocation
     *
     *
     * @param x
     * @param y
     *
     */
    public void setLocation(int x, int y);

    /**
     * Method addKeyListener
     *
     *
     * @param l
     *
     */
    public void addKeyListener(KeyListener l);

    /**
     * Method getWidth
     *
     *
     * @return
     *
     */
    public int getWidth();

    /**
     * Method getHeight
     *
     *
     * @return
     *
     */
    public int getHeight();

    /**
     * Method getBounds
     *
     *
     * @return
     *
     */
    public Rectangle getBounds();

    /**
     * Method isVisible
     *
     *
     * @return
     *
     */
    public boolean isVisible();
}
