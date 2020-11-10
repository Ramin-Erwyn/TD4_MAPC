package Distributeur1;

import Distributeur1.Distributeur;
public class App {
    public static void main(String[] args) {
        Distributeur a = new Distributeur();
        a.askCoffee();
        a.give(5);
        a.askCoffee();
        a.give(10);
        a.askCoffee();
    }


}
