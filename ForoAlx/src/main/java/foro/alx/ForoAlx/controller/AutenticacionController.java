package foro.alx.ForoAlx.controller;

import jakarta.validation.Valid;
import foro.alx.ForoAlx.estructure.usuario.DTOAutenticacionUsuarios;
import foro.alx.ForoAlx.estructure.usuario.Usuario;
import foro.alx.ForoAlx.Seguimiento.security.DatosJWTtoken;
import foro.alx.ForoAlx.Seguimiento.security.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity<DatosJWTtoken> realizarLogin(@RequestBody @Valid DTOAutenticacionUsuarios datos) {
        var authenticationToken = new UsernamePasswordAuthenticationToken(datos.nombre(), datos.contrasena());
        var authentication = manager.authenticate(authenticationToken);

        var tokenJWT = tokenService.generarToken((Usuario) authentication.getPrincipal());

        return ResponseEntity.ok(new DatosJWTtoken(tokenJWT));
    }
}
