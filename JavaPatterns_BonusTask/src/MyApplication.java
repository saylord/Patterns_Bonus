import pizzas.Pizza;
import stores.ChicagoPizzaStore;
import stores.NYPizzaStore;
import stores.PizzaStore;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {
    private Scanner sc = new Scanner(System.in);

    public void start() {

        System.out.println("Hello, welcome to the Aliya's Bonus Task");

        while(true) {

            System.out.println("You can choose one of the given 2 Pizza Stores:");
            System.out.println("1. New York Pizza Store.");
            System.out.println("2. Chicago Pizza Store.");
            System.out.println("0. Exit");
            System.out.println();

            try {
                System.out.println("Enter option (1-2): ");
                int option = sc.nextInt();
                if (option == 1) {
                    getNY();
                } else if (option == 2) {
                    getChicago();
                } else {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Input must be integer!!!");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("=======================================");
        }
    }

    public void getNY() {
        while(true) {

            System.out.println("Now, choose one of the given 4 Pizzas:");
            System.out.println("1. NY Style Cheese Pizza.");
            System.out.println("2. NY Style Clam Pizza.");
            System.out.println("3. NY Style Pepperoni Pizza.");
            System.out.println("4. NY Style Veggie Pizza.");
            System.out.println("0. Exit");
            System.out.println();

            try {
                PizzaStore nyPizzaStore = new NYPizzaStore();

                System.out.println("Enter option (1-4): ");
                int option = sc.nextInt();
                if (option == 1) {
                    Pizza nyCheesePizza = nyPizzaStore.orderPizza("cheese");
                    System.out.println("Thanks for purchasing!!");
                } else if (option == 2) {
                    Pizza nyClamPizza = nyPizzaStore.orderPizza("clam");
                    System.out.println("Thanks for purchasing!!");
                } else if (option == 3) {
                    Pizza nyPepperoniPizza = nyPizzaStore.orderPizza("pepperoni");
                    System.out.println("Thanks for purchasing!!");
                } else if (option == 4) {
                    Pizza nyVeggiePizza = nyPizzaStore.orderPizza("veggie");
                    System.out.println("Thanks for purchasing!!");
                } else {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Input must be integer!!!");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("=======================================");
        }

    }

    public void getChicago() {
        while(true) {

            System.out.println("Now, choose one of the given 4 Pizzas from NY:");
            System.out.println("1. Chicago Style Cheese Pizza.");
            System.out.println("2. Chicago Style Clam Pizza.");
            System.out.println("3. Chicago Style Pepperoni Pizza.");
            System.out.println("4. Chicago Style Veggie Pizza.");
            System.out.println("0. Exit");
            System.out.println();

            try {
                PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

                System.out.println("Enter option (1-4): ");
                int option = sc.nextInt();
                if (option == 1) {
                    Pizza chicagoCheesePizza = chicagoPizzaStore.orderPizza("cheese");
                    System.out.println("Thanks for purchasing!!");
                } else if (option == 2) {
                    Pizza chicagoClamPizza = chicagoPizzaStore.orderPizza("clam");
                    System.out.println("Thanks for purchasing!!");
                } else if (option == 3) {
                    Pizza chicagoPepperoniPizza = chicagoPizzaStore.orderPizza("pepperoni");
                    System.out.println("Thanks for purchasing!!");
                } else if (option == 4) {
                    Pizza chicagoVeggiePizza = chicagoPizzaStore.orderPizza("veggie");
                    System.out.println("Thanks for purchasing!!");
                } else {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Input must be integer!!!");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("=======================================");
        }
    }
}
