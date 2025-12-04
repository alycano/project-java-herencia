public class Moto extends Vehiculo {

    private boolean esDeportiva;

    public Moto(String marca, String modelo, int año, boolean esDeportiva) {
        super(marca, modelo, año);
        this.esDeportiva = esDeportiva;
    }

    @Override
    public void encender() {
        System.out.println("La moto está encendiendo con botón eléctrico...");
    }

    public void infoMoto() {
        String tipo = esDeportiva ? "Deportiva" : "Estándar";
        System.out.println("Moto: " + marca + " " + modelo + " (" + año + ") - Tipo: " + tipo);
    }
}