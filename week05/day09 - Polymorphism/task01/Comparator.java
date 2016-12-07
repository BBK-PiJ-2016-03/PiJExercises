public class Comparator {

    public static void main(String[] args){
        Comparator comparator = new Comparator();
        System.out.println("1 and 12, Strings: " + comparator.getMax("1", "12"));
        System.out.println("1 and 8, ints: " + comparator.getMax(1, 8));
        System.out.println("1.0 and 9.5, doubles: " + comparator.getMax(1.0, 9.5));
        System.out.println("105.3 and 9.5, doubles: " + comparator.getMax(105.3, 9.5));
    }

    public int getMax(int n, int m) {
        return (int)getMax((double)n, (double)m);
    }
    public double getMax(double d1, double d2) {
        if (d1 > d2) {
            return d1;
        } 
        else {
            return d2;
        }
    }
    public String getMax(String number1, String number2) {
        int n1 = Integer.parseInt(number1);
        int n2 = Integer.parseInt(number2);

        return String.format("%d", getMax(n1, n2));
    }
}
