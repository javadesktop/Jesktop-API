/*
 * Copyright (C) The Apache Software Foundation. All rights reserved.
 *
 * This software is published under the terms of the Apache Software License
 * version 1.1, a copy of which has been included with this distribution in
 * the LICENSE file.
 */
package org.jesktop.config;

import org.jesktop.config.ConfigManager;

import java.beans.PropertyChangeEvent;

/**
 * Class ConfigHelper
 *
 *
 * @author Paul Hammant <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a>
 * @version $Revision: 1.1 $
 */

public class ConfigHelper {
    
    public static boolean isConfigPropChange(PropertyChangeEvent event) {
        return (event.getPropertyName().startsWith(ConfigManager.PROPCHG_PREFIX));
    }
    
    public static String getConfigPath(PropertyChangeEvent event) {
        return event.getPropertyName().substring(ConfigManager.PROPCHG_PREFIX.length(),event.getPropertyName().length());
    }
}