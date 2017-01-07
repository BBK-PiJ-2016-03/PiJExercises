import java.util.*;

public class Hailstone{

    private List<Integer> hailInts = new ArrayList<>();

    public static void main(String[] args){
        Hailstone hail = new Hailstone();
        int hailNum = 12;
        if(args.length > 0)
            hailNum = hail.getHailNum(args[0]);

        hail.getHailStone(hailNum);

        for(int num : hail.hailInts){
            System.out.print(num + " ");
        }
    }

     private int getHailNum(String arg){
        int num = 12;
        try{
            num = Integer.parseInt(arg);
        }
        catch(Exception e){
            num = 12;
        }
        return num;
    }

    private void getHailStone(int n){     
        hailInts.add(n);
        if(n == 1)
            return;

        //If the number n is even, the next number is n/2
        if(n % 2 == 0){
            getHailStone(n / 2);
            return;
        }
        //If the number is odd, the next number is 3n + 1
        getHailStone(3*n + 1);
    }

}