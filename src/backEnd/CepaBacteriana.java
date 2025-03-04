/* @author Rojano Meza Leonardo Gael & Silva Chairez Sergio de Jesús | 5A */


package backEnd;

import javax.swing.table.DefaultTableModel;

public class CepaBacteriana extends Comentable {
    
    // ATRIBUTOS
    private int idBacteria;
    private String nombreBacteria;
    private float temperatura;
    private float humedad;
    private int tiempoIncubacion;
    private String morfologiaColonial;
    private String tasaCrecimiento;
    private String densidadOptica;
    
    
    
    // METODOS
    
    // --- CONSTRUCTORES
    
    // Constructor por defecto
    public CepaBacteriana(){
        this.idBacteria = 0;
        this.nombreBacteria = "";
        this.temperatura = 0;
        this.humedad = 0;
        this.tiempoIncubacion = 0;
        this.morfologiaColonial = "";
        this.tasaCrecimiento = "";
        this.densidadOptica = "";
    }
    
    // Constructor parametrizado
    public CepaBacteriana(int idBacteria, String nombreBacteria, float temperatura,
            float humedad, int tiempoIncubacion, String morfologiaColonial,
            String tasaCrecimiento, String densidadOptica){
        this.idBacteria = idBacteria;
        this.nombreBacteria = nombreBacteria;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.tiempoIncubacion = tiempoIncubacion;
        this.morfologiaColonial = morfologiaColonial;
        this.tasaCrecimiento = tasaCrecimiento;
        this.densidadOptica = densidadOptica;
    }
    
    
    
    // --- GETTERS

    public int getIdBacteria() {
        return idBacteria;
    }

    public String getNombreBacteria() {
        return nombreBacteria;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public float getHumedad() {
        return humedad;
    }

    public int getTiempoIncubacion() {
        return tiempoIncubacion;
    }

    public String getMorfologiaColonial() {
        return morfologiaColonial;
    }

    public String getTasaCrecimiento() {
        return tasaCrecimiento;
    }

    public String getDensidadOptica() {
        return densidadOptica;
    }
    
    
    
    // --- SETTERS

    public void setIdBacteria(int idBacteria) {
        this.idBacteria = idBacteria;
    }

    public void setNombreBacteria(String nombreBacteria) {
        this.nombreBacteria = nombreBacteria;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }

    public void setTiempoIncubacion(int tiempoIncubacion) {
        this.tiempoIncubacion = tiempoIncubacion;
    }

    public void setMorfologiaColonial(String morfologiaColonial) {
        this.morfologiaColonial = morfologiaColonial;
    }

    public void setTasaCrecimiento(String tasaCrecimiento) {
        this.tasaCrecimiento = tasaCrecimiento;
    }

    public void setDensidadOptica(String densidadOptica) {
        this.densidadOptica = densidadOptica;
    }
    
    
    
    // --- TO STRING

    @Override
    public String toString() {
        return "CepaBacteriana{" + "idBacteria=" + idBacteria + ", nombreBacteria=" + nombreBacteria + ", temperatura=" + temperatura + ", humedad=" + humedad + ", tiempoIncubacion=" + tiempoIncubacion + ", morfologiaColonial=" + morfologiaColonial + ", tasaCrecimiento=" + tasaCrecimiento + ", densidadOptica=" + densidadOptica + '}';
    }
    
    
    
    // --- METODOS PROPIOS
    
    public DefaultTableModel generateDTModelTemplate() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Temperatura");
        model.addColumn("Humedad");
        model.addColumn("Tiempo de Incubacion");
        model.addColumn("Morfologia Colonial");
        model.addColumn("Tasa de Crecimiento");
        model.addColumn("Densidad Optica");
        return model;
    }
}
