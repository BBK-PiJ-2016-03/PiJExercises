// 5 More on points

class Point{

    private double x, y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    //distanceTo(Point): calculates the distance to another point.
    public double distanceTo(Point otherPoint){
        double xDiff = this.x - otherPoint.x;
        double yDiff = this.y - otherPoint.y;

        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }

    //distanceToOrigin(): calculates the distance to the origin. Implement it by calling the first method.
    public double distanceToOrigin(){
        return distanceTo(new Point(0,0));
    }

    //moveTo(double x, double y): changes the coordinates of this point to be the given parameters x and y.
    public double moveTo(double x, double y){
        this.x = x;
        this.y = y;
    }

    //moveTo(Point): changes the coordinates of this point to move where the given point is.
    public double moveTo(Point destination){
        this.x = destination.x;
        this.y = destination.y;
    }

    //clone(): returns a copy of the current point with the same coordinates.
    public Point clone(){
        Point clone = new Point(this.x, this.y);
        return clone;
    }

    //opposite(): returns a copy of the current point with the coordinates multiplied by −1
    public Point opposite(){
        Point clone = new Point(-this.x, -this.y);
        return clone;
    }

}


Point point1 = new Point(5,5);
Point point2 = new Point(5,10);

println("Distance: " + point1.distanceTo(point2));
println("distanceToOrigin: " + point1.distanceToOrigin());
Point point3 = point1.clone()
println("Clone: (" + point3.getX() + ", " + point3.getY() + ")");

Point point4 = point1.opposite()
println("Opposite Clone: (" + point4.getX() + ", " + point4.getY() + ")");

point1.moveTo(point2)
println("Move to point2: (" + point1.getX() + ", " + point1.getY() + ")");

point1.moveTo(20,20)
println("Move to 20,20: (" + point1.getX() + ", " + point1.getY() + ")");

println("Distance: " + point1.distanceTo(point2));


