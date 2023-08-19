package proyecto;

import java.util.Calendar;

public class PizzaItaliana extends Pizza {
    private String salsa;
    private Calendar toppings;

    public PizzaItaliana(String nombre, int precio, int cantidad, String salsa) {
        super(nombre, precio, cantidad);
        this.salsa = salsa;
    }

    @Override
    public void preparar() {
        super.preparar();
        this.agregarSalsa();
    }

    private void agregarSalsa() {
        // Agrega la salsa a la pizza
      //  this.getToppings().add(new Toppings(this.salsa));
    }

    @Override
    public String toString() {
        String padre = super.toString();
        return padre + " con salsa " + this.salsa;
    }

    public Calendar getToppings() {
        Calendar toppings = null;
        return toppings;
    }

    public void setToppings(Calendar toppings) {
        this.toppings = toppings;
    }

    public void agregarTopping(Toppings quesoRallado) {

    }
}
