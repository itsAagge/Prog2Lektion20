package opgave02;

import opgave02.models.Pizzeria;
import opgave02.models.factories.SimplePizzaFactory;

public class Opgave02 {
    public static void main(String[] args) {
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        Pizzeria pizzeria = new Pizzeria(pizzaFactory);
        pizzeria.orderPizza("cheese", "NY");
    }

}
