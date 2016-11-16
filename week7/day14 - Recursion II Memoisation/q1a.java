/*
a)
Do you see anything wrong with the following code? How would you fix it?
String doggyMethod(int n) {
    String result = doggyMethod(n-3) + n + doggyMethod(n-2);
    if (n <= 0) {
        return "";
    }
    return result;
}
*/

public class q1a{
    String doggyMethod(int n) {
        String result = doggyMethod(n-3) + n + doggyMethod(n-2);
        if (n <= 0) {
            return "";
        }
        return result;
    }
}

