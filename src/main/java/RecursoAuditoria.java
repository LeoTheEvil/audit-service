import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.reactive.RestResponse;

@Path("/auditoria")
@Transactional
public class RecursoAuditoria {

    RepositorioAuditoria repo = new RepositorioAuditoria();
    Validador validador = new Validador();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
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
    @Path("/{idRegistro}")
    @Produces(MediaType.APPLICATION_JSON)
    public Registro obtenerRegistro(@PathParam("idRegistro") long idRegistro) {
        var registroBuscado = repo.findById(idRegistro);
        if (registroBuscado != null) {
            return registroBuscado;
        }
        throw new WebApplicationException(Response.status(404).entity("Auditoria no encontrada.").build());
    }
}