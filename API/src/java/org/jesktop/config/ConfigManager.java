
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop.config;

import org.jesktop.config.ObjConfiglet;


/**
 * @author  Paul_Hammant <Paul_Hammant@yahoo.com>
 * @version 1.0
 */
public interface ConfigManager {
    
    public String PROPCHG_PREFIX = "org.jesktop.config.ConfigManager:";

    /**
     * Method notifyUpdated
     *
     *
     * @param clet
     *
     */
    void notifyUpdated(ObjConfiglet clet);

    /**
     * Method notifyUpdated
     *
     *
     * @param clet
     *
     */
    void notifyUpdated(XMLConfiglet clet);
}
