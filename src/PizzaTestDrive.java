/**
 * Created by Тим on 02.06.2017.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("сырок");
        System.out.println("какой-то чел попросил " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("сырок");
        System.out.println("какой-то чел попросил " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("ракушки");
        System.out.println("какой-то чел попросил  " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("ракушки");
        System.out.println("какой-то чел попросил  " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("пеп");
        System.out.println("какой-то чел попросил " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("пеп");
        System.out.println("какой-то чел попросил " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("*********");
        System.out.println("какой-то чел попросил " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("*********");
        System.out.println("какой-то чел попросил " + pizza.getName() + "\n");
    }
}