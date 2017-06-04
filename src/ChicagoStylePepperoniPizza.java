/**
 * Created by Тим on 02.06.2017.
 */
public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "чикага пепп";
        dough = "экстра";
        sauce = "соусец ";

        toppings.add("сырок");
        toppings.add("оливки");
        toppings.add("ш п и н а т ");
        toppings.add("я и ч к и");
        toppings.add("пеппепепепеп");
    }

    void cut() {
        System.out.println("порэжу");
    }
}