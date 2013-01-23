package com.bcferrycoder.samples;

/**
 * Created by IntelliJ IDEA.
 * User: bcferrycoder
 * Copyright 2013 John Wetherill
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

    // illustrate the user of javax.net.ssl.trustStore from Stackato-deployed app

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		response.setStatus(200);

        String appHome = System.getenv("HOME");
        String certPath = appHome + "/WEB-INF/classes/certs/jdw.jks";
        System.setProperty("javax.net.ssl.trustStore",certPath);
        System.setProperty("javax.net.ssl.trustStorePassword","abcdef");

        String s = HttpExerciser.doGet("https://github.com");

		PrintWriter writer = response.getWriter();
		writer.println("Hello from " + System.getenv("VCAP_APP_HOST") + ":" + System.getenv("VCAP_APP_PORT"));
		writer.println(" Java Version: " + System.getProperty("java.version")+ " from "+System.getProperty("java.vendor"));
        writer.println("user.dir: "+ System.getProperty("user.dir"));
        writer.println("certPath: "+ certPath);
		writer.println(s);

        writer.println(Util.getEnv());

		writer.close();
	}
}
