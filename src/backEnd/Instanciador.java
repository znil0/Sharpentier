/* @author Rojano Meza Leonardo Gael & Silva Chairez Sergio de Jesús | 5A */


/*  ESTA CLASE AUXILIAR SE ELIMINARÁ EN LA VERSIÓN FINAL DEL PROGRAMA.

    Normalmente, el usuario debería crear la clase mediante los formularios
    y el programa debería almacenar dichos datos para su uso posterior en otros
    formularios. Sin embargo, aún no tenemos los conocimientos para almacenar
    datos en el disco duro de la computadora ni para compartir las instancias de
    las clases entre los formularios.

    Así que para poder instanciar las clases sin necesidad de otros formularios,
    esta clase utiliza la librería swing de Java para obtener los atributos
    mediante los métodos showInputDialog(), y acto seguido instanciar las clases
    y retornarlas mediante los métodos que se muestran a continuación.
*/

package backEnd;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static javax.swing.JOptionPane.*;

public class Instanciador {
    
    // SOBRECARGA 1: INSTANCIAR UN BIORREACTOR SIN NÚMERO
    public Biorreactor instanciarBiorreactor(){
        // OBTENCION DE LOS ATRIBUTOS
        int idBiorreactor = Integer.parseInt(showInputDialog("ID del Biorreactor: "));
        String nombre = showInputDialog("Nombre del Biorreactor: ");
        String tipo = showInputDialog("Tipo del Biorreactor: ");
        double capacidad = Double.parseDouble(showInputDialog("Capacidad del Biorreactor: "));
        String material = showInputDialog("Material del Biorreactor: ");
        byte estado = Byte.parseByte(showInputDialog("Estado del Biorreactor (1=Activo, 2=En mantenimiento, 3=Inactivo):"));
        
        // RETORNO CON LA CLASE INSTANCIADA
        return new Biorreactor(idBiorreactor, nombre, tipo, capacidad, material, estado);
    }
    
    // SOBRECARGA 2: INSTANCIAR UN BIORREACTOR CON NÚMERO
    public Biorreactor instanciarBiorreactor(int index){
        // OBTENCION DE LOS ATRIBUTOS
        int idBiorreactor = Integer.parseInt(showInputDialog("ID del Biorreactor " + index + ": "));
        String nombre = showInputDialog("Nombre del Biorreactor " + index + ": ");
        String tipo = showInputDialog("Tipo del Biorreactor: ");
        double capacidad = Double.parseDouble(showInputDialog("Capacidad del Biorreactor " + index + ": "));
        String material = showInputDialog("Material del Biorreactor " + index + ": ");
        byte estado = Byte.parseByte(showInputDialog("Estado del Biorreactor " + index + " (1=Activo, 2=En mantenimiento, 3=Inactivo):"));
        
        // RETORNO CON LA CLASE INSTANCIADA
        return new Biorreactor(idBiorreactor, nombre, tipo, capacidad, material, estado);
    }
    
    
    
    // SOBRECARGA 1: INSTANCIAR UNA CEPA BACTERIANA SIN NÚMERO
    public CepaBacteriana instanciarCepaBacteriana(){
        // OBTENCION DE LOS ATRIBUTOS
        int idBacteria = Integer.parseInt(showInputDialog("ID de la Cepa Bacteriana: "));
        String nombreBacteria = showInputDialog("Nombre de la Cepa Bacteriana: ");
        float temperatura = Float.parseFloat(showInputDialog("Temperatura de la Cepa Bacteriana: "));
        float humedad = Float.parseFloat(showInputDialog("Humedad de la Cepa Bacteriana: "));
        int tiempoIncubacion = Integer.parseInt(showInputDialog("Tiempo de Incubación de la Cepa Bacteriana: "));
        String morfologiaColonial = showInputDialog("Morfología Colonial de la Cepa Bacteriana: ");
        String tasaCrecimiento = showInputDialog("Tasa de Crecimiento de la Cepa Bacteriana: ");
        String densidadOptica = showInputDialog("Densidad Optica de la Cepa Bacteriana: ");
    
        // RETORNO CON LA CLASE INSTANCIADA
        return new CepaBacteriana(idBacteria, nombreBacteria, temperatura, humedad, tiempoIncubacion, morfologiaColonial, tasaCrecimiento, densidadOptica); 
    }
    
