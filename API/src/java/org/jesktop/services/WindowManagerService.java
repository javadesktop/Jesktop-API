package org.jesktop.services;

import org.jesktop.AppLauncher;

/**
 * Created by IntelliJ IDEA.
 * User: phammant
 * Date: 28-Jan-2004
 * Time: 20:57:34
 * To change this template use File | Settings | File Templates.
 */
public interface WindowManagerService extends org.jesktop.WindowManager {
    void setAppLauncher(AppLauncher appLauncher);
}
