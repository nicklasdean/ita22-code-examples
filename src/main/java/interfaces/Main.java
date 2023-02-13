package interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        ArrayList<Double> benjaminsSpendings = new ArrayList<>();
        benjaminsSpendings.add(233.2);
        Account benjaminAccount = new Account("Benjamin account", 123456, 1000, benjaminsSpendings);
        System.out.println(benjaminAccount);
        benjaminAccount.addSpending(1000);
        System.out.println(benjaminAccount);

         */

        Dog vuffi = new Dog();
        Cat cat = new Cat();
        vuffi.sayASound();
        cat.sayASound();
    }
}
