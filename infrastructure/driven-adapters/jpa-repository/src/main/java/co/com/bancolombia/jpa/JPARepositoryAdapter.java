package co.com.bancolombia.jpa;

import co.com.bancolombia.jpa.helper.AdapterOperations;
import co.com.bancolombia.jpa.helper.Usuarios;
import co.com.bancolombia.model.usuario.Usuario;
import co.com.bancolombia.model.usuario.gateways.UsuarioRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JPARepositoryAdapter extends AdapterOperations<Usuario, Usuarios, Long, JPARepository>
implements UsuarioRepository
{

    public JPARepositoryAdapter(JPARepository repository, ObjectMapper mapper) {
         super(repository, mapper, x -> mapper.mapBuilder(x,Usuario.UsuarioBuilder.class).build());

    }

    @Override
    public Usuario addUsuario(Usuario usuario) {
        return super.save(usuario);
    }

    @Override
    public Usuario findUsuarioById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteUsuarioById(Long id){
        super.delete(id);

    }

    @Override
    public List<Usuario> listarUsuarios() {
        return super.findAll();
    }


}
