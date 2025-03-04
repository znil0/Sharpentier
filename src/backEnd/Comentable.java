/* @author Rojano Meza Leonardo Gael & Silva Chairez Sergio de Jesús | 5A */


package backEnd;

import java.util.ArrayList;
import java.util.List;

public class Comentable {
    /*
    NOTA IMPORTANTE: Esta es una superclase que engloba todas las demás del
    backEnd, esta permite heredarles los métodos y atributos necesarios para
    permitir la función de las notas, cuya existencia es común entre todos los
    objetos.
    
    Es por ello que no es necesario crear un JFrame para la misma, ya que es
    solo una clase auxiliar.
    */
    
    // ATRIBUTOS
    private List <Nota> notas;
    
    
    
    // METODOS
    
    // --- CONSTRUCTORES
    
    // Constructor por defecto
    public Comentable() {
        this.notas = new ArrayList<Nota>();
    }
    
    
    
    // --- SETTERS
    
    public void setNotas(List <Nota> notas){
        this.notas = notas;
    }
    
    
    
    // --- GETTERS

    public List<Nota> getNotas() {
        return notas;
    }
    
    
    
    // --- METODOS PROPIOS
    
    // Método que añade una nota a la lista de notas
    public void addNota(Nota nota){
        notas.add(nota);
    }
    
    // Método que elimina todas las notas del objeto
    public void cleanNotas(){
        notas.clear();
    }
    
    // Método que elimina una sola nota del objeto
    public void deleteNota(int index){
        notas.remove(index);
    }
    
    // Primera sobrecarga del método getSpecificNota()
    // Este método retorna la última nota ingresada en el objeto.
    public Nota getSpecificNota(){
        Nota notaEncontrada;
                
        try{
            notaEncontrada = this.notas.get(this.notas.size() - 1);
        } catch(Exception e) {
            notaEncontrada = new Nota();
        }
        return notaEncontrada;
    }
    
    // Segunda sobrecarga del método getSpecificNota()
    // Este método retorna la enésima nota ingresada en el objeto.
    public Nota getSpecificNota(int index){
        Nota notaEncontrada;
        
        try{
            notaEncontrada = this.notas.get(index);
        } catch (Exception e) {
            notaEncontrada = new Nota();
        }
        
        return notaEncontrada;
    }
}
