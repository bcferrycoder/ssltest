package com.bcferrycoder.samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: bcferrycoder
 * Copyright 2013 John Wetherill
 */

public class HttpExerciser {

    // hit a url, return response as string
    public static String doGet(String urlString) {
        StringBuilder sb = new StringBuilder();
        try {
            URL url = new URL(urlString);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String input;
            while ((input = in.readLine()) != null) {
                sb.append(input);
            }

            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
