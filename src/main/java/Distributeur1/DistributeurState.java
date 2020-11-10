package Distributeur1;

public interface DistributeurState {
    void give(Distributeur a, int i);
    void askCoffee(Distributeur a);
    void askTee(Distributeur a);
}
