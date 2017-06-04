/**
 * Created by Тим on 02.06.2017.
 */
public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "чикага стайл клам пицца";
        dough = "экстра";
        sauce = "томатный соус";

        toppings.add("и сырок");
        toppings.add("и ракушек");
    }

    void cut() {
        System.out.println("порэжу");
    }
}