import java.util.List;
import java.util.ArrayList;

public class Line{
    private int start;
    private int end;

    private List<Point> points = new ArrayList<>();

    public Line(int start, int end){
        if(end <= start)
            throw new IllegalArgumentException(String.format("Line end (%d) cannot be less that or equal to start position (%d)", end, start));

        this.start = start;
        this.end = end;
    }

    public void addPoint(Point point) throws PointNotInRangeException{
        int position = point.getPosition();
        if( position < this.start || position > this.end)
            throw new PointNotInRangeException("Point is not within the range of the line");

        points.add(point);
    }
}