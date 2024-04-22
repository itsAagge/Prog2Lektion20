package opgave02;

import opgave02.models.Pizzeria;
import opgave02.models.factories.ChicagoPizzaFactory;
import opgave02.models.factories.SimplePizzaFactory;

public class Opgave02 {
    public static void main(String[] args) {
        SimplePizzaFactory pizzaFactory = new ChicagoPizzaFactory();
        Pizzeria pizzeria = new Pizzeria(pizzaFactory);
        pizzeria.orderPizza("cheese");
    }

}
