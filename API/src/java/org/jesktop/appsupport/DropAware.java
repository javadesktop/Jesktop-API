
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop.appsupport;



import java.awt.Point;


/**
 * Implemented by Classes that can have items dropped on them.
 *
 * @author  <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a>
 * @version 1.0
 */
public interface DropAware {

    /**
     * Method doYouRecognizeDraggedItem is used by the implementing app to indicate
* that the item being dragged is recognized by the app.
     *
     *
     * @param pt the point in screen co-ordinates.
     * @param cl the class of the item being dragged.
     *
     * @return
     *
     */
    boolean doYouRecognizeDraggedItem(final Point pt, Class cl);

    /**
     * Method droppedOnYou
     *
     *
     * @param obj
     *
     */
    void droppedOnYou(Object obj);

    /**
     * Method anotherHasRecognizedDraggedItem
     *
     *
     * @param cl
     *
     */
    void anotherHasRecognizedDraggedItem(Class cl);

    /**
     * Method draggingStopped
     *
     *
     */
    void draggingStopped();
}
