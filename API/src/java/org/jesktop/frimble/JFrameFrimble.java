
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop.frimble;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JLayeredPane;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import javax.swing.JRootPane;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


/**
 * @author Paul Hammant <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a>
 * @version 1.0
 */
public class JFrameFrimble extends AbstractFrimble {

    private JFrame frame;
    private JFFrimbleAdapter jfFrimbleAdapter;

    protected JFrameFrimble(JFrame parent) {

        frame = parent;
        jfFrimbleAdapter = new JFFrimbleAdapter();

        parent.addWindowListener(jfFrimbleAdapter);
    }

    /**
     * Method createJFrameFrimble
     *
     *
     * @param parent
     *
     * @return
     *
     */
    public static JFrameFrimble createJFrameFrimble(JFrame parent) {
        return new JFrameFrimble(parent);
    }

    // common methods (inspired by thsoe for frames and internal frames)

    /**
     */
    public void setJMenuBar(JMenuBar m) {
        frame.setJMenuBar(m);
    }

    /**
     * Method getJMenuBar
     *
     *
     * @return
     *
     */
    public JMenuBar getJMenuBar() {
        return frame.getJMenuBar();
    }

    /**
     * Method setTitle
     *
     *
     * @param t
     *
     */
    public void setTitle(String t) {
        frame.setTitle(t);
    }

    /**
     * Method getTitle
     *
     *
     * @return
     *
     */
    public String getTitle() {
        return frame.getTitle();
    }

    /**
     * Method pack
     *
     *
     */
    public void pack() {
        frame.pack();
    }

    /**
     * Method setVisible
     *
     *
     * @param yesOrNo
     *
     */
    public void setVisible(boolean yesOrNo) {
        frame.setVisible(yesOrNo);
    }

    /**
     * Method getFocusOwner
     *
     *
     * @return
     *
     */
    public Component getFocusOwner() {
        return frame.getFocusOwner();
    }

    /**
     * Method getGlassPane
     *
     *
     * @return
     *
     */
    public Component getGlassPane() {
        return frame.getGlassPane();
    }

    /**
     * Method getContentPane
     *
     *
     * @return
     *
     */
    public Container getContentPane() {
        return frame.getContentPane();
    }

    /**
     * Method getLayeredPane
     *
     *
     * @return
     *
     */
    public JLayeredPane getLayeredPane() {
        return frame.getLayeredPane();
    }

    /**
     * Method getRootPane
     *
     *
     * @return
     *
     */
    public JRootPane getRootPane() {
        return frame.getRootPane();
    }

    /**
     * Method isResizable
     *
     *
     * @return
     *
     */
    public boolean isResizable() {
        return frame.isResizable();
    }

    /**
     * Method getDefaultCloseOperation
     *
     *
     * @return
     *
     */
    public int getDefaultCloseOperation() {
        return frame.getDefaultCloseOperation();
    }

    /**
     * Method dispose
     *
     *
     */
    public void dispose() {
        frame.dispose();
    }

    /**
     * Method setContentPane
     *
     *
     * @param contentPane
     *
     */
    public void setContentPane(Container contentPane) {
        frame.setContentPane(contentPane);
    }

    /**
     * Method setDefaultCloseOperation
     *
     *
     * @param operation
     *
     */
    public void setDefaultCloseOperation(int operation) {
        frame.setDefaultCloseOperation(operation);
    }

    /**
     * Method setGlassPane
     *
     *
     * @param glassPane
     *
     */
    public void setGlassPane(Component glassPane) {
        frame.setGlassPane(glassPane);
    }

    /**
     * Method setLayeredPane
     *
     *
     * @param layeredPane
     *
     */
    public void setLayeredPane(JLayeredPane layeredPane) {
        frame.setLayeredPane(layeredPane);
    }

    /**
     * Method setResizable
     *
     *
     * @param resizable
     *
     */
    public void setResizable(boolean resizable) {
        frame.setResizable(resizable);
    }

    /**
     * Method show
     *
     *
     */
    public void show() {
        frame.show();
    }

    /**
     * Method toBack
     *
     *
     */
    public void toBack() {
        frame.toBack();
    }

