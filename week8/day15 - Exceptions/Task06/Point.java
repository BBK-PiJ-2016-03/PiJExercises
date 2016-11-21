public class Point{
    private int position;

    public Point(int position) {
        if(position < 0)
            throw new NegativePointException("Position of point cannot be negative: "+position);
        this.position = position;
    }

    public int getPosition(){
        return this.position;
    }
}