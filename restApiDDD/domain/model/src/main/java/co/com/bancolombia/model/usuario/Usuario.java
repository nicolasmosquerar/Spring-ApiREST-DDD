package co.com.bancolombia.model.usuario;
import lombok.*;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Usuario {

    private Long id;
    private String nombre;
    private String email;
    private String password;
}