    // SOBRECARGA 2: INSTANCIAR UNA CEPA BACTERIANA CON NÚMERO
    public CepaBacteriana instanciarCepaBacteriana(int index){
        // OBTENCION DE LOS ATRIBUTOS
        int idBacteria = Integer.parseInt(showInputDialog("ID de la Cepa Bacteriana " + index + ": "));
        String nombreBacteria = showInputDialog("Nombre de la Cepa Bacteriana " + index + ": ");
        float temperatura = Float.parseFloat(showInputDialog("Temperatura de la Cepa Bacteriana " + index + ": "));
        float humedad = Float.parseFloat(showInputDialog("Humedad de la Cepa Bacteriana " + index + ": "));
        int tiempoIncubacion = Integer.parseInt(showInputDialog("Tiempo de Incubación de la Cepa Bacteriana " + index + ": "));
        String morfologiaColonial = showInputDialog("Morfología Colonial de la Cepa Bacteriana " + index + ": ");
        String tasaCrecimiento = showInputDialog("Tasa de Crecimiento de la Cepa Bacteriana " + index + ": ");
        String densidadOptica = showInputDialog("Densidad Optica de la Cepa Bacteriana " + index + ": ");
    
        // RETORNO CON LA CLASE INSTANCIADA
        return new CepaBacteriana(idBacteria, nombreBacteria, temperatura, humedad, tiempoIncubacion, morfologiaColonial, tasaCrecimiento, densidadOptica); 
    }
    
    
    
    // SOBRECARGA 1: INSTANCIAR UN CULTIVO SIN NÚMERO
    public Cultivo instanciarCultivo() {
        // OBTENCION DE LOS ATRIBUTOS
        int idCultivo = Integer.parseInt(showInputDialog("ID del Cultivo: "));
        String nombreCultivo = showInputDialog("Nombre del Cultivo: ");
        String descripcionCultivo = showInputDialog("Descripcion del Cultivo: ");
        Date fechaCreacion = new Date();
        boolean activo = Boolean.parseBoolean(showInputDialog("Activo? (false=NO, true=SI): "));
        Medio medio = new Medio();
        CepaBacteriana cepaBacteriana = new CepaBacteriana();
        List<Empleado> listaEmpleados = new ArrayList<Empleado>();
        
        // RETORNO CON LA CLASE INSTANCIADA
        return new Cultivo(idCultivo, nombreCultivo, descripcionCultivo, fechaCreacion, activo, medio, cepaBacteriana, listaEmpleados);
    }
    
    // SOBRECARGA 2: INSTANCIAR UN CULTIVO CON NÚMERO
    public Cultivo instanciarCultivo(int index) {
        // OBTENCION DE LOS ATRIBUTOS
        int idCultivo = Integer.parseInt(showInputDialog("ID del Cultivo " + index + ": "));
        String nombreCultivo = showInputDialog("Nombre del Cultivo " + index + ": ");
        String descripcionCultivo = showInputDialog("Descripcion del Cultivo " + index + ": ");
        Date fechaCreacion = new Date();
        boolean activo = Boolean.parseBoolean(showInputDialog("Activo? (false=NO, true=SI): "));
        Medio medio = new Medio();
        CepaBacteriana cepaBacteriana = new CepaBacteriana();
        List<Empleado> listaEmpleados = new ArrayList<Empleado>();
        
        // RETORNO CON LA CLASE INSTANCIADA
        return new Cultivo(idCultivo, nombreCultivo, descripcionCultivo, fechaCreacion, activo, medio, cepaBacteriana, listaEmpleados);
    }
    
    
    
    // SOBRECARGA 1: INSTANCIAR UN EMPLEADO SIN NÚMERO
    public Empleado instanciarEmpleado() {
        // OBTENCION DE LOS ATRIBUTOS
        int idEmpleado = Integer.parseInt(showInputDialog("ID del Empleado: "));
        String nombre = showInputDialog("Nombre del Empleado: ");
        String cedulaProfesional = showInputDialog("Cedula Profesional: ");
        String CURP = showInputDialog("CURP del Empleado: ");
        String RFC = showInputDialog("RFC del Empleado: ");
        
        // RETORNO CON LA CLASE INSTANCIADA
        return new Empleado(idEmpleado, nombre, cedulaProfesional, CURP, RFC);
    }
    
    // SOBRECARGA 2: INSTANCIAR UN EMPLEADO CON NÚMERO
    public Empleado instanciarEmpleado(int index) {
        // OBTENCION DE LOS ATRIBUTOS
        int idEmpleado = Integer.parseInt(showInputDialog("ID del Empleado " + index + ": "));
        String nombre = showInputDialog("Nombre del Empleado " + index + ": ");
        String cedulaProfesional = showInputDialog("Cedula Profesional " + index + ": ");
        String CURP = showInputDialog("CURP del Empleado " + index + ": ");
        String RFC = showInputDialog("RFC del Empleado " + index + ": ");
        
        // RETORNO CON LA CLASE INSTANCIADA
        return new Empleado(idEmpleado, nombre, cedulaProfesional, CURP, RFC);
    }
    
    
    
