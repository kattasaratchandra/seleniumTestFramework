1. Three ways we can set the driver executables 
   1. using setProperty method:
      1. download necessary drivers for all the browsers you want run the tests
      2. set the path of the drivers using setProperty method for browsers accordingly
      3. the disadvantage is we have to hard code driver path and have to download the driver's 
   2. using environment variables 
      1. add the downloaded driver's path to the environment variable path.
      2. this is generic anyone can run tests in their local machines but still they must add the driver's path
         to their environmental variable path
   3. using driver manager dependency 
      1. download driver manager dependency from maven repository
      2. use appropriate driver manager abstract class methods according to the browsers this returns the 
      respective driver instance
2. Have written test to demonstrate how the WebDriver manager works using the respective dependency. some issue
with web-driver manager so degraded the version to 3.6.0 and its working fine

Tests
1. written two naive tests, will optimise the tests step by step using pom, waits, data objects and other best
practices. such that this will convert the naive tests to framework driven, scalable, readable and maintenance 
less tests.

Page Object Model:
BaseTest:
1. Base test contains before and after methods test annotations we use before method
to initialise the driver and after method to quit the driver. 
2. It's recommended to create driver instance before every test/method and quit after the 
test/method
3. we inherit Base Test to all the test classes.
4. It also contains all the common methods of the tests.

DriverManager Class:
1. we maintain the separate factory package and create driver manager class. 
2. It has driver Initialization method This method criteria is to create the driver and 
return the driver

BasePage:
1. It contains all the common methods of the page objects.
2. All page objects inherit the base page

PageObjects:
1. page objects contains private final element definitions, public element actions.
2. Have implemented fluent interface, builder pattern in page objects.
3. Have created structural as well as functional page object used accordingly