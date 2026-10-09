package simuladorcombate;

public class Guerrero extends Personaje {

    public Guerrero(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    public void usarEspada() {
        System.out.println(getNombre() + " ataca con su espada causando un gran daño fisico!");
    }
}