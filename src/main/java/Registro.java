import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Map;

@Entity
public class Registro {

    @Id
    private long claveRegistro;
    private long timestamp;
    private String responsable;
    private long processId;
    private String description;
    private String type;
    private String data;

    public Registro() {

    }

    public Registro(long claveRegistro, long timestamp, String responsable, long processId, String description, String type, String data) {
        this.claveRegistro=claveRegistro;
        this.timestamp=timestamp;
        this.responsable=responsable;
        this.processId=processId;
        this.description=description;
        this.type=type;
        this.data=data;
    }

    @JsonProperty("claveRegistro")
    public long getClaveRegistro() {
        return claveRegistro;
    }

    public void setClaveRegistro(long claveRegistro) {
        this.claveRegistro=claveRegistro;
    }

    @JsonProperty("timestamp")
    public long getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(long timestamp) {
        this.timestamp=timestamp;
    }

    @JsonProperty("responsable")
    public String getResponsable() {
        return responsable;
    }
    public void setResponsable(String responsable) {
        this.responsable=responsable;
    }

    @JsonProperty("processId")
    public long getProcessId() {
        return processId;
    }
    public void setProcessId(long processId) {
        this.processId=processId;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description=description;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type=type;
    }

    @JsonProperty("data")
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data=data;
    }

    @Override
    public String toString() {
        return "Clave: " + claveRegistro + "Timestamp: " + timestamp + ", Responsable: " + responsable +
                ", Process Id: " + processId + "," + " Description: " + description + ", Type: " + type +
                "Data: " + data;
    }
}