public class Automovil extends Vehiculo implements Asegurable {
    private double precioGasolina;
    private double valorComercial;

    public Automovil(String marca, int anio, double precioGasolina, double valorComercial) {
        super(marca, anio);
        this.precioGasolina = precioGasolina;
        this.valorComercial = valorComercial;
    }

    @Override
    public double calcularCostoKm() {
        return precioGasolina / 12.0;
    }

    @Override
    public double calcularPrima() {
        return valorComercial * 0.03;
    }

    @Override
    public String numeroPoliza() {
        return "POL-AUTO-" + marca.toUpperCase() + "-" + anio;
    }
}