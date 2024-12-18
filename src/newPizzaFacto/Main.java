package newPizzaFacto;

import newPizzaFacto.Interface.Four;
import newPizzaFacto.Interface.Pizza;
import newPizzaFacto.Interface.UsinePizza;

public class Main {
    public static void main(String[] args) {
        // Création de l'usine
        UsinePizza usine = new UsinePizzaDeBase();

        // Création d'un four électrique
        Four four = usine.creerFour("electrique");

        // Création d'une pizza
        Pizza pizza = new PizzaDeBase("fine", "tomate");
        pizza.ajouterComposant(new ComposantPizza("Mozzarella", 200, 2.5));
        pizza.ajouterComposant(new ComposantPizza("Jambon", 150, 3.0));
        pizza.ajouterComposant(new ComposantPizza("Olives", 50, 1.0));

        System.out.println("Prix de la pizza : " + pizza.getPrix() + "€");
        System.out.println("Calories de la pizza : " + pizza.getCalories() + " kcal");

        // Enfournement
        if (four.enfourner(pizza)) {
            System.out.println("Pizza enfournée !");
        }

        // Défournement
        Pizza pizzaDefournee = four.defourner();
        if (pizzaDefournee != null) {
            System.out.println("Pizza défournée !");
        }
    }
}
