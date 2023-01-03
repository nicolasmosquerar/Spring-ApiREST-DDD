package co.com.bancolombia.jpa;

import co.com.bancolombia.jpa.helper.Usuarios;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<Usuarios, Long>, QueryByExampleExecutor<Usuarios> {
}
