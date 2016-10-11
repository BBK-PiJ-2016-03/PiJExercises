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

Rectangle rectangle = new Rectangle()
rectangle.upLeft = points[0]
rectangle.downRight = points[1]

double[] widthNumbers = new double[2]
numbers[0] = rectangle.downRight.x
numbers[1] = rectangle.upLeft.x

double[] heightNumbers = new double[2]
numbers[0] = rectangle.upLeft.y
numbers[1] = rectangle.downRight.y

double width = calculate(widthNumbers, "-")
double height = calculate(heightNumbers, "-")

double[] areaNumbers = new double[2]
numbers[0] = width
numbers[1] = height

double[] perimeterNumbers = new double[4]
numbers[0] = width
numbers[1] = width
numbers[2] = height
numbers[3] = height

area = calculate(areaNumbers, "*")
perimeter = calculate(perimeterNumbers, "+")

prinln "The area of the rectangle is: " + area " units ^2"
prinln "The perimeter of the rectangle is: " + area " units"

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


def calculate(numbers, operator){

    Double precision = 1E14

    if(numbers.size() < 1)
        return null

    double result = numbers[0]

    for(int i = 1; i < numbers.size(); i++) {
        switch(operator){
            case "+":
                result += numbers[i]
                break

            case "-":
                result -= numbers[i]
                break

            case "/":
                result /= numbers[i]
                break

            case "*":
                result *= numbers[i]
                break
        }
    }

    return Math.round(result * precision) / precision
}