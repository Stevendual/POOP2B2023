package proyecto;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nombre;

    public Pizza(String nombre, int precio, int cantidad) {
    }

    public Pizza() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    private int precio;
    private String ingredientes;




    public void preparar(){
        System.out.println("Preparando pizza");
        for (int i = 0; i < 5; i++) {
            System.out.println("Preparando pizza... estara lista en "+(5-i)+" minutos");
            try {
                //Ponemos a "Dormir" el programa durante los ms que queremos
                Thread.sleep(5*1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Pizza lista");
    }
    public void toString(String nombre, int precio, String ingredientes){
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;

        System.out.println("La pizza "+this.nombre+" tiene un precio de Q."+this.precio);

        List<String> ingre = new ArrayList<>();
        ingre.add("Queso");
        ingre.add("Tomate");
        ingre.add("Jamon");
        ingre.add("Peperoni");
        ingre.add("Chile");
        ingre.add("Cebolla");
        ingre.add("Champiñones");
        ingre.add("Aceitunas");
        ingre.add("Pina");
        ingre.add("Pollo");
        ingre.add("Carne");
        ingre.add("Salami");
        ingre.add("Tocino");
        ingre.add("Chorizo");
        ingre.add("Salchicha");
        ingre.add("Pavo");
        ingre.add("Anchoas");
        ingre.add("Albahaca");
        ingre.add("Oregano");
        ingre.add("Perejil");


        System.out.println(ingre);
    }

    public void addTopping(Topping topping) {
    }
}
