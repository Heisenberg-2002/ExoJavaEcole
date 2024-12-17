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

    public Car() {
        numberOfSeats = 4;
        gearBox = GearBox.BVM;
        rim = 15;
        options = new HashSet<>();
    }

    public Car withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public Car withNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        return this;
    }

    public Car withOption(String option) {
        options.add(option);
        return this;
    }

    public enum GearBox {
        BVM, BVA;
    }

    public static void main(String[] args) {
        var car = new Car().withEngine("diesel").withOption("GSP").withOption("tuner");
    }
}