    /**
     * Method toFront
     *
     *
     */
    public void toFront() {
        frame.toFront();
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
    public int showOpenDialog(JFileChooser chooser) {
        return chooser.showOpenDialog(frame);
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
    public int showSaveDialog(JFileChooser chooser) {
        return chooser.showSaveDialog(frame);
    }

    /**
     * Method setClosed
     *
     *
     * @param b
     *
     */
    public void setClosed(boolean b) {

        if (b) {
            frame.dispose();
        }
    }

    /**
     * Method getFrimbleContained
     *
     *
     * @return
     *
     */
    public Component getFrimbleContained() {
        return frame;
    }

    /**
     * Method getSize
     *
     *
     * @return
     *
     */
    public Dimension getSize() {
        return frame.getSize();
    }

    /**
     * Method setSize
     *
     *
     * @param dim
     *
     */
    public void setSize(Dimension dim) {
        frame.setSize(dim);
    }

    /**
     * Method setIconImage
     *
     *
     * @param image
     *
     */
    public void setIconImage(java.awt.Image image) {
        frame.setIconImage(image);
    }

    //public void setFrameIcon(Icon icon) {
    //  Image im;
    //  frame.setIconImage(new ImageIcon(icon).getImage());
    // }

    /**
     * Method setBackground
     *
     *
     * @param col
     *
     */
    public void setBackground(Color col) {
        frame.setBackground(col);
    }

    /**
     * Method setFrameIcon
     *
     *
     * @param imageIcon
     *
     */
    public void setFrameIcon(ImageIcon imageIcon) {

        // no such concept for JFrame, lets hope it simplemented soon.
        // there is a JNI hack, but we are not going to use it.
    }

    /**
     * Method validate
     *
     *
     */
    public void validate() {
        frame.validate();
    }

    /**
     * Method getPreferredSize
     *
     *
     * @return
     *
     */
    public Dimension getPreferredSize() {
        return frame.getPreferredSize();
    }

    /**
     * Method getLocation
     *
     *
     * @return
     *
     */
    public Point getLocation() {
        return frame.getLocation();
    }

    /**
     * Method setLocation
     *
     *
     * @param x
     * @param y
     *
     */
    public void setLocation(int x, int y) {
        frame.setLocation(x, y);
    }

    /**
     * Method addKeyListener
     *
     *
     * @param l
     *
     */
    public void addKeyListener(KeyListener l) {
        frame.addKeyListener(l);
    }

    /**
     * Method getWidth
     *
     *
     * @return
     *
     */
    public int getWidth() {
        return frame.getWidth();
    }

    /**
     * Method getHeight
     *
     *
     * @return
     *
     */
    public int getHeight() {
        return frame.getHeight();
    }

    protected Frimble makeFrimble2(FrimbleAware frimbleAwareComponent) {
        return createJFrameFrimble(new JFrame());
    }

    /**
     * Method getBounds
     *
     *
     * @return
     *
     */
    public Rectangle getBounds() {
        return frame.getBounds();
    }

    /**
     * Method isVisible
     *
     *
     * @return
     *
     */
    public boolean isVisible() {
        return frame.isVisible();
    }

    /// event adapter

    /**
     * Class JFFrimbleAdapter
     *
     *
     * @author Paul Hammant <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a>
     * @version $Revision: 1.1 $
     */
    private class JFFrimbleAdapter implements WindowListener {

        /**
         * Method windowOpened
         *
         *
         * @param e
         *
         */
        public void windowOpened(WindowEvent e) {

            FrimbleEvent frimbleEvent = null;
            Object[] listeners = listenerList.getListenerList();

            for (int i = listeners.length - 2; i >= 0; i -= 2) {
                if (listeners[i] == FrimbleListener.class) {

                    // Lazily create the event:
                    if (frimbleEvent == null) {
                        frimbleEvent = new FrimbleEvent(JFrameFrimble.this,
                                                        FrimbleEvent.FRIMBLE_OPENED);
                    }

                    ((FrimbleListener) listeners[i + 1]).frimbleOpened(frimbleEvent);
                }
            }
        }

        /**
         * Method windowClosing
         *
         *
         * @param e
         *
         */
        public void windowClosing(WindowEvent e) {

            FrimbleEvent frimbleEvent = null;
            Object[] listeners = listenerList.getListenerList();

            for (int i = listeners.length - 2; i >= 0; i -= 2) {
                if (listeners[i] == FrimbleListener.class) {

                    // Lazily create the event:
                    if (frimbleEvent == null) {
                        frimbleEvent = new FrimbleEvent(JFrameFrimble.this,
                                                        FrimbleEvent.FRIMBLE_CLOSING);
                    }

                    ((FrimbleListener) listeners[i + 1]).frimbleClosing(frimbleEvent);
                }
            }
        }

        /**
         * Method windowClosed
         *
         *
         * @param e
         *
         */
        public void windowClosed(WindowEvent e) {

            FrimbleEvent frimbleEvent = null;
            Object[] listeners = listenerList.getListenerList();

            for (int i = listeners.length - 2; i >= 0; i -= 2) {
                if (listeners[i] == FrimbleListener.class) {

                    // Lazily create the event:
                    if (frimbleEvent == null) {
                        frimbleEvent = new FrimbleEvent(JFrameFrimble.this,
                                                        FrimbleEvent.FRIMBLE_CLOSING);
                    }

                    ((FrimbleListener) listeners[i + 1]).frimbleClosed(frimbleEvent);
                }
            }
        }

        /**
         * Method windowIconified
         *
         *
         * @param e
         *
         */
        public void windowIconified(WindowEvent e) {

            FrimbleEvent frimbleEvent = null;
            Object[] listeners = listenerList.getListenerList();

            for (int i = listeners.length - 2; i >= 0; i -= 2) {
                if (listeners[i] == FrimbleListener.class) {

                    // Lazily create the event:
                    if (frimbleEvent == null) {
                        frimbleEvent = new FrimbleEvent(JFrameFrimble.this,
                                                        FrimbleEvent.FRIMBLE_ICONIFIED);
                    }

                    ((FrimbleListener) listeners[i + 1]).frimbleIconified(frimbleEvent);
                }
            }
        }

        /**
         * Method windowDeiconified
         *
         *
         * @param e
         *
         */
        public void windowDeiconified(WindowEvent e) {

            FrimbleEvent frimbleEvent = null;
            Object[] listeners = listenerList.getListenerList();

            for (int i = listeners.length - 2; i >= 0; i -= 2) {
                if (listeners[i] == FrimbleListener.class) {

                    // Lazily create the event:
                    if (frimbleEvent == null) {
                        frimbleEvent = new FrimbleEvent(JFrameFrimble.this,
                                                        FrimbleEvent.FRIMBLE_DEICONIFIED);
                    }

                    ((FrimbleListener) listeners[i + 1]).frimbleDeiconified(frimbleEvent);
                }
            }
        }

        /**
         * Method windowActivated
         *
         *
         * @param e
         *
         */
        public void windowActivated(WindowEvent e) {

            FrimbleEvent frimbleEvent = null;
            Object[] listeners = listenerList.getListenerList();

            for (int i = listeners.length - 2; i >= 0; i -= 2) {
                if (listeners[i] == FrimbleListener.class) {

                    // Lazily create the event:
                    if (frimbleEvent == null) {
                        frimbleEvent = new FrimbleEvent(JFrameFrimble.this,
                                                        FrimbleEvent.FRIMBLE_ACTIVATED);
                    }

                    ((FrimbleListener) listeners[i + 1]).frimbleActivated(frimbleEvent);
                }
            }
        }

        /**
         * Method windowDeactivated
         *
         *
         * @param e
         *
         */
        public void windowDeactivated(WindowEvent e) {

            FrimbleEvent frimbleEvent = null;
            Object[] listeners = listenerList.getListenerList();

            for (int i = listeners.length - 2; i >= 0; i -= 2) {
                if (listeners[i] == FrimbleListener.class) {

                    // Lazily create the event:
                    if (frimbleEvent == null) {
                        frimbleEvent = new FrimbleEvent(JFrameFrimble.this,
                                                        FrimbleEvent.FRIMBLE_DEACTIVATED);
                    }

                    ((FrimbleListener) listeners[i + 1]).frimbleDeactivated(frimbleEvent);
                }
            }
        }
    }
}
