package stores;

import pizzas.Chicago.ChicagoStyleCheesePizza;
import pizzas.Chicago.ChicagoStyleClamPizza;
import pizzas.Chicago.ChicagoStylePepperoniPizza;
import pizzas.Chicago.ChicagoStyleVeggiePizza;
import pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String pizzaType) {
        if (pizzaType.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else if (pizzaType.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (pizzaType.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (pizzaType.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
