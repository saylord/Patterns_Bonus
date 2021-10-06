public class SimplePizzaFactory {
    public Pizza makePizza(String pizzaType) {
        if (pizzaType.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (pizzaType.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else {
            return null;
        }
    }
}
