public class Carro extends Vehiculo {

    private int puertas;

    public Carro(String marca, String modelo, int año, int puertas) {
        super(marca, modelo, año);
        this.puertas = puertas;
    }

    @Override
    public void encender() {
        System.out.println("El carro está encendiendo con llave...");
    }

    public void infoCarro() {
        System.out.println("Carro: " + marca + " " + modelo + " (" + año + ") - Puertas: " + puertas);
    }
}