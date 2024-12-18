package newPizzaFacto;

import newPizzaFacto.Interface.Four;
import newPizzaFacto.Interface.UsinePizza;

public class UsinePizzaDeBase implements UsinePizza {
    @Override
    public Four creerFour(String type) {
        switch (type.toLowerCase()) {
            case "bois":
                return new FourDeBase(1, 500);
            case "electrique":
                return new FourDeBase(5, 450);
            case "atomique":
                return new FourDeBase(10000000, 10000000.1);
            default:
                throw new IllegalArgumentException("Type de four inconnu.");
        }
    }
}

