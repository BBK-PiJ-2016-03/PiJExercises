import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


public class Main{
    public static void main(String[] args) {
        List<Apple> apples = populateApples();
        //apples = filterApples(apples, (Apple a) -> a.getColour().equals(Colour.Pink));
        //Predicate<Apple> getLightRedApples = (Apple a) -> a.getWeight()<3 && a.getColour().equals(Colour.Red);
        //apples = filterApples(apples, getLightRedApples);

        apples = apples.stream()
                       .filter(a -> a.getColour().equals(Colour.Pink))
                       .filter(a -> a.getWeight() > 3)
                       .collect(Collectors.toList());


        System.out.println(apples);
    }


    private boolean isGreen(Apple apple){
        return apple.getColour().equals(Colour.Green);
    }

    private static List<Apple> populateApples(){
        List<Apple> apples = Arrays.asList(
            new Apple(5, Colour.Green),
            new Apple(2, Colour.Red),
            new Apple(35, Colour.Pink),
            new Apple(7, Colour.Red),
            new Apple(1, Colour.Brown),
            new Apple(2, Colour.Pink),
            new Apple(1, Colour.Green),
            new Apple(1, Colour.Red),
            new Apple(6, Colour.Green),
            new Apple(8, Colour.Red),
            new Apple(4, Colour.Brown)            
            );
        return apples;
    }

    private static void printGreenApples(List<Apple> apples){
        for (Apple apple : apples) {
            if (apple.getColour() == Colour.Green) 
                System.out.println(apple);
        }
    }

    private static List<Apple> filterApples(List<Apple> apples, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple: apples) {
            if (p.test(apple))
                result.add(apple);
        }
        return result;
    }

    private static List<Apple> filterApplesByColour(List<Apple> apples, Colour colour){
        List<Apple> filtered = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getColour().equals(colour)) 
                filtered.add(apple);
        }
        return filtered;
    }
    
}

class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    } 


}

class AppleColourPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return Colour.Green.equals(apple.getColour());
    } 

}