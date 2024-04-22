package opgave02.models.factories;

import opgave02.models.pizza.NYStyleCheesePizza;
import opgave02.models.pizza.NYStylePepperoniPizza;
import opgave02.models.pizza.Pizza;

public class NYPizzaFactory extends SimplePizzaFactory {
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
