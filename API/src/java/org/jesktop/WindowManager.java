package org.jesktop;

import org.jesktop.frimble.Frimble;

import java.beans.PropertyChangeListener;

/**
 * Created by IntelliJ IDEA.
 * User: phammant
 * Date: 07-Feb-2004
 * Time: 09:20:23
 * To change this template use File | Settings | File Templates.
 */
public interface WindowManager extends PropertyChangeListener {
    Frimble createFrimble(String displayName);

    void addLaunchedTarget(LaunchedTarget lchd);
}
