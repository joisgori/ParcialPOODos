/*
 * Acá colocaré el método main para la ejecución del programa/juego del siguiente proyecto - parcial dos ciclo 01/2018
 */
package MenuPrincipal;
//Estas importaciones mandan a traer mis funciones y métodos del menú principal

import EdifEsFactory.EdificacionesEs;
import EdifGHFactory.EdifSeda;
import EdifGHFactory.Edificaciones;
import static MenuPrincipal.FuncionesPrincipales.ingresoUsuarios;
import static MenuPrincipal.FuncionesPrincipales.instrucciones;
import SoldaGHFactory.Milicia;
import SoldaGHFactory.Soldados;
import SoldaOFactory.MiliciaO;
import fabricaAbstractaGH.AbstractFactoryGH;
import fabricaAbstractaGH.CentroMandoGH;
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
        //******************************************* SACO ACÁ LA DEF
        //Por acá afuera debo definir el objeto que atacará creo.
        v2 = FactoryProducerGH.getFactoryGH("Soldados");
        v2.getSoldado("Milicia");
        Milicia MGH = new Milicia();
        MiliciaO MO = new MiliciaO();
        int opcionSubMenuTurnos = 12, opcionEdif;
        Scanner TJ = new Scanner(System.in); //Turno Jugador
        instrucciones();
        ingresoUsuarios();
        CentroMandoGH g = new CentroMandoGH();

        //podría ser los primeros turnos o mejor dicho, la mismísima fase uno la que vayan quemadas ejecutadas acá en un par de líneas
        //luego hacer un while para que inmediatamente ocurra eso y se guarden las cosas creadas en el array pueda generar acá un while con condiciones de vida
        //donde terminará hasta que la vida de cada jugador (que será la suma de la vida de todas las edificaicones sea destruida). ..
        //Podría hacer un while algo true que luego apunte a un entero que sea diferente de cero que represente la vida sumada de las estructuras;
        do {
            //Puedo hacer dos buckles while donde la condición sea que si no escogió atacar se mantenga, y luego de escoger atacar y a quien se corte y pase al siguiente buckle

            while (opcionSubMenuTurnos != 3 && opcionSubMenuTurnos != 2) { //CAMBIO EN LA CONDICIÓN PARA QUE INDMEDIATAMENTE SE ATAQUE, SE PASE AL SIGUIENTE TURNO :D
                System.out.println("TURNO JUGADOR 1");
                System.out.println("Ingrese la opción a ejecutar: ***SI NO HAY EDIFICACIONES, (DEBO HACER UNA VALIDACIÓN DE SI LOS ARREGLOS A GUARDAR APUNTAN NULO QUE SE PASE DE LARGO A DAR LAS OPCINES DE ATAQUE O CREAR ALGO MÁS...)");
                System.out.println("1. Crear edificaciones\n2. Atacar [Sub menú si desea hacerlo con un Super Soldado o milicia normal]");
                opcionSubMenuTurnos = TJ.nextInt();
                switch (opcionSubMenuTurnos) {
                    case 1:
                        System.out.println("Crea edificaciones");
                        //VOY A ASUMIR AHORITA QUE SIEMPRE ESCOJE LA RAZA DE HUMANOS...
                        //CentroMandoGH g = new CentroMandoGH();
                        Edificaciones s = new EdifSeda(); //ASUMIENDO QUE DE UNA VEZ LA EDIFICACIÓN QUE CREO ES LA DE SEDA...
                        if (g.getPlata() >= 2500 && g.getRoble() >= 1000) {
                            System.out.println(g.getPlata());//solo para ver si entra
                            System.out.println(g.getRoble());
                            int actual = g.getPlata();
                            int coste = actual - 2500; 
                            g.getEdificacionesGueHuman().add(s);
                            System.out.println(g.getEdificacionesGueHuman().size());
                            System.out.println(g.getPlata());//solo para ver si entra
                            System.out.println(g.getRoble());
                            g.setPlata(coste);
                            g.setRoble(coste);
                            System.out.println(g.getPlata());//solo para ver si entra
                            System.out.println(g.getRoble());
                            
                        } else {
                            System.out.println("Ya no se puede canjear...");
                        }
                        break;
                    case 2:
                        System.out.println("Ataca según lo planetado antes");
                        System.out.println("Selecciono a quien atacar, quemadamente acá escogeré de una vez a la otra milica...");
                        MO.Danio(MGH.Atacar());
                        System.out.println(MO.getSalud());

                        //vEnemigos = FactoryProducerGH.getFactoryGH("Soldados");
                        //vEnemigos.getSoldado("Milicia").Danio(v2.getSoldado("Milicia").Atacar()); //ACÁ LE MANDO EL DAÑO AL ENEMIGO...
                        /**
                         * **** CON ESTO SEGURO PUEDO SOLVENTAR EL PROBLEMA DE
                         * LAS FÁBRICAS Y LOS ATAQUES... //Soldados s = null;
                         * //s.Danio(3); //s.Salud(3); //s.Atacar(); ******* O
                         * con esto :v así puedo usar los setter y getters
                         * mamones, solo es de instanciar los objetos afuera de
                         * este switch... y luego pasar esa vida e implementar
                         * la manera de ataque de cada uno; a su vez, debo crear
                         * los arraylist en cada una de las clases... Milicia s
                         * = null; s.Salud(5); //
                         */
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

            while (opcionSubMenuTurnos != 3 && opcionSubMenuTurnos != 2) { //Acá también presento ese cambio de turno automático al atacar
                System.out.println("TURNO JUGADOR 2");
                System.out.println("Ingrese la opción a ejecutar:");
                System.out.println("1. Crear edificaciones\n2. Atacar [Sub menú si desea hacerlo con un Super Soldado o milicia normal]");
                opcionSubMenuTurnos = TJ.nextInt();
                switch (opcionSubMenuTurnos) {
                    case 1:
                        System.out.println("Crea edificaciones");
                        System.out.println("Seleccione qué edificación desea crear:\n1. Edificación para recurso 1\n2. Edificación para recurso 2\n3. Edificación para recurso 3\n4. Edificación para entrenar soldados y escuadrones\n5. Edificación para construir Vehículos tipo 1\n6. Edificación para construir Vehículos tipo 2");
                        //TJ.nextInt();
                        opcionEdif = TJ.nextInt();
                        switch(opcionEdif){
                            case 1:
                                System.out.println("Pasa esto... y break"); //Con o sin break, regreso al menú principal...
                                break;
                            case 2:
                                System.out.println("Regreso al 'menu principal' sin un break?");
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            //default:
                              //  System.out.println("Ingrese una opción válida");
                            
                        }
                        break;
                    case 2:
                        System.out.println("Ataca según lo planetado antes");
                        System.out.println("Selecciono a quien atacar, quemadamente acá escogeré de una vez a la otra milica...");

                        /* *** ESTO LO OBVIO AHORITA
                        vEnemigos = FactoryProducerGH.getFactoryGH("Soldados");
                        v2 = FactoryProducerGH.getFactoryGH("Soldados");
                        v2.getSoldado("Milicia").Danio(vEnemigos.getSoldado("Milicia").Atacar()); //ACÁ LE MANDO EL DAÑO AL ENEMIGO...
                         */
                        MGH.Danio(MO.Atacar());
                        System.out.println(MGH.getSalud());
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

            //FINALMENTE AGREGO QUE LA VIDA DE AMBAS COSAS SEA MAYOR A CERO...
        } while(false); //while (MGH.getSalud() > 0 && MO.getSalud() > 0); //Separados por and, pues si falla uno se rompe el buckle

        //ahorita quizá vaya a probar con la vida nada más de los militares, cambiaré la condición del while...
        //Vale madres, probé con esto y no funcionó... v2.getSoldado("Milicia").Salud(opcionSubMenuTurnos) != 0 [DE CONDICIÓN...]
    }

}
