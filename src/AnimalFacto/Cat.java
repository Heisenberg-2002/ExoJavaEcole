package AnimalFacto;

public class Cat implements Animal {
    private String name;

    public Cat() {
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
        return "Cat named " + name;
    }
}
