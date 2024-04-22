package opgave01.models;

import opgave01.models.pizzas.Pizza;

public class Pizzeria {
    SimplePizzaFactory factory;

    public Pizzeria(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
