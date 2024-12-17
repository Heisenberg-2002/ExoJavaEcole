package pizzaFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ingredient mozzarella = new Ingredient("Mozzarella", 2.5, 200, "Italy");
        Ingredient tomatoSauce = new Ingredient("Tomato Sauce", 1.0, 50, null);

        List<Ingredient> cheeses = Arrays.asList(mozzarella);
        List<Ingredient> proteins = new ArrayList<>();
        List<Ingredient> seasonings = Arrays.asList(tomatoSauce);
        Pizza pizza = new Pizza("fine", "tomate", cheeses, proteins, seasonings);

        PizzaOven oven = new ElectricOven();
        oven.enqueuePizza(pizza);

        try {
            Thread.sleep(3000); // 3 secondes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Pizza ready to dequeue? " + oven.checkCookTime(pizza));

    }
}