public class Skin {
    private String nombre;
    private String Rareza;

    public Skin(String nombre, String rareza) {
        this.nombre = nombre;
        Rareza = rareza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRareza() {
        return Rareza;
    }

    public void setRareza(String Rareza) {
        this.Rareza = Rareza;
    }

}
