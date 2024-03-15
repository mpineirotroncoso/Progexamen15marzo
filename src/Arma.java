public class Arma {
    private String tipo;
    private int dano;

    public Arma(String tipo, int dano) {
        this.tipo = tipo;
        this.dano = dano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
}
