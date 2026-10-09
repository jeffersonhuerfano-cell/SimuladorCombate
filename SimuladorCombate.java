package simuladorcombate;

public class SimuladorCombate {

    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Aragorn", 5, 100);
        Mago mago = new Mago("Gandalf", 5, 80);

        System.out.println("======================================");
        System.out.println("   SIMULADOR DE COMBATE EN JAVA (CUN)  ");
        System.out.println("======================================\n");

        System.out.println("Combatientes iniciados:");
        System.out.println("- " + guerrero.getNombre() + " | Salud: " + guerrero.getSalud());
        System.out.println("- " + mago.getNombre() + " | Salud: " + mago.getSalud() + "\n");

        guerrero.usarEspada();
        mago.lanzarHechizo();

        System.out.println("\n--- El Guerrero asesta un golpe critico al Mago ---");
        mago.setSalud(mago.getSalud() - 90);

        System.out.println("Salud restante de " + mago.getNombre() + ": " + mago.getSalud());

        if (mago.getSalud() <= 0) {
            System.out.println("\n" + mago.getNombre() + " ha sido derrotado.");
            mago = null;
            System.out.println("Referencia asignada a 'null'. El Garbage Collector reclamara la memoria.");
        }
    }
}