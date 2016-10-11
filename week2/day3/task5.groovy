/*5  Rectangle
Write a program that reads the X and Y coordinates of two points an
d then outputs the area of a rectangle where
both points are opposite corners. Use the following class to store t
he data for the points:
class Rectangle {
Point upLeft;
Point downRight;
}
Your program should calculate (and write on the screen) the perime
ter and area of the rectangle.
Note: For exercises 5, 6, and 7 you must access (i.e. read or write)
the value of the coordinates of the points
through the rectangle, not directly through the point, i.e.
myRectangle.upLeft.x , not point.x or x. */

List<Point> points = readPoints(2)

def readPoints(int numberofPoints){
    List<Point> points = new ArrayList<>()

    for(int i = 1; i <= numberofPoints; i++){
        println "Entering Point " + i
        print "Enter point x value: "
        String xVal = System.console().readLine()
        print "Enter point y value: "
        String yVal = System.console().readLine()
        try{
            double xPos = Double.parseDouble(xVal)
            double yPos = Double.parseDouble(yVal)
            points.add(new Point(xPos, yPos))
        }
        catch(NumberFormatException e){
            println "At least one value was not a valid number. Please enter this point again."
            i--
        }
    }

    return points
}


class Rectangle {
    Point upLeft;
    Point downRight;
}