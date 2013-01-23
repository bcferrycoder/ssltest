package com.bcferrycoder.samples;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: bcferrycoder
 * Copyright 2013 John Wetherill
 */

public class Util {

    // return all system environment variables
    public static String getEnv() {

        StringBuilder sb = new StringBuilder();
        Map<String, String> env = System.getenv();
        for (String key : env.keySet()) {
            sb.append(key).append(": ").append(env.get(key)).append("\n");
        }

	return sb.toString();
    }
}

