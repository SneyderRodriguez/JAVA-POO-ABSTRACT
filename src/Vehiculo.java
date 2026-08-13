public abstract class Vehiculo {
    protected String marca;
    protected int anio;

    public Vehiculo(String marca, int anio) {
        this.marca = marca;
        this.anio = anio;
    }

    public void describir() {
        System.out.println("Vehiculo: " + marca + " (" + anio + ")");
    }
}
