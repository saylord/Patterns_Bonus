package pizzas.Chicago;

import pizzas.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Chicago Style Clam Pizza.");
    }

    @Override
    public void bake() {
        System.out.println("Baking Chicago Style Clam Pizza.");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Chicago Style Clam Pizza.");
    }

    @Override
    public void box() {
        System.out.println("Boxing Chicago Style Clam Pizza.");
    }
}
