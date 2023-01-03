package co.com.bancolombia.model.usuario.gateways;

import co.com.bancolombia.model.usuario.Usuario;

public interface UsuarioRepository {

    Usuario addUsuario(Usuario usuario);

    Usuario findUsuarioById(Long id);


}
