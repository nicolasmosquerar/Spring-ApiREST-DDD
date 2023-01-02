package co.com.bancolombia.api;
import co.com.bancolombia.model.usuario.Usuario;
import co.com.bancolombia.usecase.gestionusuario.GestionUsuarioUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {

    private final GestionUsuarioUseCase gestionUsuarioUseCase;


    @GetMapping(path = "/buscarUsuario/{id}")
    public Usuario commandName(@PathVariable Long id) {
        return gestionUsuarioUseCase.encontrarUsuarioBd(id);

    }

    @PostMapping
    public Usuario agregarUser(@RequestBody Usuario usuario){
        return gestionUsuarioUseCase.creacionUsuarioBd(usuario);
    }
}
