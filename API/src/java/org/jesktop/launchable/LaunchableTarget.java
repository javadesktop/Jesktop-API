
/*****************************************************************************
 * Copyright (C) Jesktop Organization. All rights reserved.                  *
 * ------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the BSD      *
 * style license a copy of which has been included with this distribution in *
 * the jesktop-bsd-license.html file.                                        *
 *****************************************************************************/
package org.jesktop.launchable;



import java.util.Comparator;

import java.io.Serializable;


/**
 * Class LaunchableTarget
 *
 *
 * @author <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a> Jan 2001.
 * @version $Revision: 1.1 $
 */
public interface LaunchableTarget extends Comparable {

    /**
     * Method getTargetName
     *
     *
     * @return
     *
     */
    String getTargetName();

    /**
     * Method getDisplayName
     *
     *
     * @return
     *
     */
    String getDisplayName();

    /**
     * Method getTargetNameParts
     *
     *
     * @return
     *
     */
    String[] getTargetNameParts();

    /**
     * Method getClassName
     *
     *
     * @return
     *
     */
    String getClassName();

    /**
     * Method canBeUnInstalled
     *
     *
     * @return
     *
     */
    boolean canBeUnInstalled();

    /**
     * Method isSingleInstanceApp
     *
     *
     * @return
     *
     */
    boolean isSingleInstanceApp();
}
