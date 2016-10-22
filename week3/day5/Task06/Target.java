public class Target{

    private int[][][] space;

    public Target(int size){
        this.space = new int[size][size][size];

        init();
    }

    private void init(int size){
        Coordinate3D target = getRandomTargetCoordinate(size);
        this.space[target.getX()][target.getY()][target.getZ()] = 1;
    }

    private Coordinate3D getRandomTargetCoordinate(size){
        return new Coordinate3D(getRandom(size), getRandom(size), getRandom(size));
    }

    private int getRandom(int max){
        return (int) Math.abs(max * Math.random());
    }

    public Result fire(int shotX, int shotY, int shotZ){

    }

    public Result fire(Coordinate3D shot){
        return fire(shot.getX(), shot.getY(), shot.getZ());
    }
}