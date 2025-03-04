/* @author Rojano Meza Leonardo Gael & Silva Chairez Sergio de Jesús | 5A */


package backEnd;

import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Cultivo extends Comentable {
    
    // ATRIBUTOS
    private int idCultivo;
    private String nombreCultivo;
    private String descripcionCultivo;
    private Date fechaCreacion;
    private boolean activo;
    private Medio medio;
    private CepaBacteriana cepaBacteriana;
    private List<Empleado> listaEmpleados;
    
    
    
    // METODOS
    
    // --- CONSTRUCTORES
    
    // Constructor por defecto
    public Cultivo(){
        // Esta línea llama al constructor de la superclase, aquí lo llamo para
        // inicializar la lista de notas mediante el constructor de la clase Comentable.
        super();
        this.idCultivo = 0;
        this.nombreCultivo = "";
        this.descripcionCultivo = "";
        this.fechaCreacion = new Date();
        this.activo = false;
        this.medio = new Medio();
        this.cepaBacteriana = new CepaBacteriana();
    }
    
    //Constructor parametrizado
    public Cultivo(int idCultivo, String nombreCultivo, String descripcionCultivo,
            Date fechaCreacion, boolean activo, Medio medio,
            CepaBacteriana cepaBacteriana, List<Empleado> listaEmpleados) {
        super();
        this.idCultivo = idCultivo;
        this.nombreCultivo = nombreCultivo;
        this.descripcionCultivo = descripcionCultivo;
        this.fechaCreacion = fechaCreacion;
        this.activo = activo;
        this.medio = medio;
        this.cepaBacteriana = cepaBacteriana;
        this.listaEmpleados = listaEmpleados;
    }
    
    
    
    // --- GETTERS

    public int getIdCultivo() {
        return idCultivo;
    }

    public String getNombreCultivo() {
        return nombreCultivo;
    }

    public String getDescripcionCultivo() {
        return descripcionCultivo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public boolean isActivo() {
        return activo;
    }

    public Medio getMedio() {
        return medio;
    }

    public CepaBacteriana getCepaBacteriana() {
        return cepaBacteriana;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
    
    
    
    // --- SETTERS

    public void setIdCultivo(int idCultivo) {
        this.idCultivo = idCultivo;
    }

    public void setNombreCultivo(String nombreCultivo) {
        this.nombreCultivo = nombreCultivo;
    }

    public void setDescripcionCultivo(String descripcionCultivo) {
        this.descripcionCultivo = descripcionCultivo;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setMedio(Medio medio) {
        this.medio = medio;
    }

    public void setCepaBacteriana(CepaBacteriana cepaBacteriana) {
        this.cepaBacteriana = cepaBacteriana;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    
    
    
    // --- TO STRING

    @Override
    public String toString() {
        return "Cultivo{" + "idCultivo=" + idCultivo + ", nombreCultivo=" + nombreCultivo + ", descripcionCultivo=" + descripcionCultivo + ", fechaCreacion=" + fechaCreacion + ", activo=" + activo + ", medio=" + medio + ", cepaBacteriana=" + cepaBacteriana + ", listaEmpleados=" + listaEmpleados + '}';
    }
    
    
    
    // --- METODOS PROPIOS

    public DefaultTableModel generateDTModelTemplate() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Descripcion");
        model.addColumn("Fecha");
        model.addColumn("Activo");
        return model;
    }
}
