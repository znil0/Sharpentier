/* @author Rojano Meza Leonardo Gael & Silva Chairez Sergio de Jesús | 5A */


package backEnd;

import javax.swing.table.DefaultTableModel;

public class Biorreactor extends Comentable {
    
    // ATRIBUTOS
    private int idBiorreactor;
    private String nombre;
    private String tipo;
    private double capacidad;
    private String material;
    private byte estado; //Posibles valores: 1 = "Activo", 2 = "En mantenimiento", 3 = "Inactivo"
    
    
    
    // METODOS
    
    // --- CONSTRUCTORES
    
    // Constructor por defecto
    public Biorreactor() {
        this.idBiorreactor = 0;
        this.nombre = "";
        this.tipo = "";
        this.capacidad = 0;
        this.material = "";
        this.estado = 3;
    }    

    // Constructor parametrizado
    public Biorreactor(int idBiorreactor, String nombre, String tipo, double capacidad, String material, byte estado) {
        this.idBiorreactor = idBiorreactor;
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.material = material;
        this.estado = estado;
    }
    
    
    
    // --- GETTERS

    public int getIdBiorreactor() {
        return idBiorreactor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public String getMaterial() {
        return material;
    }

    public byte getEstado() {
        return estado;
    }
    
    
    
    // --- SETTERS

    public void setIdBiorreactor(int idBiorreactor) {
        this.idBiorreactor = idBiorreactor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }
    
    
    
    // --- TO STRING

    @Override
    public String toString() {
        return "Biorreactor{" + "idBiorreactor=" + idBiorreactor + ", nombre=" + nombre + ", tipo=" + tipo + ", capacidad=" + capacidad + ", material=" + material + ", estado=" + estado + '}';
    }
    
    
    
    // --- METODOS PROPIOS
    
    public DefaultTableModel generateDTModelTemplate() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Tipo");
        model.addColumn("Capacidad");
        model.addColumn("Material");
        model.addColumn("Estado");
        return model;
    }
}
