public class Target{

    private int[][][] space;
    private Coordinate3D target;
    private int size;

    public Target(int size){
        this.size = size;
        this.space = new int[size][size][size];

        init();
    }

    private void init(){
        this.target = getRandomTargetCoordinate(this.size);
        //System.out.println("Target: "+this.target);
        this.space[this.target.getX()][this.target.getY()][this.target.getZ()] = 1;
    }

    private Coordinate3D getRandomTargetCoordinate(int size){
        return new Coordinate3D(getRandom(size), getRandom(size), getRandom(size));
    }

    private int getRandom(int max){
        return (int) Math.abs(max * Math.random());
    }

    private Result checkAccuracy(int shot, int targetValue, String axis){
        if(shot < targetValue){
            if(shot < 0)
                return Result.OUT_OF_RANGE;
            return getLower(axis);
        }
        else if(shot > targetValue){
            if(shot > this.size)
                return Result.OUT_OF_RANGE;
            return getHigher(axis);
        }
        return Result.HIT;
    }

    private Result getLower(String axis){
        switch(axis){
            case "x":
                return Result.FAIL_LEFT;

            case "y":
                return Result.FAIL_LOW;

            default:
                return Result.FAIL_SHORT;
        }
    }

    private Result getHigher(String axis){
        switch(axis){
            case "x":
                return Result.FAIL_RIGHT;

            case "y":
                return Result.FAIL_HIGH;

            default:
                return Result.FAIL_LONG;
        }
    }

    public Result fire(int shotX, int shotY, int shotZ){        

        Result horizontal = checkAccuracy(shotX, this.target.getX(), "x");
        Result vertical = checkAccuracy(shotY, this.target.getY(), "y");
        Result depth = checkAccuracy(shotZ, this.target.getZ(), "z");

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

        return Result.HIT;
    }

    public Result fire(Coordinate3D shot){
        return fire(shot.getX(), shot.getY(), shot.getZ());
    }


}