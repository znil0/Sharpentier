/* @author Rojano Meza Leonardo Gael & Silva Chairez Sergio de Jesús | 5A */


package backEnd;

import javax.swing.table.DefaultTableModel;

public class Empleado {
    
    // ATRIBUTOS
    private int idEmpleado;
    private String nombre;
    private String cedulaProfesional;
    private String CURP;
    private String RFC;
    
    
    
    // METODOS
    
    // --- CONSTRUCTORES
    
    // Constructor por defecto
    public Empleado(){
        this.idEmpleado = 0;
        this.nombre = "";
        this.cedulaProfesional = "";
        this.CURP = "";
        this.RFC = "";
    }

    public Empleado(int idEmpleado, String nombre, String cedulaProfesional, String CURP, String RFC) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.cedulaProfesional = cedulaProfesional;
        this.CURP = CURP;
        this.RFC = RFC;
    }
    
    
    
    // --- GETTERS

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedulaProfesional() {
        return cedulaProfesional;
    }

    public String getCURP() {
        return CURP;
    }

    public String getRFC() {
        return RFC;
    }
    
    
    
    // --- SETTERS

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedulaProfesional(String cedulaProfesional) {
        this.cedulaProfesional = cedulaProfesional;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    
    
    
    // --- TO STRING

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idEmpleado + ", nombre=" + nombre + ", cedulaProfesional=" + cedulaProfesional + ", CURP=" + CURP + ", RFC=" + RFC + '}';
    }
    
    
    
    // --- METODOS PROPIOS
    
    public DefaultTableModel generateDTModelTemplate() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Cedula Profesional");
        model.addColumn("CURP");
        model.addColumn("RFC");
        return model;
    }
}
