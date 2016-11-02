public class Power{
    public static void main(String[] args){
        Power pow = new Power();
        for(int i = 0; i < 8; i++)
            System.out.println(String.format("%d: %d", i, pow(i, 2)));
        }
        
    }

    private int power(int base, int exponent){
        if(exponent == 1)
            return base;
        
        return base * power(base, exponent -1);
    }
}