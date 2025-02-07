public class VehiculoDeCarga extends Vehiculo {
    private float capacidadCarga;
    private int numeroEjes;

    public VehiculoDeCarga(float tamaño, int placa, String modelo, String marca, String color, float capacidadCarga, int numeroEjes) {
        super(tamaño, placa, modelo, marca, color);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    public float getCapacidadCarga() {
        return capacidadCarga;
    }
    public void setCapacidadCarga(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }
    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
}
