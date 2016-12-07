public class Position{
    public double lat;
    public double lon;

    public Position(double x, double y){
        this.lat = x;
        this.lon = y;
    }

    @Override
    public String toString(){
        return "(" + lat + ", " + lon + ")";
    }
}