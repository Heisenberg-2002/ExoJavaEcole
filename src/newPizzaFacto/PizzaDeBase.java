package newPizzaFacto;

import newPizzaFacto.Interface.Composant;
import newPizzaFacto.Interface.Pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaDeBase implements Pizza {
    private String pate;  // "épaisse" ou "fine"
    private String base;  // "crème" ou "tomate"
    private List<Composant> composants;
    private static final int MAX_COMPOSANTS = 15;  // Limite d'ingrédients
    private int tempsCuisson = 90;  // Temps conseillé à 400°C

    public PizzaDeBase(String pate, String base) {
        this.pate = pate;
        this.base = base;
        this.composants = new ArrayList<>();
    }

    @Override
    public void ajouterComposant(Composant composant) {
        if (composants.size() < MAX_COMPOSANTS) {
            composants.add(composant);
        } else {
            System.out.println("Impossible d'ajouter plus de composants.");
        }
    }

    @Override
    public double getPrix() {
        return composants.stream().mapToDouble(Composant::getPrixHT).sum();
    }

    @Override
    public int getCalories() {
        return composants.stream().mapToInt(Composant::getCalories).sum();
    }

    @Override
    public int getTempsCuisson(double temperatureFour) {
        return (int) (400 / temperatureFour * tempsCuisson);
    }

    @Override
    public List<Composant> getComposants() {
        return new ArrayList<>(composants);
    }
}

