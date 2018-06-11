/*
 * Acá colocaré el método main para la ejecución del programa/juego del siguiente proyecto - parcial dos ciclo 01/2018
 */
package MenuPrincipal;
//Estas importaciones mandan a traer mis funciones y métodos del menú principal

import static MenuPrincipal.FuncionesPrincipales.ingresoUsuarios;
import static MenuPrincipal.FuncionesPrincipales.instrucciones;
import SoldaGHFactory.Milicia;
import SoldaGHFactory.Soldados;
import fabricaAbstractaGH.AbstractFactoryGH;
import fabricaAbstractaGH.FactoryProducerGH;
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
        AbstractFactoryGH v2, vEnemigos;
        int opcionSubMenuTurnos = 12;
        Scanner TJ = new Scanner(System.in); //Turno Jugador
        instrucciones();
        ingresoUsuarios();

        //podría ser los primeros turnos o mejor dicho, la mismísima fase uno la que vayan quemadas ejecutadas acá en un par de líneas
        //luego hacer un while para que inmediatamente ocurra eso y se guarden las cosas creadas en el array pueda generar acá un while con condiciones de vida
        //donde terminará hasta que la vida de cada jugador (que será la suma de la vida de todas las edificaicones sea destruida). ..
        //Podría hacer un while algo true que luego apunte a un entero que sea diferente de cero que represente la vida sumada de las estructuras;
        do {
            //Puedo hacer dos buckles while donde la condición sea que si no escogió atacar se mantenga, y luego de escoger atacar y a quien se corte y pase al siguiente buckle
            while (opcionSubMenuTurnos != 3) {
                System.out.println("TURNO JUGADOR 1");
                System.out.println("Ingrese la opción a ejecutar: ***SI NO HAY EDIFICACIONES, (DEBO HACER UNA VALIDACIÓN DE SI LOS ARREGLOS A GUARDAR APUNTAN NULO QUE SE PASE DE LARGO A DAR LAS OPCINES DE ATAQUE O CREAR ALGO MÁS...)");
                System.out.println("1. Crear edificaciones\n2. Atacar [Sub menú si desea hacerlo con un Super Soldado o milicia normal]");
                opcionSubMenuTurnos = TJ.nextInt();
                switch (opcionSubMenuTurnos) {
                    case 1:
                        System.out.println("Crea edificaciones");
                        break;
                    case 2:
                        System.out.println("Ataca según lo planetado antes");
                        System.out.println("Selecciono a quien atacar, quemadamente acá escogeré de una vez a la otra milica...");
                        v2 = FactoryProducerGH.getFactoryGH("Soldados");
                        vEnemigos = FactoryProducerGH.getFactoryGH("Soldados");
                        vEnemigos.getSoldado("Milicia").Danio(v2.getSoldado("Milicia").Atacar()); //ACÁ LE MANDO EL DAÑO AL ENEMIGO...
                        break;
                    case 3:
                        System.out.println("Se sale del buckle y que me tire al segund sub while");
                        break;
                        //*************SIN DUDA ESTE CASE 4 LO OBVIARÉ PARA EFECTOS PRÁCTICOS PORQUE AUN NO METO NADA EN UN ARRAY O ARRAYLIST;+
                    case 4: //TEMPORAL, SOLO PARA PROBAR OBJETO DE MILICIA.
                        System.out.println("Creo el objeto mi milicia humanos...");
                        //v2 = FactoryProducerGH.getFactoryGH("Soldados");
                        //v2.getSoldado("Milicia"); 
                    default:
                        System.out.println("Escoja opción válida");
                        break;
                }

            }

            opcionSubMenuTurnos = 12;
            //TJ.nextInt();
            
            while (opcionSubMenuTurnos != 3) {
                System.out.println("TURNO JUGADOR 2");
                System.out.println("Ingrese la opción a ejecutar:");
                System.out.println("1. Crear edificaciones\n2. Atacar [Sub menú si desea hacerlo con un Super Soldado o milicia normal]");
                opcionSubMenuTurnos = TJ.nextInt();
                switch (opcionSubMenuTurnos) {
                    case 1:
                        System.out.println("Crea edificaciones");
                        break;
                    case 2:
                        System.out.println("Ataca según lo planetado antes");
                        System.out.println("Selecciono a quien atacar, quemadamente acá escogeré de una vez a la otra milica...");
                        vEnemigos = FactoryProducerGH.getFactoryGH("Soldados");
                        v2 = FactoryProducerGH.getFactoryGH("Soldados");
                        v2.getSoldado("Milicia").Danio(vEnemigos.getSoldado("Milicia").Atacar()); //ACÁ LE MANDO EL DAÑO AL ENEMIGO...
                       
                        break;
                    case 3:
                        System.out.println("Se sale del buckle y que me tire al segund sub while");
                        break;
                    default:
                        System.out.println("Escoja opción válida");
                        break;
                }

            }
            
            opcionSubMenuTurnos = 12;
            //TJ.nextInt();
            
            v2 = FactoryProducerGH.getFactoryGH("Soldados");

        } while (false); //Acá deberá ir la vida total de las edificaciones que ambos tienen con una condición AND (&&) para que si falla uno, se rompe el buckle...
        
        //ahorita quizá vaya a probar con la vida nada más de los militares, cambiaré la condición del while...
        //Vale madres, probé con esto y no funcionó... v2.getSoldado("Milicia").Salud(opcionSubMenuTurnos) != 0 [DE CONDICIÓN...]

    }

}
