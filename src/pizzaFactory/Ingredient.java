package pizzaFactory;

class Ingredient {
    private  String name;
    private  double priceHT;
    private int calories;
    private String aoc;

    public Ingredient(String name, double priceHT, int calories, String aoc) {
        this.name = name;
        this.priceHT = priceHT;
        this.calories = calories;
        this.aoc = aoc;
    }

    public String getName() {
        return name;
    }

    public double getPriceHT() {
        return priceHT;
    }

    public int getCalories() {
        return calories;
    }

    public String getAoc() {
        return aoc;
    }
}
