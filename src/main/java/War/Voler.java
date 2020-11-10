package War;

public class Voler implements DeplacementStrategie {
    private static DeplacementStrategie instance = new Voler();

    private Voler() {}

    public static DeplacementStrategie getInstance() {
        if(instance == null) {
            instance = new Voler();
        }
        return instance;
    }

    @Override
    public void deplacer() {
        System.out.println("on avannce");
    }
}
