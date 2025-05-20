import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;

import java.util.Map;

@Entity
public class Registro {

    private long timestamp;
    private String responsable;
    private long processId;
    private String description;
    private String type;
    private Map data;

    public Registro() {

    }

    public Registro(long timestamp, String responsable, long processId, String description, String type, Map data) {
        this.timestamp=timestamp;
        this.responsable=responsable;
        this.processId=processId;
        this.description=description;
        this.type=type;
        this.data=data;
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
    public Map getData() {
        return data;
    }
    public void setData(Map data) {
        this.data=data;
    }

    @Override
    public String toString() {
        return "Timestamp: " + timestamp + ", Responsable: " + responsable + ", Process Id: " + processId + "," +
                " Description: " + description + ", Type: " + type + "Data: " + data;
    }
}