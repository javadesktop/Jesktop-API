
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
 * @author Paul Hammant <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a>
 * @version 1.0
 */
public class JFrimble extends Object implements Frimble {

    private Frimble frimble;
    private static FrimbleFactory systemFrimbleFactory;

    /**
     * Constructor JFrimble
     *
     *
     */
    public JFrimble() {
        frimble = getFrimbleFactory().getFrimble();
    }

    /**
     * Constructor JFrimble
     *
     *
     * @param title
     *
     */
    public JFrimble(String title) {

        this();

        setTitle(title);
    }

    /**
     * Method getFrimble
     *
     *
     * @return
     *
     */
    public Frimble getFrimble() {
        return frimble;
    }

    /**
     * Method setFrimbleFactory
     *
     *
     * @param frimbleFactory
     *
     */
    public static void setFrimbleFactory(FrimbleFactory frimbleFactory) {

        if (systemFrimbleFactory == null) {
            systemFrimbleFactory = frimbleFactory;
        }    // otherwise ignore request.
    }

    private static FrimbleFactory getFrimbleFactory() {

        if (systemFrimbleFactory == null) {
            systemFrimbleFactory = new JFrameFrimbleFactory();
        }

        return systemFrimbleFactory;
    }

    // common methods (inspired by thsoe for frames and internal frames)

    /**
     * Method addFrimbleListener
     *
     *
     * @param fl
     *
     */
    public void addFrimbleListener(FrimbleListener fl) {
        frimble.addFrimbleListener(fl);
    }

    /**
     * Method removeFrimbleListener
     *
     *
     * @param fl
     *
     */
    public void removeFrimbleListener(FrimbleListener fl) {
        frimble.removeFrimbleListener(fl);
    }

    /**
     */
    public final void setJMenuBar(JMenuBar m) {
        frimble.setJMenuBar(m);
    }

    /**
     * Method getJMenuBar
     *
     *
     * @return
     *
     */
    public final JMenuBar getJMenuBar() {
        return frimble.getJMenuBar();
    }

    /**
     * Method setTitle
     *
     *
     * @param t
     *
     */
    public final void setTitle(String t) {
        frimble.setTitle(t);
    }

    /**
     * Method getTitle
     *
     *
     * @return
     *
     */
    public final String getTitle() {
        return frimble.getTitle();
    }

    /**
     * Method pack
     *
     *
     */
    public final void pack() {
        frimble.pack();
    }

    /**
     * Method setVisible
     *
     *
     * @param yesOrNo
     *
     */
    public final void setVisible(boolean yesOrNo) {
        frimble.setVisible(yesOrNo);
    }

    /**
     * Method getFocusOwner
     *
     *
     * @return
     *
     */
    public final Component getFocusOwner() {
        return frimble.getFocusOwner();
    }

    /**
     * Method getGlassPane
     *
     *
     * @return
     *
     */
    public final Component getGlassPane() {
        return frimble.getGlassPane();
    }

    /**
     * Method getContentPane
     *
     *
     * @return
     *
     */
    public final Container getContentPane() {
        return frimble.getContentPane();
    }

    /**
     * Method getLayeredPane
     *
     *
     * @return
     *
     */
    public final JLayeredPane getLayeredPane() {
        return frimble.getLayeredPane();
    }

    /**
     * Method getRootPane
     *
     *
     * @return
     *
     */
    public final JRootPane getRootPane() {
        return frimble.getRootPane();
    }

    /**
     * Method isResizable
     *
     *
     * @return
     *
     */
    public final boolean isResizable() {
        return frimble.isResizable();
    }

    /**
     * Method getDefaultCloseOperation
     *
     *
     * @return
     *
     */
    public final int getDefaultCloseOperation() {
        return frimble.getDefaultCloseOperation();
    }

    /**
     * Method dispose
     *
     *
     */
    public final void dispose() {
        frimble.dispose();
    }

    /**
     * Method setContentPane
     *
     *
     * @param contentPane
     *
     */
    public final void setContentPane(Container contentPane) {
        frimble.setContentPane(contentPane);
    }

    /**
     * Method setDefaultCloseOperation
     *
     *
     * @param operation
     *
     */
    public final void setDefaultCloseOperation(int operation) {
        frimble.setDefaultCloseOperation(operation);
    }

    /**
     * Method setGlassPane
     *
     *
     * @param glassPane
     *
     */
    public final void setGlassPane(Component glassPane) {
        frimble.setGlassPane(glassPane);
    }

    /**
     * Method setLayeredPane
     *
     *
     * @param layeredPane
     *
     */
    public final void setLayeredPane(JLayeredPane layeredPane) {
        frimble.setLayeredPane(layeredPane);
    }

    /**
     * Method setResizable
     *
     *
     * @param resizable
     *
     */
    public final void setResizable(boolean resizable) {
        frimble.setResizable(resizable);
    }

