package stores;

import pizzas.NY.NYStyleCheesePizza;
import pizzas.NY.NYStyleClamPizza;
import pizzas.NY.NYStylePepperoniPizza;
import pizzas.NY.NYStyleVeggiePizza;
import pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String pizzaType) {
        if (pizzaType.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (pizzaType.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (pizzaType.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (pizzaType.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
