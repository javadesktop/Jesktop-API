
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop.frimble;



import java.awt.AWTEvent;


/**
 * Class FrimbleEvent
 *
 *
 * @author <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a> Dec 2000.
 * @version $Revision: 1.1 $
 */
public class FrimbleEvent extends AWTEvent {

    public static final int FRIMBLE_FIRST = 25549;
    public static final int FRIMBLE_LAST = 25555;
    public static final int FRIMBLE_OPENED = FRIMBLE_FIRST;
    public static final int FRIMBLE_CLOSING = 1 + FRIMBLE_FIRST;
    public static final int FRIMBLE_CLOSED = 2 + FRIMBLE_FIRST;
    public static final int FRIMBLE_ICONIFIED = 3 + FRIMBLE_FIRST;
    public static final int FRIMBLE_DEICONIFIED = 4 + FRIMBLE_FIRST;
    public static final int FRIMBLE_ACTIVATED = 5 + FRIMBLE_FIRST;
    public static final int FRIMBLE_DEACTIVATED = 6 + FRIMBLE_FIRST;

    /**
     * Constructor FrimbleEvent
     *
     *
     * @param source
     * @param id
     *
     */
    public FrimbleEvent(Frimble source, int id) {
        super(source, id);
    }

    /**
     * Method paramString
     *
     *
     * @return
     *
     */
    public String paramString() {

        String typeStr;

        switch (id) {

        case FRIMBLE_OPENED :
            typeStr = "FRIMBLE_OPENED";
            break;

        case FRIMBLE_CLOSING :
            typeStr = "FRIMBLE_CLOSING";
            break;

        case FRIMBLE_CLOSED :
            typeStr = "FRIMBLE_CLOSED";
            break;

        case FRIMBLE_ICONIFIED :
            typeStr = "FRIMBLE_ICONIFIED";
            break;

        case FRIMBLE_DEICONIFIED :
            typeStr = "FRIMBLE_DEICONIFIED";
            break;

        case FRIMBLE_ACTIVATED :
            typeStr = "FRIMBLE_ACTIVATED";
            break;

        case FRIMBLE_DEACTIVATED :
            typeStr = "FRIMBLE_DEACTIVATED";
            break;

        default :
            typeStr = "unknown type";
        }

        return typeStr;
    }

    /**
     * Method getFrimble
     *
     *
     * @return
     *
     */
    public Frimble getFrimble() {
        return (source instanceof Frimble) ? (Frimble) source : null;
    }
}
