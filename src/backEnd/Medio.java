/* @author Rojano Meza Leonardo Gael & Silva Chairez Sergio de Jesús | 5A */


package backEnd;

import javax.swing.table.DefaultTableModel;

public class Medio extends Comentable {
    
    // ATRIBUTOS
    private int idMedio;
    private String composicion;
    private float pHMedio;
    private float temperatura;
    
    
    
    // METODOS
    
    // --- CONSTRUCTORES
    
    // Constructor por defecto
    public Medio() {
        this.idMedio = 0;
        this.composicion = "";
        this.pHMedio = 0;
        this.temperatura = 0;
    }
    
    // Constructor parametrizado
    public Medio(int idMedio, String composicion, float pHMedio, float temperatura) {
        this.idMedio = idMedio;
        this.composicion = composicion;
        this.pHMedio = pHMedio;
        this.temperatura = temperatura;
    }
    
    
    
    
    // --- GETTERS

    public int getIdMedio() {
        return idMedio;
    }

    public String getComposicion() {
        return composicion;
    }

    public float getPHMedio() {
        return pHMedio;
    }

    public float getTemperatura() {
        return temperatura;
    }
    
    
    
    // --- SETTERS

    public void setIdMedio(int idMedio) {
        this.idMedio = idMedio;
    }

    public void setComposicion(String composicion) {
        this.composicion = composicion;
    }

    public void setpHMedio(float pHMedio) {
        this.pHMedio = pHMedio;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
    
    
    
    // --- TO STRING

    @Override
    public String toString() {
        return "Medio{" + "idMedio=" + idMedio + ", composicion=" + composicion + ", pHMedio=" + pHMedio + ", temperatura=" + temperatura + '}';
    }
    
    
    
    // --- METODOS PROPIOS

    public DefaultTableModel generateDTModelTemplate() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Composicion");
        model.addColumn("PH Medio");
        model.addColumn("Temperatura");
        return model;
    }
}
