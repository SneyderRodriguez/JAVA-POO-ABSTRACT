public abstract class Vehiculo {
    protected String marca;
    protected int anio;

    public Vehiculo(String marca, int anio) {
        this.marca = marca;
        this.anio = anio;
    }

    // Método concreto: todas las hijas lo heredan tal cual
    public void encender() {
        System.out.println(marca + " encendido.");
    }

    // Método abstracto: cada hija está obligada a definirlo
    public abstract double calcularCostoKm();

    // Método concreto que USA el abstracto sin saber su implementación
    public void describir() {
        System.out.println("Vehiculo: " + marca + " (" + anio + ")");
        System.out.println("Costo por km: $" + calcularCostoKm());
    }
}
