/* @author Rojano Meza Leonardo Gael & Silva Chairez Sergio de Jesús | 5A */


package backEnd;

import javax.swing.table.DefaultTableModel;

public class Enzima {
    
    // ATRIBUTOS
    private int idEnzima;
    private String nombreEnzima;
    private String tipoEnzima;
    
    
    
    // METODOS
    
    // --- CONSTRUCTORES
    
    // Constructor por defecto
    public Enzima(){
        this.idEnzima = 0;
        this.nombreEnzima = "";
        this.tipoEnzima = "";
    }
    
    // Constructor parametrizado
    public Enzima(int idEnzima, String nombreEnzima, String tipoEnzima) {
        this.idEnzima = idEnzima;
        this.nombreEnzima = nombreEnzima;
        this.tipoEnzima = tipoEnzima;
    }
    
    
    
    // --- GETTERS

    public int getIdEnzima() {
        return idEnzima;
    }

    public String getNombreEnzima() {
        return nombreEnzima;
    }

    public String getTipoEnzima() {
        return tipoEnzima;
    }
    
    
    
    // --- SETTERS

    public void setIdEnzima(int idEnzima) {
        this.idEnzima = idEnzima;
    }

    public void setNombreEnzima(String nombreEnzima) {
        this.nombreEnzima = nombreEnzima;
    }

    public void setTipoEnzima(String tipoEnzima) {
        this.tipoEnzima = tipoEnzima;
    }
    
    
    
    // --- TO STRING

    @Override
    public String toString() {
        return "Enzima{" + "idEnzima=" + idEnzima + ", nombreEnzima=" + nombreEnzima + ", tipoEnzima=" + tipoEnzima + '}';
    }
    
    
    
    // --- METODOS PROPIOS
    
    public DefaultTableModel generateDTModelTemplate() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Tipo");
        return model;
    }
}
