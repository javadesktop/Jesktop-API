/*
 * Copyright (C) The Apache Software Foundation. All rights reserved.
 *
 * This software is published under the terms of the Apache Software License
 * version 1.1, a copy of which has been included with this distribution in
 * the LICENSE file.
 */
package org.jesktop.mime;

import org.jesktop.mime.MimeException;


/**
 * @author  Laurent Cornelis <nelis2@yahoo.com>
 * @author Paul Hammant <a href="mailto:Paul_Hammant@yahoo.com">Paul_Hammant@yahoo.com</a>
 * @version 1.0
 */
public class MimeAlreadyRegisteredException extends MimeException {

    /**
     * Constructor MimeAlreadyRegisteredException
     *
     *
     * @param message
     *
     */
    public MimeAlreadyRegisteredException(String message) {
        super(message);
    }
}
