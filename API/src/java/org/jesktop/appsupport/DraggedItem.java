
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop.appsupport;

import javax.swing.JComponent;


/**
 * Class DraggedItem is passed with DropAware apps.
 *
 *
 * @author  <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a>
 * @version 1.0
 */
public class DraggedItem {

    private JComponent dragRep;
    private Object item;

    /**
     * Constructor DraggedItem
     *
     *
     * @param dragRep the visible manifestation of the dragged item.  Usually a JLabel.
     * @param item the item itself.
     *
     */
    public DraggedItem(JComponent dragRep, Object item) {
        this.dragRep = dragRep;
        this.item = item;
    }

    /**
     * Method getDragRep
     *
     *
     * @return the visible manifestation of the dragged item
     *
     */
    public JComponent getDragRep() {
        return dragRep;
    }

    /**
     * Method getItemClass
     *
     *
     * @return theclass type of the item.
     *
     */
    public Class getDraggedItemClass() {
        return item.getClass();
    }

    /**
     * Method getDraggedIem
     *
     *
     * @return the dragged item itself.
     *
     */
    public Object getDraggedIem() {
        return item;
    }
}
