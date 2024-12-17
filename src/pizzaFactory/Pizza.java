package pizzaFactory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Pizza {
    private static final Set<String> BASES = new HashSet<>(Arrays.asList("crème", "tomate"));

    private String dough;
    private String base;
    private List<Ingredient> cheeses;
    private List<Ingredient> proteins;
    private List<Ingredient> seasonings;
    private double costFixed = 5.0;
    private double price;
    private int calories;
    private int recommendedCookTime = 90;

    public Pizza(String dough, String base, List<Ingredient> cheeses, List<Ingredient> proteins, List<Ingredient> seasonings) {
        if (!dough.equals("fine") && !dough.equals("epaisse")) {
            throw new IllegalArgumentException("Invalid dough type");
        }
        if (!BASES.contains(base)) {
            throw new IllegalArgumentException("Invalid base type");
        }
        if (cheeses.size() > 5 || proteins.size() > 5 || seasonings.size() > 5) {
            throw new IllegalArgumentException("Too many ingredients");
        }
        if (cheeses.size() >= 4 && !base.equals("crème")) {
            throw new IllegalArgumentException("If cheeses >= 4, base must be crème");
        }

        this.dough = dough;
        this.base = base;
        this.cheeses = cheeses;
        this.proteins = proteins;
        this.seasonings = seasonings;

        calculatePriceAndCalories();
    }

    private void calculatePriceAndCalories() {
        this.price = costFixed;
        this.calories = 0;

        for (Ingredient ingredient : cheeses) {
            this.price += ingredient.getPriceHT();
            this.calories += ingredient.getCalories();
        }
        for (Ingredient ingredient : proteins) {
            this.price += ingredient.getPriceHT();
            this.calories += ingredient.getCalories();
        }
        for (Ingredient ingredient : seasonings) {
            this.price += ingredient.getPriceHT();
            this.calories += ingredient.getCalories();
        }
    }

    public double getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    public int getRecommendedCookTime() {
        return recommendedCookTime;
    }
}
