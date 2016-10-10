// 4 Distance point–to–point
List<Point> points = new ArrayList<>()

for(int i = 1; i <= 3; i++){
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

print "Out of the points "
for(Point point : points){
    printPoint(point)
}

double distance0to1 = getDistance(points[0], points[1])
double distance0to2 = getDistance(points[0], points[2])
double distance1to2 = getDistance(points[1], points[2])

if(distance0to1 < distance0to2 && distance0to1 < distance1to2){
    println "The closest points are : " + printPoint(points[0]) + " and " + printPoint(points[1])
}
else if(distance0to1 < distance0to2 && distance0to1 > distance1to2){
    println "The closest points are : " + printPoint(points[1]) + " and " + printPoint(points[2])
}
else{
    println "The closest points are : " + printPoint(points[0]) + " and " + printPoint(points[2])
}

class Point {
    double x;
    double y;

    Point(double x, double y){
        this.x = x
        this.y = y
    }
}

def printPoint(Point point){
    print "(" + point.x + ", " + point.y + ") "
}

def getDistance(Point point1, Point point2){
    double xDiff = point1.x - point2.x
    double yDiff = point1.y - point2.y

    return Math.sqrt(Math.Math.pow(xdiff, 2) + Math.pow(ydiff, 2))
}