package CarExo;

import java.util.HashSet;
import java.util.Set;

public class Car {

    private String engine;
    private int numberOfSeats;
    private String innerColor;
    private String outsideColor;
    private GearBox gearBox;
    private int rim;
    private Set<String> options;

    // Constructeur par défaut avec des valeurs par défaut
    public Car() {
        numberOfSeats = 4; // Nombre de sièges par défaut
        gearBox = GearBox.BVM; // Boîte de vitesses par défaut : BVM
        rim = 15; // Taille des jantes par défaut
        options = new HashSet<>(); // Liste des options
    }

    // Méthode pour définir le moteur
    public Car withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    // Méthode pour définir le nombre de sièges
    public Car withNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        return this;
    }

    // Méthode pour définir la couleur intérieure
    public Car withInnerColor(String innerColor) {
        this.innerColor = innerColor;
        return this;
    }

    // Méthode pour définir la couleur extérieure
    public Car withOutsideColor(String outsideColor) {
        this.outsideColor = outsideColor;
        return this;
    }

    // Méthode pour définir la boîte de vitesses
    public Car withGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
        return this;
    }

    // Méthode pour définir la taille des jantes
    public Car withRim(int rim) {
        this.rim = rim;
        return this;
    }

    // Méthode pour ajouter une option
    public Car withOption(String option) {
        options.add(option);
        return this;
    }

    // Enum pour définir les types de boîte de vitesses
    public enum GearBox {
        BVM, BVA;
    }

    // Méthode principale pour tester la création d'une voiture
    public static void main(String[] args) {
        // Création et configuration d'une voiture
        var car = new Car()
                .withEngine("diesel")
                .withNumberOfSeats(5)
                .withInnerColor("beige")
                .withOutsideColor("red")
                .withGearBox(GearBox.BVA)
                .withRim(17)
                .withOption("GPS")
                .withOption("heated seats");

        // Affichage de la voiture configurée
        System.out.println("Car Details: ");
        System.out.println("Engine: " + car.engine);
        System.out.println("Number of seats: " + car.numberOfSeats);
        System.out.println("Inner color: " + car.innerColor);
        System.out.println("Outside color: " + car.outsideColor);
        System.out.println("Gearbox: " + car.gearBox);
        System.out.println("Rim size: " + car.rim);
        System.out.println("Options: " + car.options);
    }
}
