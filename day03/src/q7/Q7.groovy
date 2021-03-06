package q7

class Point {
    double x;
    double y;
}


class Rectangle {
    q4.Point upLeft;
    q4.Point downRight;
}


String strX, strY;

// make Up Left Corner
q4.Point upLeftCorner = new q4.Point();
System.out.print("Up Left X: ");
strX = System.console().readLine();
upLeftCorner.x = Double.parseDouble(strX);
System.out.print("Up Left Y: ");
strY = System.console().readLine();
upLeftCorner.y = Double.parseDouble(strY);

// make Down Right Corner
q4.Point downRightCorner = new q4.Point();
System.out.print("Down RightX: ");
strX = System.console().readLine();
downRightCorner.x = Double.parseDouble(strX);
System.out.print("Down Right Y: ");
strY = System.console().readLine();
downRightCorner.y = Double.parseDouble(strY);

// make first rectangle
q5.Rectangle myFirstRectangle = new q5.Rectangle();
myFirstRectangle.upLeft = upLeftCorner;
myFirstRectangle.downRight = downRightCorner;

// make Up Left Corner TWO
q4.Point upLeftCornerTwo = new q4.Point();
System.out.print("Up Left X: ");
strX = System.console().readLine();
upLeftCornerTwo.x = Double.parseDouble(strX);
System.out.print("Up Left Y: ");
strY = System.console().readLine();
upLeftCornerTwo.y = Double.parseDouble(strY);

// make Down Right Corner TWO
q4.Point downRightCornerTwo = new q4.Point();
System.out.print("Down RightX: ");
strX = System.console().readLine();
downRightCornerTwo.x = Double.parseDouble(strX);
System.out.print("Down Right Y: ");
strY = System.console().readLine();
downRightCornerTwo.y = Double.parseDouble(strY);

// make second rectangle
q5.Rectangle mySecondRectangle = new q5.Rectangle();
mySecondRectangle.upLeft = upLeftCornerTwo;
mySecondRectangle.downRight = downRightCornerTwo;

// make testPoint
q4.Point testPoint = new q4.Point();
System.out.print("test point X: ");
strX = System.console().readLine();
testPoint.x = Double.parseDouble(strX);
System.out.print("test point Y: ");
strY = System.console().readLine();
testPoint.y = Double.parseDouble(strY);

boolean insideFirst = false;
boolean insideSecond = false;

// see if testpoint inside first rectangle
boolean insideHorizontal = false;
boolean insideVertical = false;

if (testPoint.x > myFirstRectangle.upLeft.x && testPoint.x < myFirstRectangle.downRight.x) {
    insideHorizontal = true;
}
if (testPoint.y < myFirstRectangle.upLeft.y && testPoint.y > myFirstRectangle.downRight.y) {
    insideVertical = true;
}

if (insideHorizontal && insideVertical) {
    insideFirst = true;
}

// see if testpoint inside second rectangle
insideHorizontal = false;
insideVertical = false;

if (testPoint.x > mySecondRectangle.upLeft.x && testPoint.x < mySecondRectangle.downRight.x) {
    insideHorizontal = true;
}
if (testPoint.y < mySecondRectangle.upLeft.y && testPoint.y > mySecondRectangle.downRight.y) {
    insideVertical = true;
}
if (insideHorizontal && insideVertical) {
    insideSecond = true;
}

// output

if (insideFirst && insideSecond) {
    System.out.println("inside both");
} else {
    if (insideFirst || insideSecond) {
        System.out.println("inside one");
    }
}
if (!insideFirst && !insideSecond) {
    System.out.println("outside both");
}







