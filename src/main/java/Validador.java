public class Validador {
    public void validar(Registro registro) {
        if (registro.getTimestamp() < 1) {
            throw new ParametroIncorrecto("Timestamp no valido");
        }
        if (registro.getResponsable().isBlank()) {
            throw new ParametroIncorrecto("El responsable no puede ser vacio.");
        }
        if (registro.getProcessId() < 1) {
            throw new ParametroIncorrecto("Process Id no valido");
        }
        if (registro.getDescription().isBlank()) {
            throw new ParametroIncorrecto("La descripcion no puede ser vacia.");
        }
        if (registro.getType().isBlank()) {
            throw new ParametroIncorrecto("El tipo no puede ser vacio.");
        }
        if (registro.getData().isBlank()) {
            throw new ParametroIncorrecto("La data no puede ser vacia.");
        }
    }
}