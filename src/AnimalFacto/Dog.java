package AnimalFacto;

public class Dog implements Animal {
    private String name;

    public Dog() {
        // Constructeur sans argument requis pour la réflexion
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog named " + name;
    }
}
