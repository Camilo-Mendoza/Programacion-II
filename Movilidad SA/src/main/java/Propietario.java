public class Propietario {
    private String nombre;
    private String id;
    private String email;
    private String cel;


    public Propietario(String nombre, String id, String email, String cel){
        this.nombre = nombre;
        this.id = id;
        this.email = email;
        this.cel= cel;

    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getCel(){
        return cel;
    }
    public void setCel(String cel){
        this.cel = cel;
    }


}

