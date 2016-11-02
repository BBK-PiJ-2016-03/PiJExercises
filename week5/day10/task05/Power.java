public class Power{

    public static void main(String[] args){
        Power power = new Power();
        for(int i = 0; i < 8; i++){
            System.out.println(String.format("%d: %d", i, power.pow(i, 3)));
        }
        
    }

    private int pow(int base, int exponent){
        if(exponent == 1)
            return base;
        
        return base * pow(base, exponent - 1);
    }
}