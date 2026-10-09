package simuladorcombate;

public class Mago extends Personaje {

    public Mago(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    public void lanzarHechizo() {
        System.out.println(getNombre() + " canaliza energia magica e invoca un poderoso hechizo!");
    }
}