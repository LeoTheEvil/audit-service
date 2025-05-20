import jakarta.enterprise.context.ApplicationScoped;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class RepositorioAuditoria implements PanacheRepository<Registro> {

}