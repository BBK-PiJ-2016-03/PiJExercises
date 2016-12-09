/**
 * Created by Alexander Worton on 09/12/2016.
 */
public class CountDishes {

    public static void main(String[] args) {
        CountDishes self = new CountDishes();
        self.count();
    }

    private void count() {
        int numDishes = Dish.menu.stream()
                .map(d -> 1)
                .reduce((a, b) -> a+b)
                .get();

        System.out.println(String.format("Num Dishes: %d", numDishes));
    }
}
