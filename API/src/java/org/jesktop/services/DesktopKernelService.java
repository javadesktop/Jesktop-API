/*
 * Copyright (C) The Apache Software Foundation. All rights reserved.
 *
 * This software is published under the terms of the Apache Software License
 * version 1.1, a copy of which has been included with this distribution in
 * the LICENSE file.
 */
package org.jesktop.services;

import org.jesktop.DesktopKernel;
import org.jesktop.LaunchedTarget;
import org.jesktop.frimble.Frimble;
import org.jesktop.frimble.FrimbleListener;
import org.jesktop.launchable.LaunchableTarget;

import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;

public interface DesktopKernelService extends DesktopKernel, PropertyChangeListener {

    FrimbleListener getKernelFrimbleListener();

    LaunchedTarget makeKernelLaunchedTarget(Frimble frimble, Object instantiatedApp, LaunchableTarget launchableTarget);

    void shutdownJesktopOnly(boolean force) throws PropertyVetoException;

    void shutdownSystem(boolean force) throws PropertyVetoException;

}
