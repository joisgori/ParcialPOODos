/*
 * Acá colocaré el método main para la ejecución del programa/juego del siguiente proyecto - parcial dos ciclo 01/2018
 */
package MenuPrincipal;
import fabricaAbstracta.AbstractFactory;
import fabricaAbstracta.FactoryProducer;
import fabricaEsqueletos.Esqueletos;
import fabricaEsqueletos.OpcionesParaJugadorDeEsqueletos;
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
        //FuncionesPrincipales.hola();
        AbstractFactory f;
        //---------------------------------- atributos opcion scanner
        String SeleccionRaza, SeleccionConstruccion;
        Scanner SR = new Scanner(System.in);            //Puedo usar método equalsignorecase para no importa si lo escribió 
        //------------------------
        System.out.println("Ingrese el nombre la raza con la raza con la que desea jugar: ");
        SeleccionRaza = SR.nextLine();
        f = FactoryProducer.getFactory(SeleccionRaza); //Se debe escribir RazaOrco pa ke fururle
        
        //A partir de acá debo pedir qué quiere edificar cada raza...
        Orcos o1 = f.getOrco("orcoNormal");
        Orcos o2 = f.getOrco("superTroll");
        
        /* ---AHORITA ESTO QUEDA PENDIENTE...
        o1.atacar(); //Implementación de la factory de manera quemada...  
        o2.atacar();
        */
        o1.menuJuego();
        
        //PARA LA SELECCION DE ESQUELETO
        System.out.println("Jugador 2, por favor coloque el nombre de la raza que desea utilizar");
        SeleccionRaza = SR.nextLine();
        f = FactoryProducer.getFactory(SeleccionRaza);
        //Debo pedir acá la opción de lo que desea construir...
        System.out.println("SELECCIONÓ LA RAZA ESQUELETO PARA JUGAR");
        System.out.println("Escoja qué desea hacer [crear edifico, crear milicia, vehículo aero, terrestre, super soldado etc...]");
        Scanner SC = new Scanner(System.in);
        SeleccionConstruccion = SC.nextLine();
        OpcionesParaJugadorDeEsqueletos oe1 = f.getOpcionMenuRazaEsqueleto(SeleccionConstruccion);
        /*if(SeleccionConstruccion == "Edificacion recurso 1"){
            oe1.crearEdificaciones();
        } else if(SeleccionConstruccion == "Milicia Esqueletos"){
            oe1.atacar();
        }   ESTO NO ESTÁ FUNCIONANDO, PERO DEBERÍA OFRECERME LA OPCIÓN DE MENÚ A PARTIR DE LO QUE SELECCIONÉ, DEBO EDTIAR ESTO*/
    }
    
}
