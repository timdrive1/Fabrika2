/**
 * Created by Тим on 02.06.2017.
 */
import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("херачу " + name);
        System.out.println("сложно");
        System.out.println("соусом заливаю");
        System.out.println("и херни всякой нарежу");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("пеку");
    }

    void cut() {
        System.out.println("нарезка");
    }

    void box() {
        System.out.println("в пакет за 3 рубля закиньте");
    }

    public String getName() {
        return name;
    }


}