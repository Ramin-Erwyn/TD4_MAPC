package Distributeur2;


public class Distributeur {


    private int somme;
    private DistributeurState state;


    public Distributeur(){
        this.somme = 0;
        this.state = DistributeurValide.getInstance();
    }

    void setState(DistributeurState s) {
        this.state = s;
    }

    int somme() {
        return somme;
    }

    void ajoutCaisse(int i) {
        somme += i;
    }
    void diminuerCaisse() {somme-=10;}


    public void give(int i) {state.give(this,i);}
    public void askCoffee() {state.askCoffee(this);}
    public void askTee() {state.askTee(this);}
    void reinitialisation() {somme = 0;}
    public void getRefund() {state.getRefund(this);}
}