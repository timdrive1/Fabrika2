/**
 * Created by Тим on 02.06.2017.
 */
public class NYPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        if (item.equals("сырок")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("*********")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("ракушки")) {
            return new NYStyleClamPizza();
        } else if (item.equals("пеп")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}