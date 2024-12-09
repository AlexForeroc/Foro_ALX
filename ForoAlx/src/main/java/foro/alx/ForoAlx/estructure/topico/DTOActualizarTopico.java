package foro.alx.ForoAlx.estructure.topico;

import foro.alx.ForoAlx.estructure.curso.Curso;
import foro.alx.ForoAlx.estructure.usuario.Usuario;

public record DTOActualizarTopico(Long id, String titulo, String mensaje, Usuario usuario, Curso curso) {
}
