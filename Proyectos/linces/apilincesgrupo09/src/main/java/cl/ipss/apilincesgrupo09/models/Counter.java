package cl.ipss.apilincesgrupo09.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "counters")
public class Counter {

    @Id
    private String id;  // El nombre de la secuencia (e.g., "practica_sequence")
    private int seq;    // Valor del contador
     // Getters y Setters
     public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }
}