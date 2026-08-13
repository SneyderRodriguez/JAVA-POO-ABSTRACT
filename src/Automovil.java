public class Automovil extends Vehiculo {
    private double precioGasolina;

    public Automovil(String marca, int anio, double precioGasolina) {
        super(marca, anio);
        this.precioGasolina = precioGasolina;
    }

    @Override
    public double calcularCostoKm() {
        return precioGasolina / 12.0;
    }
}