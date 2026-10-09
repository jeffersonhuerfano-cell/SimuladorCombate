package simuladorcombate;

public abstract class Personaje {
    private String nombre;
    private int nivel;
    private int salud;

    public Personaje(String nombre, int nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        setSalud(salud);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        if (salud < 0) {
            this.salud = 0;
        } else {
            this.salud = salud;
        }
    }

    public void atacar() {
        System.out.println(nombre + " realiza un ataque basico.");
    }
}