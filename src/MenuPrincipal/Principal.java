/*
 * Acá colocaré el método main para la ejecución del programa/juego del siguiente proyecto - parcial dos ciclo 01/2018
 */
package MenuPrincipal;
import fabricaAbstracta.AbstractFactory;
import fabricaAbstracta.FactoryProducer;
import fabricaOrcos.Orcos;
import java.util.Scanner;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class Principal {
    //String SeleccionRaza;                 OJO: SI LO PONGO AFUERA ME PIDEN QUE SEAN ESTÁTICOS
    //Scanner SR = new Scanner(System.in);
    
    //Método main para la ejecución de mi videojuego.
    public static void main(String[] args) {
        System.out.println("Bienvenido al juego JOSUE'S WORLD");
        AbstractFactory f;
        //---------------------------------- atributos opcion scanner
        String SeleccionRaza;
        Scanner SR = new Scanner(System.in);            //Puedo usar método equalsignorecase para no importa si lo escribió 
        //------------------------
        System.out.println("Ingrese el nombre la raza con la raza con la que desea jugar: ");
        SeleccionRaza = SR.nextLine();
        f = FactoryProducer.getFactory(SeleccionRaza); //Se debe escribir RazaOrco pa ke fururle
        Orcos o1 = f.getOrco("orcoNormal");
        Orcos o2 = f.getOrco("superTroll");
        
        /* ---AHORITA ESTO QUEDA PENDIENTE...
        o1.atacar(); //Implementación de la factory de manera quemada...  
        o2.atacar();
        */
        o1.menuJuego();
    }
    
}
