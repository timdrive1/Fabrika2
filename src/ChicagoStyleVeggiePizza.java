/**
 * Created by Тим on 02.06.2017.
 */
public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "не для людей";
        dough = "ниче не надо";
        sauce = "воды вместо соуса";

        toppings.add("плесени вместо сырка");
        toppings.add("помет крыс вместо оливок");
        toppings.add("трава");
        toppings.add("трава");
    }

    void cut() {
        System.out.println("можно не резать");
    }
}