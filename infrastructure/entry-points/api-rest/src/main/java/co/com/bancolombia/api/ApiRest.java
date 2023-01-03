package co.com.bancolombia.api;
import co.com.bancolombia.model.usuario.Usuario;
import co.com.bancolombia.usecase.gestionusuario.GestionUsuarioUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {

    private final GestionUsuarioUseCase gestionUsuarioUseCase;


    @GetMapping(path = "/buscarUsuario/{id}")
    public Usuario usuarioPorId(@PathVariable Long id) {
        return gestionUsuarioUseCase.encontrarUsuarioBd(id);

    }

    @GetMapping(path = "/listar")
    public List<Usuario> listarUsuarios() {
        return gestionUsuarioUseCase.listarUsuarios();

    }

    @PostMapping
    public Usuario agregarUser(@RequestBody Usuario usuario){
        return gestionUsuarioUseCase.creacionUsuarioBd(usuario);
    }

    @DeleteMapping(path = "/eliminar/{id}")
    public ResponseEntity<?> eliminarUsuario(@PathVariable Long id){
        gestionUsuarioUseCase.eliminarUsuarioBd(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizarUsuario(@RequestBody Usuario usuario, @PathVariable Long id){
        Usuario usuarioNuevo = gestionUsuarioUseCase.encontrarUsuarioBd(id);
        usuarioNuevo.setNombre(usuario.getNombre());
        usuarioNuevo.setEmail(usuario.getEmail());
        usuarioNuevo.setPassword(usuario.getPassword());
        return ResponseEntity.status(HttpStatus.CREATED).body(gestionUsuarioUseCase.creacionUsuarioBd(usuarioNuevo));


    }
}
