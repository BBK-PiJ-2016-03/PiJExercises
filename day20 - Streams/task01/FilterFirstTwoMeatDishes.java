import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Alexander Worton on 09/12/2016.
 */
public class FilterFirstTwoMeatDishes {

    public static void main(String[] args) {
        FilterFirstTwoMeatDishes self = new FilterFirstTwoMeatDishes();
        self.filter();
    }

    private void filter() {
        List<Dish> dishes = Dish.menu.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT)
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(dishes);
    }
}
