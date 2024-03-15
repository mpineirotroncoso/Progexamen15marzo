import java.util.ArrayList;
import java.util.List;

public class FortniteManagerImpl implements FortniteManager {
    private List<Arma> arma;
    private List<Skin> skin;

    public FortniteManagerImpl() {
        // Crear listas para armas y skins
        arma=new ArrayList<>();
        skin=new ArrayList<>();
    }

    @Override
    public void agregarArma(String TipoArma, int danoArma) {
        this.arma.add(new Arma(TipoArma, danoArma));
    }

    @Override
    public void agregarSkin(String nombre, String rareza) {
        this.skin.add(new Skin(nombre,rareza));
    }

    @Override
    public void buscarArmaPorTipo(String tipo) {
        for (Arma arma : arma) {
            if (arma.getTipo().equals(tipo)) {
                System.out.println("Arma encontrada: \nTipo: "+arma.getTipo()+"\n Daño: "+arma.getDano());
            }
        }
    }

    @Override
    public void buscarSkinPorRareza(String rareza) {
        for (Skin skin : skin) {
            if (skin.getRareza().equals(rareza)) {
                System.out.println("Skin encontrada: \nNombre: "+skin.getNombre()+"\n Rareza: "+skin.getRareza());
            }
        }
    }

    @Override
    public void eliminarArma(String tipo) {
        int count = 0;
        int encontrado=0;
        for (Arma arma : arma) {
            if (arma.getTipo().equals(tipo)) {
                //Excepcion extraña java.util.ConcurrentModificationException
                System.out.println("Eliminando Arma... \nTipo :"+this.arma.get(count).getTipo()+"\nDaño: "+this.arma.get(count).getDano());
                encontrado = 1;
                this.arma.remove(count);
            }
            count=count+1;
        }
        if (encontrado==0) {
            System.out.println("No se ha encontrado ningún arma con ese tipo.");
        }
    }

    @Override
    public void eliminarSkin(String nombre) {
        int count = 0;
        int encontrado=0;
        for (Skin skin : skin) {
            if (skin.getNombre().equals(nombre)) {
                //Excepcion extraña java.util.ConcurrentModificationException
                System.out.println("Eliminando Skin... \nNombre :"+this.skin.get(count).getNombre()+"\nRareza: "+this.skin.get(count).getRareza());
                encontrado = 1;
                this.skin.remove(count);
            }
            count=count+1;
        }
        if (encontrado==0) {
            System.out.println("No se ha encontrado ninguna skin con ese nombre.");
        }
    }
}
