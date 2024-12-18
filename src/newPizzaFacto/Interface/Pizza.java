package newPizzaFacto.Interface;

import java.util.List;

public interface Pizza {
    void ajouterComposant(Composant composant);
    double getPrix();
    int getCalories();
    int getTempsCuisson(double temperatureFour);
    List<Composant> getComposants();
}