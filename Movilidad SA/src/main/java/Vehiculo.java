public class Vehiculo {
    private float tamaño;
    private int placa;
    private String modelo;
    private String marca;
    private String color;


    public Vehiculo (float tamayo,int placa, String modelo, String marca, String color){
        this.tamaño = tamaño;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;

    }

    public float getTamaño(){
        return tamaño;
    }
    public void setTamaño(float tamaño){
        this.tamaño = tamaño;
    }

    public int getPlaca(){
        return placa;
    }
    public void setPlaca(int placa){
        this.placa = placa;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

}
