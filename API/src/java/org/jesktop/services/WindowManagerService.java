package org.jesktop.services;

import org.jesktop.AppLauncher;
import org.jesktop.DesktopKernel;
import org.jesktop.LaunchedTarget;
import org.jesktop.appsupport.DraggedItem;
import org.jesktop.config.PersistableConfig;

import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: phammant
 * Date: 28-Jan-2004
 * Time: 20:57:34
 * To change this template use File | Settings | File Templates.
 */
public interface WindowManagerService extends org.jesktop.WindowManager {
    void setAppLauncher(AppLauncher appLauncher);

    void setKernelCallback(DesktopKernel desktopKernel);

    void setPersistableConfig(PersistableConfig persistableConfig);

    void initializeView();

    void renderDragRepresentation(DraggedItem draggedItem, Point pt);

    void close();

    void updateComponentTreeUI();

    void removeLaunchedTarget(LaunchedTarget klt);
}
