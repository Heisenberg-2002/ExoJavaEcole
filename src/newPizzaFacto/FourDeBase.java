package newPizzaFacto;

import newPizzaFacto.Interface.Four;
import newPizzaFacto.Interface.Pizza;

import java.util.ArrayList;
import java.util.List;

public class FourDeBase implements Four {
    private int capaciteMax;
    private double temperature;
    private List<Pizza> pizzas;

    public FourDeBase(int capaciteMax, double temperature) {
        this.capaciteMax = capaciteMax;
        this.temperature = temperature;
        this.pizzas = new ArrayList<>();
    }

    @Override
    public boolean enfourner(Pizza pizza) {
        if (pizzas.size() < capaciteMax) {
            pizzas.add(pizza);
            return true;
        }
        System.out.println("Le four est plein !");
        return false;
    }

    @Override
    public Pizza defourner() {
        if (!pizzas.isEmpty()) {
            return pizzas.remove(0);
        }
        System.out.println("Aucune pizza à défourner !");
        return null;
    }

    @Override
    public boolean estPlein() {
        return pizzas.size() >= capaciteMax;
    }

    @Override
    public List<Pizza> getPizzas() {
        return new ArrayList<>(pizzas);
    }

    @Override
    public double getTemperature() {
        return temperature;
    }
}
