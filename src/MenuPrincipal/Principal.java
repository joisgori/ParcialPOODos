/*
 * Acá colocaré el método main para la ejecución del programa/juego del siguiente proyecto - parcial dos ciclo 01/2018
 */
package MenuPrincipal;
//Estas importaciones mandan a traer mis funciones y métodos del menú principal
import static MenuPrincipal.FuncionesPrincipales.ingresoUsuarios;
import static MenuPrincipal.FuncionesPrincipales.instrucciones;
//Acá las abstract factory que pediré por raza... aunque creo que las quitaré puesto que serán llamadas en la clase "FuncionesPrincipales"
//import fabricaAbstractaGH.AbstractFactoryGH;
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
        
        
                            /* 
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
                            
                            /*
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
        
        
        
        //*********************APARTIR DE ACÁ ESTÁ LA NUEVA FASE DE MI PARCIAL, PARCIAL 2.0********************************
        //AbstractFactoryGH v2;
        instrucciones();
        ingresoUsuarios();
        
        //podría ser los primeros turnos o mejor dicho, la mismísima fase uno la que vayan quemadas ejecutadas acá en un par de líneas
        
        
        //luego hacer un while para que inmediatamente ocurra eso y se guarden las cosas creadas en el array pueda generar acá un while con condiciones de vida
        //donde terminará hasta que la vida de cada jugador (que será la suma de la vida de todas las edificaicones sea destruida). ..
        
        //Podría hacer un while algo true que luego apunte a un entero que sea diferente de cero que represente la vida sumada de las estructuras;
        do{
            System.out.println("Se ejecuta la primera línea pero no lo demás");
            //Puedo hacer dos buckles while donde la condición sea que si no escogió atacar se mantenga, y luego de escoger atacar y a quien se corte y pase al siguiente buckle
        }while(false);
        
        
    }
    
}
