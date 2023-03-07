Three ways we can set the driver executables
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
1. Have written test to demonstrate how the WebDriver manager works using the respective dependency