/**
 * Created by Тим on 02.06.2017.
 */
public class ChicagoPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        if (item.equals("сырок")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("*********")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("ракушки")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("пеп")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}