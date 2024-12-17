package pizzaFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class PizzaOven {
        protected int maxPizzas;
        protected double temperature;
        protected List<Pizza> pizzas = new ArrayList<>();
        protected Map<Pizza, Long> cookingTimes = new HashMap<>();

        public PizzaOven(int maxPizzas, double temperature) {
            this.maxPizzas = maxPizzas;
            this.temperature = temperature;
        }

        public boolean canEnqueue() {
            return pizzas.size() < maxPizzas;
        }

        public boolean enqueuePizza(Pizza pizza) {
            if (canEnqueue()) {
                pizzas.add(pizza);
                cookingTimes.put(pizza, System.currentTimeMillis());
                return true;
            }
            return false;
        }

        public void dequeuePizza(Pizza pizza) {
            pizzas.remove(pizza);
            cookingTimes.remove(pizza);
        }

        public boolean checkCookTime(Pizza pizza) {
            if (pizzas.contains(pizza)) {
                long elapsedTime = System.currentTimeMillis() - cookingTimes.get(pizza);
                double recommendedTime = pizza.getRecommendedCookTime() * (400.0 / temperature) * 90;
                return elapsedTime >= recommendedTime;
            }
            return false;
        }
    }

    // Specific Oven Implementations
    class WoodFiredOven extends PizzaOven {
        public WoodFiredOven() {
            super(1, 500);
        }
    }

    class ElectricOven extends PizzaOven {
        public ElectricOven() {
            super(5, 450);
        }
    }
