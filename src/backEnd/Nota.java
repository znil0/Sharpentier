/* @author Rojano Meza Leonardo Gael & Silva Chairez Sergio de Jesús | 5A */


package backEnd;

import java.util.Date;

public class Nota {
    
    // ATRIBUTOS
    private int idObservacion;
    private Date fechaCreacion;
    private String tipoNota;
    private byte importancia; //Cuanto mayor sea el número, mayor es la importancia
    private String asunto;
    private String contenido;
    
    
    
    // METODOS
    
    // --- CONSTRUCTORES
    
    // Constructor por defecto
    public Nota(){
        this.idObservacion = 0;
        this.fechaCreacion = new Date();
        this.tipoNota = "";
        this.importancia = 0;
        this.asunto = "Nota vacía";
        this.contenido = "";
    }
    
    // Constructor parametrizado
    public Nota(int idObservacion, Date fechaCreacion, String tipoNota, byte importancia, String asunto, String contenido) {
        this.idObservacion = idObservacion;
        this.fechaCreacion = fechaCreacion;
        this.tipoNota = tipoNota;
        this.importancia = importancia;
        this.asunto = asunto;
        this.contenido = contenido;
    }
    
    
    
    // --- GETTERS

    public int getIdObservacion() {
        return idObservacion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public String getTipoObservacion() {
        return tipoNota;
    }

    public int getImportancia() {
        return importancia;
    }
    
    public String getAsunto() {
        return asunto;
    }

    public String getContenido() {
        return contenido;
    }
    
    
    
    // --- SETTERS

    public void setIdObservacion(int idObservacion) {
        this.idObservacion = idObservacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setTipoObservacion(String tipoNota) {
        this.tipoNota = tipoNota;
    }

    public void setImportancia(byte importancia) {
        this.importancia = importancia;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    
    
    // --- TO STRING

    @Override
    public String toString() {
        return "Nota{" + "idObservacion=" + idObservacion + ", fechaCreacion=" + fechaCreacion + ", tipoNota=" + tipoNota + ", importancia=" + importancia + ", asunto=" + asunto + ", contenido=" + contenido + '}';
    }
    
    
    
    // --- METODOS PROPIOS

    
    
    
}
