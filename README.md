## JavaDist - Distance calculating library

### A library to find distance between two points based on cartesian system.

## How to use
### Installation of Dependencies:
* JavaDist requires [Java](https://www.java.com/en/download/) to run.
* JavaDist required [Maven](https://maven.apache.org/download.cgi) for testing.

After installing the dependencies follow the steps below to execute the code.

### Running the code.
* ```git clone this repository```
* ```mvn install``` to install all the dependencies (one time step)
* ```mvn clean compile``` to compile the classes (after making changes).
* ```mvn test``` runs all the tests.

### Using JavaDist.
```com.example.CheckLength;```
* To calculate the distance between the two co-ordinates: ```object.findLength(x1, y1, x2, y2, precision)```
* Here(x1,y1) are the co-ordinates of one point and (x2, y2) are the co-ordinates of the other point. String values are expected and hence very large values can be taken as input.
* precision is an integral value and shows the precision expected.
* function reeturns a String value.

## Examples

Given an example to use the library
```
package com.example.CheckLength;
public class App {
    public static void main(String[] args) {
        CheckLength obj = new CheckLength();
        String x1 = "0";
        String y1 = "9";
        String x2 = "0";
        String y2 = "14";
        int precision = 7;
        System.out.println(obj.findLength(x1, y1, x2, y2, precision));
    }
}
```
## Testing guide
* Script for testing is in the directory named ```src/test/java/com/example```, edit or add any file there.
* Run this script to test: ```mvn test```.

## Contributors
* Aditya Singh Sisodiya



