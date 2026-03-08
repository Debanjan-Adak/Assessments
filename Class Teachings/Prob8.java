/*
=====================================================
          Java: Shape Inheritance
=====================================================

Calculate the area and perimeter of different geometric shapes such as rectangles,
circles, and squares using specific mathematical formulas.

Create the following three classes:

1. Rectangle Class: This class implements the Shape interface and contains two
   float variables: length and width. It should have the following methods:
   - Rectangle(float new_length, float new_width): Initializes the variables
     length and width with the given values.
   - float getArea(): Returns the area of the rectangle (length * width) and
     prints "Finding area of rectangle with length = {length} and width = {width}".
   - float getPerimeter(): Returns the perimeter of the rectangle (2 * (length + width))
     and prints "Finding perimeter of rectangle with length = {length} and width = {width}".
   - String toString(): Returns a string in the format "Rectangle = [length: {length},
     width: {width}, area: {area}, perimeter: {perimeter}]", with appropriate values substituted.

2. Square Class: This class inherits from the Rectangle class and has the following methods:
   - Square(float side): Sets the length and width of the Rectangle class to side.
   - float getArea(): Returns the area of the square (length * width) and prints
     "Finding area of square with side = {length}".
   - float getPerimeter(): Returns the perimeter of the square (4 * length) and
     prints "Finding perimeter of square with side = {length}".
   - String toString(): Returns a string in the format "Square = [side: {length},
     area: {area}, perimeter: {perimeter}]", with appropriate values substituted.

3. Circle Class: This class implements the Shape interface and contains a float
   variable radius. It should have the following methods:
   - Circle(float new_radius): Initializes the variable radius with the given value.
   - float getArea(): Returns the area of the circle (3.14 * radius * radius) and
     prints "Finding area of circle with radius = {radius}".
   - float getPerimeter(): Returns the perimeter of the circle (6.28 * radius) and
     prints "Finding perimeter of circle with radius = {radius}".
   - String toString(): Returns a string in the format "Circle = [radius: {radius},
     area: {area}, perimeter: {perimeter}]", with appropriate values substituted.

Constraints:
- 1 < length, width, side, radius < 10^2

Input Format For Custom Testing
Sample Case 0
Sample Input 0
2 3
2
2

Sample Output 0
==========================
Finding area and perimeter of shapes
==========================
Finding area of rectangle with length = 2.0 and width = 3.0
Finding perimeter of rectangle with length = 2.0 and width = 3.0
Area = 6.0 and Perimeter = 10.0

Finding area of square with side = 2.0
Finding perimeter of square with side = 2.0
Area = 4.0 and Perimeter = 8.0

Finding area of circle with radius = 2.0
Finding perimeter of circle with radius = 2.0
Area = 12.56 and Perimeter = 12.56

==========================
Printing shapes as string
==========================
Rectangle = [length: 2.0, width: 3.0, area: 6.0, perimeter: 10.0]
Square = [side: 2.0, area: 4.0, perimeter: 8.0]
Circle = [radius: 2.0, area: 12.56, perimeter: 12.56]
=====================================================
*/
import java.util.*;

// --------- LOCKED / GIVEN CODE (DO NOT MODIFY) ---------

interface Shape {
    float getArea();
    float getPerimeter();
    String toString();
}

// --------- YOUR TASK STARTS HERE ---------

class Rectangle implements Shape {
    // Declare variables
    

    public Rectangle(float new_length, float new_width) {
        // YOUR CODE GOES HERE
        
    }

    public float getArea() {
        // YOUR CODE GOES HERE
        return 0.0f;
    }

    public float getPerimeter() {
        // YOUR CODE GOES HERE
        return 0.0f;
    }

    public String toString() {
        // YOUR CODE GOES HERE
        return "";
    }
}

class Square extends Rectangle {

    public Square(float side) {
        // YOUR CODE GOES HERE
        // Hint: Call super()
        super(0, 0); 
    }

    @Override
    public float getArea() {
        // YOUR CODE GOES HERE
        return 0.0f;
    }

    @Override
    public float getPerimeter() {
        // YOUR CODE GOES HERE
        return 0.0f;
    }

    @Override
    public String toString() {
        // YOUR CODE GOES HERE
        return "";
    }
}

class Circle implements Shape {
    // Declare variables
    

    public Circle(float new_radius) {
        // YOUR CODE GOES HERE
        
    }

    public float getArea() {
        // YOUR CODE GOES HERE
        return 0.0f;
    }

    public float getPerimeter() {
        // YOUR CODE GOES HERE
        return 0.0f;
    }

    public String toString() {
        // YOUR CODE GOES HERE
        return "";
    }
}

// --------- MAIN CLASS (ALREADY IMPLEMENTED) ---------

public class Prob8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Read Inputs
        float rectLength = sc.nextFloat();
        float rectWidth = sc.nextFloat();
        float sqSide = sc.nextFloat();
        float circRadius = sc.nextFloat();
        
        // 2. Initialize Objects
        Rectangle r = new Rectangle(rectLength, rectWidth);
        Square s = new Square(sqSide);
        Circle c = new Circle(circRadius);
        
        // 3. Print Area and Perimeter Section
        System.out.println("==========================");
        System.out.println("Finding area and perimeter of shapes");
        System.out.println("==========================");
        
        // Rectangle Operations
        float ra = r.getArea();
        float rp = r.getPerimeter();
        System.out.println("Area = " + ra + " and Perimeter = " + rp);
        System.out.println(); // Blank line per sample output
        
        // Square Operations
        float sa = s.getArea();
        float sp = s.getPerimeter();
        System.out.println("Area = " + sa + " and Perimeter = " + sp);
        System.out.println(); // Blank line
        
        // Circle Operations
        float ca = c.getArea();
        float cp = c.getPerimeter();
        System.out.println("Area = " + ca + " and Perimeter = " + cp);
        System.out.println(); // Blank line
        
        // 4. Print String Representation Section
        System.out.println("==========================");
        System.out.println("Printing shapes as string");
        System.out.println("==========================");
        
        System.out.println(r.toString());
        System.out.println(s.toString());
        System.out.println(c.toString());
        
        sc.close();
    }
}