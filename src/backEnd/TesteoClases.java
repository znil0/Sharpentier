/* @author Rojano Meza Leonardo Gael & Silva Chairez Sergio de Jesús | 5A */

// Esta clase es solo para el testeo de las demás clases.

package backEnd;

import java.util.Date;

public class TesteoClases {
    public static void main(String[] args){
        
        // TESTEO DE LOS CONSTRUCTORES
        System.out.println("\nClase CepaBacteriana:");
        CepaBacteriana cepaBacteriana = new CepaBacteriana(
                0, 
                "E. Coli", 
                10.2F, 
                123, 
                350, 
                "Redonda", 
                "Alta", 
                "Grueso");
        
        System.out.println(cepaBacteriana.toString());
        
        
        
        System.out.println("\nClase Cultivo:");
        Cultivo cultivo = new Cultivo(
                0,
                "Cultivo de E. Coli",
                "Este cultivo es (etc)",
                new Date(),
                true,
                new Medio(),
                cepaBacteriana,
                null
        );
        
        System.out.println(cultivo.toString());
        
        
        // TESTEO DEL SISTEMA DE NOTAS
        
        Nota nota1 = new Nota(
                0,
                new Date(),
                "Comentario",
                (byte) 0,
                "Prueba",
                "Hola!! Esta es una prueba para el sistema de notas y la herencia. (:"
        );
        
        Nota nota2 = new Nota(
                1,
                new Date(),
                "Comentario",
                (byte) 0,
                "Segunda prueba (:",
                "Hola otra vez, esta es otra prueba."
        );
        
        cultivo.addNota(nota1);
        cultivo.addNota(nota2);
        
        System.out.println(cultivo.getSpecificNota(0));
        System.out.println(cultivo.getSpecificNota());
        
        cultivo.cleanNotas();
        //cultivo.deleteNota(0);
        
        System.out.println(cultivo.getSpecificNota());
    }
}
