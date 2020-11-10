package War;

public class Rouler implements DeplacementStrategie {
    private static DeplacementStrategie instance = new Rouler();

    private Rouler() {}

    public static DeplacementStrategie getInstance() {
        if(instance == null) {
            instance = new Rouler();
        }
        return instance;
    }

    @Override
    public void deplacer() {
        System.out.println("on roule");
    }

}
