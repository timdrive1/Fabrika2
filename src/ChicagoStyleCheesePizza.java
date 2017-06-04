/**
 * Created by Тим on 02.06.2017.
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "чикаго стайл дип диш чиз пицца";
        dough = "экстра что-то там";
        sauce = "томатный соус";

        toppings.add("и сырок");
    }

    void cut() {
        System.out.println("порэжу");
    }
}