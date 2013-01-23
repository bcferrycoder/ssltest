package com.bcferrycoder.samples;

/**
 * @(#)HttpsUrlReader.java *
 *
 * @author Dr. Herong Yang
 * @version %W %E
 */
 
 
/* HttpsUrlReader.java
 * Copyright (c) 2011 by Dr. Herong Yang, herongyang.com
 */

import java.io.*;
import java.net.URL;

public class HttpsExerciser {

    public static String doGet(String urlString) {
        StringBuilder sb = new StringBuilder();
        try {
            URL url = new URL(urlString);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String input;
            while ((input = in.readLine()) != null)
                sb.append(input);

            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