    /**
     * Method show
     *
     *
     */
    public final void show() {
        frimble.show();
    }

    /**
     * Method toBack
     *
     *
     */
    public final void toBack() {
        frimble.toBack();
    }

    /**
     * Method toFront
     *
     *
     */
    public final void toFront() {
        frimble.toFront();
    }

    /**
     * Method showOpenDialog
     *
     *
     * @param chooser
     *
     * @return
     *
     */
    public final int showOpenDialog(JFileChooser chooser) {
        return frimble.showOpenDialog(chooser);
    }

    /**
     * Method showSaveDialog
     *
     *
     * @param chooser
     *
     * @return
     *
     */
    public final int showSaveDialog(JFileChooser chooser) {
        return frimble.showSaveDialog(chooser);
    }

    /**
     * Method setClosed
     *
     *
     * @param b
     *
     * @throws PropertyVetoException
     *
     */
    public final void setClosed(boolean b) throws PropertyVetoException {
        frimble.setClosed(b);
    }

    /**
     * Method getFrimbleContained
     *
     *
     * @return
     *
     */
    public final Component getFrimbleContained() {
        return frimble.getFrimbleContained();
    }

    /**
     * Method getOwnerFrame
     *
     *
     * @return
     *
     */
    public final Frame getOwnerFrame() {
        return frimble.getOwnerFrame();
    }

    /**
     * Method getSize
     *
     *
     * @return
     *
     */
    public final Dimension getSize() {
        return frimble.getSize();
    }

    /**
     * Method setSize
     *
     *
     * @param dim
     *
     */
    public final void setSize(Dimension dim) {
        frimble.setSize(dim);
    }

    /**
     * Method setIconImage
     *
     *
     * @param image
     *
     */
    public final void setIconImage(java.awt.Image image) {
        frimble.setIconImage(image);
    }

    //public void setFrameIcon(Icon icon) {
    //  Image im;
    //  frimble.setIconImage(new ImageIcon(icon).getImage());
    // }

    /**
     * Method setBackground
     *
     *
     * @param col
     *
     */
    public final void setBackground(Color col) {
        frimble.setBackground(col);
    }

    /**
     * Method setFrameIcon
     *
     *
     * @param imageIcon
     *
     */
    public final void setFrameIcon(ImageIcon imageIcon) {

        // no such concept for JFrame, lets hope it simplemented soon.
        // there is a JNI hack, but we are not going to use it.
    }

    /**
     * Method makeFrimble
     *
     *
     * @param frimbleAwareComponent
     *
     * @return
     *
     */
    public final Frimble makeFrimble(FrimbleAware frimbleAwareComponent) {
        return frimble.makeFrimble(frimbleAwareComponent);
    }

    //
    //  protected Frimble makeFrimble2(FrimbleAware frimbleAwareComponent) {
    //    return createJFrameFrimble(new JFrame());
    //  }

    /**
     * Method registerFrimbleCallback
     *
     *
     * @param fcb
     *
     */
    public final void registerFrimbleCallback(FrimbleCallback fcb) {
        frimble.registerFrimbleCallback(fcb);
    }

    // final as it does not function the same way as
    // validate() .... this is not a component!  - PH

    /**
     * Method validate
     *
     *
     */
    public final void validate() {
        frimble.validate();
    }

    /**
     * Method getPreferredSize
     *
     *
     * @return
     *
     */
    public final Dimension getPreferredSize() {
        return frimble.getPreferredSize();
    }

    /**
     * Method getLocation
     *
     *
     * @return
     *
     */
    public final Point getLocation() {
        return frimble.getLocation();
    }

    /**
     * Method setLocation
     *
     *
     * @param x
     * @param y
     *
     */
    public final void setLocation(int x, int y) {
        frimble.setLocation(x, y);
    }

    /**
     * Method addKeyListener
     *
     *
     * @param l
     *
     */
    public final void addKeyListener(KeyListener l) {
        frimble.addKeyListener(l);
    }

    /**
     * Method getWidth
     *
     *
     * @return
     *
     */
    public final int getWidth() {
        return frimble.getWidth();
    }

    /**
     * Method getHeight
     *
     *
     * @return
     *
     */
    public final int getHeight() {
        return frimble.getHeight();
    }

    /**
     * Method getBounds
     *
     *
     * @return
     *
     */
    public final Rectangle getBounds() {
        return frimble.getBounds();
    }

    /**
     * Method setSize
     *
     *
     * @param width
     * @param height
     *
     */
    public final void setSize(int width, int height) {
        frimble.setSize(new Dimension(width, height));
    }

    /**
     * Method isVisible
     *
     *
     * @return
     *
     */
    public final boolean isVisible() {
        return frimble.isVisible();
    }
}
