package opgave01;

import opgave01.models.Pizzeria;
import opgave01.models.SimplePizzaFactory;

public class Opgave01 {
    public static void main(String[] args) {
        Pizzeria pizzaria = new Pizzeria(new SimplePizzaFactory());
        pizzaria.orderPizza("pepperoni");
    }

}
