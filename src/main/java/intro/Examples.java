package intro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        // console.log("Hello World");
        System.out.println("Hello world!");

        // primitive typer
        // const age = 23;
        int age = 23;
        System.out.println(age);

        // const price = 23.99;
        double price = 23.9999;

        // const isRich = false;
        boolean isRich = false;

        // const firstLetterInAlphabet = "a";
        final char firstLetterInAlphabet = 'a';

        // reference types
        String name = "benjamin";
        System.out.println(name.charAt(0));
        char firstLetter = name.charAt(0);
        System.out.println(firstLetter);
        String nameCool = name.concat(" er sej");
        double price2 = 20.9;

        // const prices = [];
        ArrayList<Double> prices = new ArrayList<>();

        // prices.push(23.99);
        prices.add(23.99);
        prices.add(99.99);
        System.out.println(prices);

        // const productPrices = {};
        HashMap<String, Double> productPrices = new HashMap<String, Double>();

        // "flatscreen tv" 9000
        // productPrices["flatscreen tv"] = 9000
        productPrices.put("flatscreen tv", 9000.0);
        productPrices.put("iphone", 8000.0);
        System.out.println(productPrices);
        for (int i = 0; i < 9; i++) {
            System.out.println(i);
        }

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println(userName.toUpperCase() + "🎉");
    }
}
