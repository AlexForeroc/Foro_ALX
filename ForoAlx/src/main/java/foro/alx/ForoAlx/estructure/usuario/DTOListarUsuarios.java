package foro.alx.ForoAlx.estructure.usuario;

public record DTOListarUsuarios(Long id, String nombre, String email) {

    public DTOListarUsuarios(Usuario usuario){
        this(usuario.getId(), usuario.getNombre(), usuario.getEmail());
    }
}
