package foro.alx.ForoAlx.estructure.topico;

import foro.alx.ForoAlx.estructure.curso.Curso;
import foro.alx.ForoAlx.estructure.usuario.Usuario;
import java.time.LocalDateTime;

public record DTORespuestaTopico(
         Long id,
         String titulo,
         String mensaje,
         LocalDateTime fechaCreacion,
         StatusTopico status,
         Usuario usuario,
         Curso curso) {
}
