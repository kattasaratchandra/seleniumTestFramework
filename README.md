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