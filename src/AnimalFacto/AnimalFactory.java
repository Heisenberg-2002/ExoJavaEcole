package AnimalFacto;

public class AnimalFactory {

    public Animal createAnimal(String type, String name) {
        Animal animal = null;
        if ("cat".equals(type)) {
            animal = new Cat();
        } else if ("dog".equals(type)) {
            animal = new Dog();
        } else {
            throw new IllegalArgumentException("Type inconnu");
        }
        animal.setName(name);
        return animal;
    }

    public Animal createAnimal2(String type, String name) throws Exception {
        var clazz = Class.forName(type);
        var animal = (Animal)clazz.newInstance();
        animal.setName(name);
        return animal;
    }

    public static void main(String[] args) throws Exception {
        var factory = new AnimalFactory();
        System.out.println(factory.createAnimal2("AnimalFacto.Cat", "felix").getClass());
        System.out.println(factory.createAnimal2("AnimalFacto.Duck", "donald").getClass());
    }
}