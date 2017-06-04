/**
 * Created by Тим on 02.06.2017.
 */
public class DependentPizzaStore {

    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if (style.equals("нью йорк")) {
            if (type.equals("сырок")) {
                pizza = new NYStyleCheesePizza();
            } else if (type.equals("*********")) {
                pizza = new NYStyleVeggiePizza();
            } else if (type.equals("ракушки")) {
                pizza = new NYStyleClamPizza();
            } else if (type.equals("пеп")) {
                pizza = new NYStylePepperoniPizza();
            }
        } else if (style.equals("чикаго")) {
            if (type.equals("сырок")) {
                pizza = new ChicagoStyleCheesePizza();
            } else if (type.equals("********")) {
                pizza = new ChicagoStyleVeggiePizza();
            } else if (type.equals("ракушки")) {
                pizza = new ChicagoStyleClamPizza();
            } else if (type.equals("пеп")) {
                pizza = new ChicagoStylePepperoniPizza();
            }
        } else {
            System.out.println("Я забыл что написал");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}