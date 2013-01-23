package com.bcferrycoder.samples;

import java.util.Map;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * User: stackato
 * Date: 12/21/12
 * Time: 3:40 PM
 * Copyright 2012 John Wetherill
 */
public class ShowEnv {

    public static String getEnv() {

        StringBuilder sb = new StringBuilder();
        Map<String, String> env = System.getenv();
        for (String key : env.keySet()) {
            sb.append(key + ": " + env.get(key)  + "\n");
        }

	return sb.toString();
    }
}

