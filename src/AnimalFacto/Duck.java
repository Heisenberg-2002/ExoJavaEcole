package AnimalFacto;

public class Duck implements Animal {
    private String name;

    public Duck() {
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
        return "Duck named " + name;
    }
}
