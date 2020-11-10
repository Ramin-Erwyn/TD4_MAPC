package Distributeur2;

public interface DistributeurState {
    void give(Distributeur a, int i);
    void askCoffee(Distributeur a);
    void askTee(Distributeur a);
    int getRefund(Distributeur a);
}
