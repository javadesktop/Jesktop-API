
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop.config;

import java.beans.PropertyChangeListener;


/**
 * @author  Paul_Hammant <Paul_Hammant@yahoo.com>
 * @version 1.0
 */
public interface Configlet  extends PropertyChangeListener {

    /**
     * Method setConfigManager
     *
     *
     * @param cm
     *
     */
    void setConfigManager(ConfigManager cm);
}
