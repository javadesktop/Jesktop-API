/*
 * Copyright (C) The Apache Software Foundation. All rights reserved.
 *
 * This software is published under the terms of the Apache Software License
 * version 1.1, a copy of which has been included with this distribution in
 * the LICENSE file.
 */
package org.jesktop.services;

import org.jesktop.Decorator;
import org.jesktop.WindowManager;
import org.jesktop.config.ConfigManager;
import org.jesktop.config.Configlet;
import org.jesktop.config.ObjConfiglet;
import org.jesktop.config.XMLConfiglet;
import org.jesktop.services.DesktopKernelService;
import org.w3c.dom.Document;

/**
 * @author  Paul_Hammant <Paul_Hammant@yahoo.com>
 * @version 1.0
 */
public interface KernelConfigManager extends ConfigManager {

    void registerConfigInterest(final Configlet clet, final String configPath);

    void unRegisterConfigInterest(final Configlet clet);

    void registerConfigInterest(final DesktopKernelService dks, final String configPath);

    void unRegisterConfigInterest(final DesktopKernelService dks);

    void registerConfigInterest(final WindowManager wm, final String configPath);

    void unRegisterConfigInterest(final WindowManager wm);

    void registerConfigInterest(final Decorator dec, final String configPath);

    void unRegisterConfigInterest(final Decorator dec);

    void notifyInterested(final String configPath, final Configlet sendingConfiglet, final Object config);

    void notifyObjConfig(final String configPath, ClassLoader classLoader);

    void notifyXMLConfig(final String configPath, ClassLoader classLoader);

    Object getObjConfig(final String configPath, final ClassLoader classLoader);

    Document getXMLConfig(final String configPath, final ClassLoader classLoader);

    String getStringConfig(final String configPath, final String defaultVal);

    void notifyUpdatedNoSave(final ObjConfiglet clet);

    void notifyUpdatedNoSave(final XMLConfiglet clet);
}