    // SOBRECARGA 1: INSTANCIAR UNA ENZIMA SIN NÚMERO
    public Enzima instanciarEnzima() {
        // OBTENCION DE LOS ATRIBUTOS
        int idEnzima = Integer.parseInt(showInputDialog("ID de la Enzima: "));
        String nombreEnzima = showInputDialog("Nombre de la Enzima: ");
        String tipoEnzima = showInputDialog("Tipo de Enzima: ");
        
        // RETORNO CON LA CLASE INSTANCIADA
        return new Enzima(idEnzima, nombreEnzima, tipoEnzima);
    }
    
    // SOBRECARGA 2: INSTANCIAR UNA ENZIMA CON NÚMERO
    public Enzima instanciarEnzima(int index) {
        // OBTENCION DE LOS ATRIBUTOS
        int idEnzima = Integer.parseInt(showInputDialog("ID de la Enzima " + index + ": "));
        String nombreEnzima = showInputDialog("Nombre de la Enzima " + index + ": ");
        String tipoEnzima = showInputDialog("Tipo de Enzima " + index + ": ");
        
        // RETORNO CON LA CLASE INSTANCIADA
        return new Enzima(idEnzima, nombreEnzima, tipoEnzima);
    }
    
    
    
    // SOBRECARGA 1: INSTANCIAR UN MEDIO SIN NÚMERO
    public Medio instanciarMedio() {
        // OBTENCION DE LOS ATRIBUTOS
        int idMedio = Integer.parseInt(showInputDialog("ID del Medio: "));
        String composicion = showInputDialog("Composicion del Medio: ");
        float pHMedio = Float.parseFloat(showInputDialog("PH del Medio: "));
        float temperatura = Float.parseFloat(showInputDialog("Temperatura del Medio: "));
        
        // RETORNO CON LA CLASE INSTANCIADA
        return new Medio(idMedio, composicion, pHMedio, temperatura);
    }
    
    // SOBRECARGA 2: INSTANCIAR UN MEDIO CON NÚMERO
    public Medio instanciarMedio(int index) {
        // OBTENCION DE LOS ATRIBUTOS
        int idMedio = Integer.parseInt(showInputDialog("ID del Medio " + index + ": "));
        String composicion = showInputDialog("Composicion del Medio " + index + ": ");
        float pHMedio = Float.parseFloat(showInputDialog("PH del Medio " + index + ": "));
        float temperatura = Float.parseFloat(showInputDialog("Temperatura del Medio " + index + ": "));
        
        // RETORNO CON LA CLASE INSTANCIADA
        return new Medio(idMedio, composicion, pHMedio, temperatura);
    }
    
    
    
    // SOBRECARGA 1: INSTANCIAR UNA NOTA SIN NÚMERO
    public Nota instanciarNota(){
        // OBTENCION DE LOS ATRIBUTOS
        int idObservacion = Integer.parseInt(showInputDialog("ID de la Nota: "));
        Date fechaCreacion = new Date();
        String tipoNota = showInputDialog("Tipo de Nota: ");
        byte importancia = Byte.parseByte(showInputDialog("Importancia de la Nota (0-100): ")); //Cuanto mayor sea el número, mayor es la importancia
        String asunto = showInputDialog("Asunto de la Nota: ");
        String contenido = showInputDialog("Contenido de la Nota: ");
        
        // RETORNO CON LA CLASE INSTANCIADA
        return new Nota(idObservacion, fechaCreacion, tipoNota, importancia, asunto, contenido);
    }
    
    // SOBRECARGA 2: INSTANCIAR UNA NOTA CON NÚMERO
    public Nota instanciarNota(int index){
        // OBTENCION DE LOS ATRIBUTOS
        int idObservacion = Integer.parseInt(showInputDialog("ID de la Nota " + index + ": "));
        Date fechaCreacion = new Date();
        String tipoNota = showInputDialog("Tipo de Nota " + index + ": ");
        byte importancia = Byte.parseByte(showInputDialog("Importancia de la Nota " + index + " (0-100): ")); //Cuanto mayor sea el número, mayor es la importancia
        String asunto = showInputDialog("Asunto de la Nota " + index + ": ");
        String contenido = showInputDialog("Contenido de la Nota " + index + ": ");
        
        // RETORNO CON LA CLASE INSTANCIADA
        return new Nota(idObservacion, fechaCreacion, tipoNota, importancia, asunto, contenido);
    }
}
