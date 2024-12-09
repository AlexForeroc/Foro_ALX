package foro.alx.ForoAlx.estructure.topico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import foro.alx.ForoAlx.estructure.curso.Curso;
import foro.alx.ForoAlx.estructure.usuario.Usuario;

public record DTORegistrarTopico(
        @NotBlank String titulo,
        @NotBlank String mensaje,
        @NotNull @Valid Usuario usuario,
        @NotNull @Valid Curso curso) {
}
