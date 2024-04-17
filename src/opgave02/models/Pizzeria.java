package opgave02.models;

import opgave02.models.pizza.Pizza;
import opgave02.models.factories.SimplePizzaFactory;

public class Pizzeria {
    SimplePizzaFactory pizzaFactory;

    public Pizzeria(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type, String style) {
        Pizza pizza = pizzaFactory.createPizza(type, style);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
