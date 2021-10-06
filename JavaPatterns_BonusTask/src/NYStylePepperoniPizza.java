public class NYStylePepperoniPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("Preparing NY Pepperoni Pizza.");
    }

    @Override
    public void bake() {
        System.out.println("Baking NY Pepperoni Pizza.");
    }

    @Override
    public void cut() {
        System.out.println("Cutting NY Pepperoni Pizza.");
    }

    @Override
    public void box() {
        System.out.println("Boxing NY Pepperoni Pizza.");
    }
}
