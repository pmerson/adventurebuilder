/* Copyright 2004 Sun Microsystems, Inc.  All rights reserved.  You may not modify, use, reproduce, or distribute this software except in compliance with the terms of the License at: 
 http://adventurebuilder.dev.java.net/LICENSE.txt
 $Id: CommandSupport.java,v 1.2 2004/05/26 00:07:25 inder Exp $ */

package com.sun.j2ee.blueprints.waf.controller;

public abstract class CommandSupport implements java.io.Serializable, Command {

  public void doStart() {}

  public void doEnd() {} 
}

