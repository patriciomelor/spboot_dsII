package cl.ipss.apilincesgrupo09.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "Practica")
public class Practica {

    @Id
    private String id;
    private String nombre_practica;
    private String empresa;
    private Date fecha_inicio;
    private Date fecha_fin;
    private String descripcion;
    private String jefeDirecto;  // Agregar campo

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre_practica() {
        return nombre_practica;
    }

    public void setNombre_practica(String nombre_practica) {
        this.nombre_practica = nombre_practica;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getJefeDirecto() {
        return jefeDirecto;
    }

    public void setJefeDirecto(String jefeDirecto) {
        this.jefeDirecto = jefeDirecto;
    }
}
