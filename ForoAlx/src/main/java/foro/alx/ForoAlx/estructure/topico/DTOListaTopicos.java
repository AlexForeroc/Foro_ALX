package foro.alx.ForoAlx.estructure.topico;

import java.time.LocalDateTime;

public record DTOListaTopicos(Long id, String titulo, String mensaje, LocalDateTime fechaCreacion, String status, String usuario, String curso) {

    public DTOListaTopicos(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion(), topico.getStatus().toString(), topico.getUsuario().getNombre(), topico.getCurso().getNombre());
    }
}
