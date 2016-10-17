public class Calculator{

    public int add(int a, int b){
        return a + a;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public double divide(int a, int b){
        double result = (double)a / b;
        return Math.round((result *1E14))/1E14;
    }

    public int modulus(int a, int b){
        return a % b;
    }

}