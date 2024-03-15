public interface FortniteManager {
    void agregarArma(String TipoArma, int danoArma);
    void agregarSkin(String nombre, String rareza);
    void buscarArmaPorTipo(String tipo);
    void buscarSkinPorRareza(String rareza);
    void eliminarArma(String tipo);
    void eliminarSkin(String nombre);
}
