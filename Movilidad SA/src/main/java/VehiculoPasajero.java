public class VehiculoPasajero extends Vehiculo {
    private int numeroPasajeros;

    public VehiculoPasajero(float tamaño, int placa, String modelo, String marca, String color, int numeroPasajeros) {
        super(tamaño, placa, modelo, marca, color);
        this.numeroPasajeros= numeroPasajeros;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }
}
