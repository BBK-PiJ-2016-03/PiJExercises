/*6  Inside or outside
Write a program that reads the coordinates of the two points defining a rectangle and then the coordinates of a
third point. The program must then determine whether the point falls inside or outside the rectangle.*/

List<String> messages = Arrays.asList("Enter top left point", "Enter top right point", "Enter location point");

List<Point> points = readPoints(3, messages)

Rectangle rectangle = new Rectangle()

rectangle.upLeft = points[0]
rectangle.downRight = points[1]

println ""
println "The point is " + (pointIsInsideRectangle(rectangle, points[2]) ? "inside" : "outside") + " the rectangle"


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