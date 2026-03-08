/*
=====================================================
                Java: Mobile Builder
=====================================================

Create a Mobile class based on the Builder Pattern.

-----------------------------------------------------
REQUIREMENTS
-----------------------------------------------------

Create the following classes:

-----------------------------------------------------
Mobile class with the following attributes:
-----------------------------------------------------
- Boolean touchScreenAvailable
- Boolean enabled5G
- Integer ram
- Integer cameraPixel
- String brandName
- String deviceName

-----------------------------------------------------
Mobile should have the following methods:
-----------------------------------------------------
- Mobile(MobileBuilder builder)
  * Store brandName and deviceName from builder
  * Store initial values to other attributes

- Boolean isTouchScreenAvailable()
- Boolean isEnabled5G()
- Integer getRam()
- Integer getCameraPixel()
- String getBrandName()
- String getDeviceName()

- void printDetails()
  Print exactly:
  "Mobile {deviceName} of brand {brandName} with following
   features : touch screen enabled {touchScreenAvailable},
   5G enabled {enabled5G}, ram {ram}, camera pixel {cameraPixel}."

-----------------------------------------------------
Mobile should contain the following static class:
-----------------------------------------------------
public static class MobileBuilder with attributes:
- Boolean touchScreenAvailable
- Boolean enabled5G
- Integer ram
- Integer cameraPixel
- String brandName
- String deviceName

-----------------------------------------------------
MobileBuilder should have the following methods:
-----------------------------------------------------
- MobileBuilder(String brandName, String deviceName)
- MobileBuilder setTouchScreenAvailable(Boolean value)
- MobileBuilder setEnabled5G(Boolean value)
- MobileBuilder setRam(int ram)
- MobileBuilder setCameraPixel(int cameraPixel)
- Mobile build()

-----------------------------------------------------
NOTE
-----------------------------------------------------
- Provided code stub handles input.
- Do NOT modify main().
- Write code ONLY where mentioned.

-----------------------------------------------------
INPUT
-----------------------------------------------------
2
XIOMI Redmi true true 4 12
Samsung Galaxy true false 2 6

-----------------------------------------------------
OUTPUT
-----------------------------------------------------
Mobile XIOMI of brand Redmi with following features :
touch screen enabled true, 5G enabled true, ram 4,
camera pixel 12.
Mobile Samsung of brand Galaxy with following features :
touch screen enabled true, 5G enabled false, ram 2,
camera pixel 6.
=====================================================
*/

import java.util.*;

// --------- YOUR TASK STARTS HERE ---------

class Mobile {

    // YOUR CODE GOES HERE (declare variables)
	Boolean touchScreenAvailable;
	Boolean enabled5G;
	Integer ram;
	Integer cameraPixel;
	String brandName;
	String deviceName;

    Mobile(MobileBuilder builder) {
        // YOUR CODE GOES HERE
    	this.brandName = builder.brandName;
    	this.deviceName = builder.deviceName;
    	this.cameraPixel = builder.cameraPixel;
    	this.enabled5G = builder.enabled5G;
    	this.touchScreenAvailable = builder.touchScreenAvailable;
    	this.ram = builder.ram;
    }

    // YOUR CODE GOES HERE (getter methods)

    void printDetails() {
        // YOUR CODE GOES HERE
    	System.out.println(
    	        "Mobile " + deviceName + " of brand " + brandName + " with following features : "
    	        + "touch screen enabled " + touchScreenAvailable + ", "
    	        + "5G enabled " + enabled5G + ", ram " + ram + ", "
    	        + "camera pixel " + cameraPixel + "."
    	    );
    }

    // --------- STATIC BUILDER CLASS ---------
    public static class MobileBuilder {

        // YOUR CODE GOES HERE (declare variables)
    	Boolean touchScreenAvailable;
    	Boolean enabled5G;
    	Integer ram;
    	Integer cameraPixel;
    	String brandName;
    	String deviceName;

        public MobileBuilder(String brandName, String deviceName) {
            // YOUR CODE GOES HERE
        	this.brandName = brandName;
        	this.deviceName = deviceName;
        }

        public MobileBuilder setTouchScreenAvailable(Boolean value) {
            // YOUR CODE GOES HERE
        	this.touchScreenAvailable = value;
            return this;
        }

        public MobileBuilder setEnabled5G(Boolean value) {
            // YOUR CODE GOES HERE
        	this.enabled5G = value;
            return this;
        }

        public MobileBuilder setRam(int ram) {
            // YOUR CODE GOES HERE
        	this.ram = ram;
            return this;
        }

        public MobileBuilder setCameraPixel(int cameraPixel) {
            // YOUR CODE GOES HERE
        	this.cameraPixel = cameraPixel;
            return this;
        }

        public Mobile build() {
            // YOUR CODE GOES HERE
        	return new Mobile(this);
        }
    }
}

// --------- MAIN CLASS (ALREADY IMPLEMENTED) ---------

public class Prob2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            String brand = sc.next();
            String device = sc.next();
            boolean touch = sc.nextBoolean();
            boolean fiveG = sc.nextBoolean();
            int ram = sc.nextInt();
            int camera = sc.nextInt();

            Mobile mobile = new Mobile.MobileBuilder(brand, device)
                    // chaining methods will be used here by test code (will not shown in test)
            		.setTouchScreenAvailable(touch)
                    .setEnabled5G(fiveG)
                    .setRam(ram)
                    .setCameraPixel(camera)
                    .build();

            mobile.printDetails();
        }
        sc.close();
    }
}