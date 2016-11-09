public class Target{

    private int[][][] space;
    private Coordinate3D target;
    private int size;

    public Target(int size){
        this.size = size;
        this.space = new int[size][size][size];

        init();
    }

    private void init(int size){
        this.target = getRandomTargetCoordinate(size);
        this.space[this.target.getX()][this.target.getY()][this.target.getZ()] = 1;
    }

    private Coordinate3D getRandomTargetCoordinate(size){
        return new Coordinate3D(getRandom(size), getRandom(size), getRandom(size));
    }

    private int getRandom(int max){
        return (int) Math.abs(max * Math.random());
    }

    private Result checkAccuracy(int shot, int targetValue){
        if(shot < targetValue){
            if(shot < 0)
                return Result.OUT_OF_RANGE;
            return Result.FAIL_LEFT;
        }
        else if(shot > targetValue){
            if(shot > this.size)
                return Result.OUT_OF_RANGE;
            return Result.FAIL_RIGHT;
        }
        return Result.HIT;
    }

    public Result fire(int shotX, int shotY, int shotZ){        

        Result horizontal = checkAccuracy(shotX, this.target.getX());
        Result vertical = checkAccuracy(shotY, this.target.getY());
        Result depth = checkAccuracy(shotZ, this.target.getZ());

        if(    horizontal.equals(Result.HIT) 
            && vertical.equals(Result.HIT) 
            && depth.equals(Result.HIT) ){
                return Result.HIT;
        }

        if(horizontal != Result.HIT)
            return horizontal;

        if(vertical != Result.HIT)
            return vertical;

        if(depth != Result.HIT)
            return depth;
    }

    public Result fire(Coordinate3D shot){
        return fire(shot.getX(), shot.getY(), shot.getZ());
    }


}