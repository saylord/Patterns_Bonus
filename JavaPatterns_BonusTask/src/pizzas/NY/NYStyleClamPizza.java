package pizzas.NY;

import pizzas.Pizza;

public class NYStyleClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing NY Style Clam Pizza.");
    }

    @Override
    public void bake() {
        System.out.println("Baking NY Style Clam Pizza.");
    }

    @Override
    public void cut() {
        System.out.println("Cutting NY Style Clam Pizza.");
    }

    @Override
    public void box() {
        System.out.println("Boxing NY Style Clam Pizza.");
    }
}
