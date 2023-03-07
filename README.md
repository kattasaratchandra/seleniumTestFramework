1. Three ways we can set the driver executables
    1.using setProperty method:
      a. download necessary drivers for all the browsers you want run the tests
      b. set the path of the drivers using setProperty method for browsers accordingly
      c. the disadvantage is we have to hard code driver path and have to download the driver's
    2.using environment variables
      a. add the downloaded driver's path to the environment variable path.
      b. this is generic anyone can run tests in their local machines but still they must add the driver's path
        to there environmental variable path
    3. using driver manager dependency
      a. download driver manager dependency from maven repository
      b. use appropriate driver manager abstract class methods according to the browsers this returns the 
        respective driver instance
2. Have written test to demonstrate how the WebDriver manager works using the respective dependency. some issue
with webdriver manager so degraded the version to 3.6.0 and its working finr

Tests
1. written two naive tests, will optimise the tests step by step using pom, waits, data objects and other best
practices. such that this will convert the naive tests to framework driven, scalable, readable and maintenance 
less tests.