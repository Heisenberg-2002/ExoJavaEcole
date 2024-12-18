package newPizzaFacto;

import newPizzaFacto.Interface.Composant;

public class ComposantPizza implements Composant {
    private String nom;
    private int calories;
    private double prixHT;

    public ComposantPizza(String nom, int calories, double prixHT) {
        this.nom = nom;
        this.calories = calories;
        this.prixHT = prixHT;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public double getPrixHT() {
        return prixHT;
    }
}
