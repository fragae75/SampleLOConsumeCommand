/*
 * Copyright (C) 2016 Orange
 *
 * This software is distributed under the terms and conditions of the 'BSD-3-Clause'
 * license which can be found in the file 'LICENSE.txt' in this package distribution
 * or at 'https://opensource.org/licenses/BSD-3-Clause'.
 */
package com.test.SampleLOConsumeCommand;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DeviceCommand {

    public String req;
    public Map<String, Object> arg;
    public Long cid;

    @Override public String toString() {
  
    	return "DeviceCommand{" +
                "req='" + req + '\'' +
                ", arg=" + arg +
                ", cid=" + cid +
                '}';
    }
    
    
}
