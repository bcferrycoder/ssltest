SIMPLE SSL TEST
===============

Shows how to use custom ssl certificates from a Stackato-deployed app.


Build
--------

### Maven

Make sure you have [Maven](http://maven.apache.org/ "Maven") installed.
Then, *cd* into the root directory and execute:

	mvn clean package

That will create the *ssltest.war* file within the 'target' directory.

Run
-------

To run the application, make sure you have the Stackato client installed and that you are logged in successfully for your desired target environment (e.g. http://api.stackato.local).

Then execute:

	stackato push -n 


Finally visit the resulting URL (as output from the above command) in a browser.
