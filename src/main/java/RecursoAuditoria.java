import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.reactive.RestResponse;

public class RecursoAuditoria {

    RepositorioAuditoria repo = new RepositorioAuditoria();
    Validador validador = new Validador();

    @POST
    public RestResponse<Registro> guardarRegistro(Registro registro) {
        try {
            validador.validar(registro);
        } catch (ParametroIncorrecto error) {
            throw new WebApplicationException(Response.status(400).entity(error.getMessage()).build());
        }
        repo.persist(registro);
        return RestResponse.ResponseBuilder.ok(registro, MediaType.APPLICATION_JSON).build();
    }

    @GET
    public Registro obtenerRegistro(long idRegistro) {
        var registroBuscado = repo.findById(idRegistro);
        if (registroBuscado != null) {
            return registroBuscado;
        }
        throw new WebApplicationException(Response.status(404).entity("Auditoria no encontrada.").build());
    }
}