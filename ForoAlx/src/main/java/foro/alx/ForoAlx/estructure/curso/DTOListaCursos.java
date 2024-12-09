package foro.alx.ForoAlx.estructure.curso;

public record DTOListaCursos(Long id, String nombre, String categoria) {

    public DTOListaCursos(Curso curso) {
        this(curso.getId(), curso.getNombre(), curso.getCategoria());
    }
}
