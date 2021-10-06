package pizzas.NY;

import pizzas.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing NY Style Veggie Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking NY Style Veggie Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting NY Style Veggie Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing NY Style Veggie Pizza");
    }

}
