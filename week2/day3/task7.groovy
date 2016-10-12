/*7  Overlaps
Write a program that reads the coordinates of four points, the former two defining one rectangle and the latter two
defining another one. The program must read the coordinates of a fifth point and say whether the point is inside
both rectangles, inside one of them only, or out of both. */

List<String> messages = Arrays.asList("Enter first rectangle top left point", "Enter first rectangle top right point", "Enter second rectangle top left point", "Enter second rectangle top right point","Enter location point");

List<Point> points = readPoints(5, messages)

Rectangle rectangle1 = new Rectangle()
rectangle1.upLeft = points[0]
rectangle1.downRight = points[1]

Rectangle rectangle2 = new Rectangle()
rectangle2.upLeft = points[2]
rectangle2.downRight = points[3]

boolean insideRectangle1 = pointIsInsideRectangle(rectangle1, points[4])
boolean insideRectangle2 = pointIsInsideRectangle(rectangle2, points[4])

println ""

if(insideRectangle1 && insideRectangle2){
    println "The point is inside both rectangles"
}
else if(insideRectangle1){
    println "The point is inside the first rectangle only"
}
else if(insideRectangle2){
    println "The point is inside the second rectangle only"
}
else{
    println "The point is outside both rectangles"
}


def boolean pointIsInsideRectangle(Rectangle rectangle, Point point){

    if(     point.x >= rectangle.upLeft.x
        &&  point.x <= rectangle.downRight.x
        &&  point.y <= rectangle.upLeft.y
        &&  point.y >= rectangle.downRight.y
    ){
        return true
    }

    return false
}

class Point {
    double x;
    double y;

    Point(double x, double y){
        this.x = x
        this.y = y
    }
}

class Rectangle {
    Point upLeft;
    Point downRight;
}

def readPoints(int numberofPoints, List<String> messages){
    List<Point> points = new ArrayList<>()

    for(int i = 0; i < numberofPoints; i++){
        println ""
        println (messages.size() > i ? messages[i] : ("Entering Point " + (i+1)))
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