package foro.alx.ForoAlx.controller;

import jakarta.validation.Valid;
import foro.alx.ForoAlx.estructure.curso.*;
import foro.alx.ForoAlx.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping
    public ResponseEntity<DTOListaCursos> regitrarCurso(@RequestBody @Valid DTORegistrarCurso registro, UriComponentsBuilder uri) {
        Curso curso = cursoRepository.save(new Curso(registro));
        DTOListaCursos dtoRespuestaCursos = new DTOListaCursos(
                curso.getId(),
                curso.getNombre(),
                curso.getCategoria()
        );
        URI url = uri.path("/cursos/{id}").buildAndExpand(curso.getId()).toUri();
        return ResponseEntity.created(url).body(dtoRespuestaCursos);
    }

    @GetMapping
    public List<DTOListaCursos> listadoCursos() {
        return cursoRepository.findAll().stream().map(DTOListaCursos::new).toList();
    }

    @PutMapping
    @Transactional
    public ResponseEntity<DTOListaCursos> actualizarTopico(@RequestBody @Valid DTOActualizarCurso datosActualizar) {
        Curso curso = cursoRepository.getReferenceById(datosActualizar.id());
        curso.actualizarDatos(datosActualizar);
            return ResponseEntity.ok( new DTOListaCursos(
                    curso.getId(),
                    curso.getNombre(),
                    curso.getCategoria()
        ));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity eliminarTopico(@PathVariable Long id) {
        Curso curso = cursoRepository.getReferenceById(id);
        cursoRepository.delete(curso);
        return ResponseEntity.noContent().build();
    }
}
