package AnimalFacto;

import java.lang.reflect.InvocationTargetException;

public class AnimalFactory {

    // Méthode utilisant des conditions explicites
    public Animal createAnimal(String type, String name) {
        Animal animal = null;
        if ("cat".equalsIgnoreCase(type)) {
            animal = new Cat();
        } else if ("dog".equalsIgnoreCase(type)) {
            animal = new Dog();
        } else if ("duck".equalsIgnoreCase(type)) {
            animal = new Duck();
        } else {
            throw new IllegalArgumentException("Type inconnu : " + type);
        }
        animal.setName(name);
        return animal;
    }

    // Méthode utilisant la réflexion pour une instanciation dynamique
    public Animal createAnimal2(String type, String name) {
        try {
            var clazz = Class.forName(type); // Charger la classe dynamiquement
            var animal = (Animal) clazz.getConstructor().newInstance(); // Appeler le constructeur sans argument
            animal.setName(name);
            return animal;
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException
                 | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException("Erreur lors de la création de l'animal : " + e.getMessage(), e);
        }
    }

    public static void main(String[] args) {
        var factory = new AnimalFactory();

        // Test de la méthode 1
        Animal cat = factory.createAnimal("cat", "Felix");
        System.out.println(cat);

        Animal dog = factory.createAnimal("dog", "Rex");
        System.out.println(dog);

        // Test de la méthode 2
        try {
            Animal dynamicCat = factory.createAnimal2("AnimalFacto.Cat", "Dynamix");
            System.out.println(dynamicCat);

            Animal dynamicDuck = factory.createAnimal2("AnimalFacto.Duck", "Donald");
            System.out.println(dynamicDuck);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
