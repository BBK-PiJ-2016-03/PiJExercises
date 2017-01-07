public class GCD{

    public static void main(String[] args){
        GCD gcd = new GCD();
        
        System.out.println(String.format("6,3: %d", gcd.getGCD(6, 3)));
        System.out.println(String.format("3,6: %d", gcd.getGCD(3, 6)));
        System.out.println(String.format("9,12: %d", gcd.getGCD(9, 12)));
        System.out.println(String.format("9,12: %d", gcd.getGCD(10, 5)));
        System.out.println(String.format("550,79: %d", gcd.getGCD(550, 79)));
        
    }

    private int getGCD(int p, int q){
        //if p > q, then gcd(p, q) = gcd(q, p mod q)
        if (p < q)
            return getGCD(q, p);

        if(q == 0)
            return p;

        return getGCD(q, p % q);        
    }
}