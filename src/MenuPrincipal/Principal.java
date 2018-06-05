/*
 * Acá colocaré el método main para la ejecución del programa/juego del siguiente proyecto - parcial dos ciclo 01/2018
 */
package MenuPrincipal;
import fabricaAbstracta.AbstractFactory;
import fabricaAbstracta.FactoryProducer;
import fabricaOrcos.Orcos;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class Principal {
    
    //Método main para la ejecución de mi videojuego.
    public static void main(String[] args) {
        System.out.println("Por el momento, solo imprimirá esto");
        AbstractFactory f;
        
        f = FactoryProducer.getFactory("RazaOrco");
        Orcos o1 = f.getOrco("orcoNormal");
        Orcos o2 = f.getOrco("superTroll");
        
        o1.atacar(); //Implementación de la factory de manera quemada...  
        o2.atacar();
    }
    
}
