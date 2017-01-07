/*b) McCarthy’s 91 function
Calculate the result of calling this method with arguments 50, 73, and 95. Note that the recursion on line 5 is
double.
int mcCarthy91(int n) {
if (n > 100) {
return n - 10;
} else {
return mcCarthy91(mcCarthy91(n+11));
}
}
(Hint: If you get too confused, maybe writing a slightly modified version of this code that prints the numbers
on screen can help).*/
/*
//50    
    -> 61   
        ->  72  
            ->  83  
                ->  94  
                    ->  105                    
                    -> 95
                        -> 106
                    -> 96
                        -> 107
                    -> 97
                        -> 108
                    -> 98
                        -> 109
                    ->  99
                        ->  110
                    -> 100
                        -> 111
                    -> 101
                -> 91
                    -> 102
                -> 92
                    -> 103
                -> 93
                    -> 104
                -> 94
                    -> 105
                -> 95
                    -> 106
                -> 96
                    -> 107
                -> 97
                    -> 108
                -> 98
                    -> 109
                ->  99
                    ->  110
                -> 100
                    -> 111
                -> 101
            -> 91
*/
//always returns 91

//73

//95

public class McCarthy91{

    public static void main(String[] args){
        McCarthy91 mc = new McCarthy91();

        System.out.println("50");
        System.out.println(mc.mcCarthy91(50));

        System.out.println("73");
        System.out.println(mc.mcCarthy91(73));

        System.out.println("95");
        System.out.println(mc.mcCarthy91(95));
    }

    private int mcCarthy91(int n) {
        if (n > 100) {
            return n - 10;
        } else {
            return mcCarthy91(mcCarthy91(n+11));
        }
    }

}