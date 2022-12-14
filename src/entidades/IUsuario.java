package entidades;

public interface IUsuario {

    public default boolean autenticar() {
        return true;
    }
}
