public interface Asegurable {
    double calcularPrima();
    String numeroPoliza();

    default void registrarPoliza() {
        System.out.println("Poliza " + numeroPoliza() + " registrada. Prima: $" + calcularPrima());
    }
}
