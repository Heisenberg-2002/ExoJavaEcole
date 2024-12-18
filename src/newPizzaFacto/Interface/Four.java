package newPizzaFacto.Interface;

import java.util.List;

public interface Four {
    boolean enfourner(Pizza pizza);
    Pizza defourner();
    boolean estPlein();
    List<Pizza> getPizzas();
    double getTemperature();
}
