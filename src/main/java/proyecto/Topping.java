package proyecto;

public class Topping extends Pizza{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Topping(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Pizza pizza) {
        pizza.addTopping(this);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
