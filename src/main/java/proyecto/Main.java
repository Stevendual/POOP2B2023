package proyecto;

public class Main {
    public static void main(String[] args) {

        Pizza p = new Pizza();
        p.preparar();

        p.toString("Hawaiana", 50, "Queso, Tomate, Jamon, Pina");

        p.toString();

        PizzaItaliana pizza = new PizzaItaliana("Pizza Margherita", 150, 1, "salsa marinara");
        pizza.agregarTopping(new Toppings("queso rallado"));
        pizza.agregarTopping(new Toppings("tomate picado"));

        System.out.println(pizza.toString());
    }
}