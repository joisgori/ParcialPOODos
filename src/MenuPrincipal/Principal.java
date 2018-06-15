/*
 * Acá colocaré el método main para la ejecución del programa/juego del siguiente proyecto - parcial dos ciclo 01/2018
 */
package MenuPrincipal;
//Estas importaciones mandan a traer mis funciones y métodos del menú principal

import EdifEsFactory.EdificacionesEs;
import EdifGHFactory.EdifEntrenamientoAguilas;
import EdifGHFactory.EdifEntrenamientoJabalis;
import EdifGHFactory.EdifEntrenamientoMyEGH;
import EdifGHFactory.EdifPlata;
import EdifGHFactory.EdifRoble;
import EdifGHFactory.EdifSeda;
import EdifGHFactory.Edificaciones;
import EdifOFactory.EdifArcilla;
import EdifOFactory.EdifArena;
import EdifOFactory.EdifEntrenamientoDragones;
import EdifOFactory.EdifEntrenamientoLobosG;
import EdifOFactory.EdifEntrenamientoMySOrcos;
import EdifOFactory.EdifPedernales;
import EdifOFactory.EdificacionesO;
import static MenuPrincipal.FuncionesPrincipales.ingresoUsuarios;
import static MenuPrincipal.FuncionesPrincipales.instrucciones;
import static MenuPrincipal.FuncionesPrincipales.Fase;
import static MenuPrincipal.FuncionesPrincipales.muestraDatosUsuario;
import SoldaEsFactory.MiliciaEs;
import SoldaGHFactory.Milicia;
import SoldaGHFactory.Soldados;
import SoldaOFactory.MiliciaO;
import fabricaAbstractaEs.CentroMandoEs;
import fabricaAbstractaGH.AbstractFactoryGH;
import fabricaAbstractaGH.CentroMandoGH;
import fabricaAbstractaGH.FactoryProducerGH;
import fabricaAbstractaOrcos.CentroMandoOrcos;
//Acá las abstract factory que pediré por raza... aunque creo que las quitaré puesto que serán llamadas en la clase "FuncionesPrincipales"
//import fabricaAbstractaGH.AbstractFactoryGH;
import java.util.Scanner;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class Principal {

    //Método main para la ejecución de mi videojuego.
    public static void main(String[] args) {
        ///********************************* VERSIÓN 3.0 MENÚ FINAL....:
        // INICIALIZO EL CENTRO DE MANDO DE CADA JUGADOR:
        CentroMandoGH gh = new CentroMandoGH();
        CentroMandoEs es = new CentroMandoEs();
        CentroMandoOrcos orcos = new CentroMandoOrcos();
        // ----------------------------------------------
        // INICIALIZO LOS OBJETOS DE LAS MILICIAS:
        Milicia MGH = new Milicia();
        MiliciaO MO = new MiliciaO();
        MiliciaEs MEs = new MiliciaEs();
        // ----------------------------------------------
        //INICIALIZO LOS OBJETOS DE LAS EDIFICACIONES:
        //Edificaciones s = new EdifSeda();   //OJO NO ESTOY SEGURO SI DEBERÍA DEFINIR ACÁ CADA OBJETO, O ESTE DEBERÍA RECREARSE DENTRO DE LA ITERACIÓN WHILE TURNO
        //Edificaciones P = new EdifPlata();  //PUESTO QUE SI NO, NO PODRÍA CREAR NUEVOS OBJETOS EN NUEVAS POSICIONES DE LA LSITA..
        //Edificaciones R = new EdifRoble();
        //Edificaciones EME = new EdifEntrenamientoMyEGH();
        //Edificaciones JABA = new EdifEntrenamientoJabalis();
        //Edificaciones AGUI = new EdifEntrenamientoAguilas();

        //EdificacionesO Arci = new EdifArcilla();
        //EdificacionesO Are = new EdifArena();
        //EdificacionesO Ped = new EdifPedernales();
        //EdificacionesO EMO = new EdifEntrenamientoMySOrcos();
        //EdificacionesO LOB = new EdifEntrenamientoLobosG();
        EdificacionesO DRA = new EdifEntrenamientoDragones();

        //EdificacionesEs e = new EdificacionesEs;
        // ----------------------------------------------
        //INCIALIZO LOS OBJETOS DE LOS VEHICULOS:
        // ----------------------------------------------
        // Debo declarar las variables con las que me iré moviendo por el menú
        String nombre, nombreJ1 = null, nombreJ2 = null, nombreEdif;
        int opcionSubMenuTurnos = 12, opcionEdif, opcionAtaque, a = 1, opcionRaza, opcionMenuRaza, opcionRazaJ1 = 0, opcionRazaJ2 = 0, VerRoMejora; //Sin esa igualación a cero, me da error abajo:v
        // ----------------------------------------------
        // INICIALIZO LOS OBJETOS DE TIPO SCANNER...:
        Scanner TJ = new Scanner(System.in); //Turno Jugador
        Scanner SR = new Scanner(System.in); //Turno Jugador
        Scanner F = new Scanner(System.in);

        //Var bool
        boolean GHSeda = false, GHRoble = false, GHPlata = false, GHEntrenaMil = false, GHEntrenaAguilas = false, GHEntrenaJabalis = false;
        boolean OArena = false, OArcilla = false, Pedernales = false;
        // ----------------------------------------------
        // Desarrollo del menú en su versión 3.0 final.:
        System.out.println("Bienvenido al juego JOSUE'S WORLD");
        instrucciones();
        while (a != 3) {
            //Ingreso de datos de usuario (uno y dos)
            System.out.println("Ingrese nombre de usuario");
            nombre = SR.nextLine();
            //Ahora pido el tipo de raza con la que desea jugar
            System.out.println("A continuación, escoja la raza que desea...\n de momento solo puede escoger la raza humanos guerreros");
            System.out.println("1. Raza Orcos\n2. Raza Guerreros Humanos\n3. Esqueletos");
            opcionRaza = SR.nextInt();
            if (opcionRaza == 1) {
                muestraDatosUsuario(nombre, "Raza Orcos");
                //Esto inicializa un centro de mando nuevo para jugador uno o jugador dos, o ambos al mismo tiempo, en el supuesto que escojan la misma raza...
                CentroMandoOrcos InicioOrcos = new CentroMandoOrcos();
                SR.nextLine(); //Soluciona el problema de limpiar el buffer
                //Dispongo tando de \n (salto de línea) como de la creación de tabs \t ... y muestro los valores de los recursos con los que inicializa la nueva partida.
                System.out.println("Sus recursos iniciales son los siguientes:\n" + "Arcilla: " + InicioOrcos.getArcilla() + "\tArena: " + InicioOrcos.getArena() + "\tPedernales: " + InicioOrcos.getPedernales());
                if (a == 1) {
                    //Acá asigno la selección de raza y nombre del jugador uno a un par de variables auxiliares que me servirá más adelante.
                    opcionRazaJ1 = opcionRaza;
                    nombreJ1 = nombre;
                } else {
                    //Acá asigno la selección de raza y nombre del jugador uno a un par de variables auxiliares que me servirá más adelante.
                    opcionRazaJ2 = opcionRaza;
                    nombreJ2 = nombre;
                }
                //Ejecuto la función del contador de a para pedir un último usuario...
                a += 1;
            } else if (opcionRaza == 2) {
                muestraDatosUsuario(nombre, "Raza Guerreros Humanos");
                CentroMandoGH InicioGH = new CentroMandoGH();
                SR.nextLine(); //Soluciona el problema de limpiar el buffer
                System.out.println("Sus recursos iniciales son los siguientes:\n" + "Fibra_Seda: " + InicioGH.getFibra_Seda() + "\tPlata: " + InicioGH.getPlata() + "\tRoble: " + InicioGH.getRoble());
                if (a == 1) {
                    opcionRazaJ1 = opcionRaza;
                    nombreJ1 = nombre;
                } else {
                    opcionRazaJ2 = opcionRaza;
                    nombreJ2 = nombre;
                }
                //Ejecuto la función del contador de a para pedir un último usuario...
                a += 1;
            } else if (opcionRaza == 3) {
                muestraDatosUsuario(nombre, "Raza Esqueletos");
                CentroMandoEs InicioEs = new CentroMandoEs();
                SR.nextLine(); //Soluciona el problema de limpiar el buffer
                System.out.println("Sus recursos iniciales son los siguientes:\n" + "Mármol: " + InicioEs.getMarmol() + "\tOro: " + InicioEs.getOro() + "\tRoble: " + InicioEs.getLava());
                //Líneas para los turnos...
                if (a == 1) {
                    opcionRazaJ1 = opcionRaza;
                    nombreJ1 = nombre;
                } else {
                    opcionRazaJ2 = opcionRaza;
                    nombreJ2 = nombre;
                }
                a += 1;
            }
        }

        //Ahora va la segunda fase del menú principal en su versión 3.0;
        /*Genero mi do while con el que mantendré un fase inicial donde podrá gastar sus recursos c/u para la creación de sus edificaciones, las cuáles, de no ser
        creadas o inicializadas, romperán este buckle pues no podrá crearse la vida que mantendrá el do while en un buckle finito, de igual manera, el objetivo es
        que se termine el buckle si alguno de los dos jugadores llega a tener 0 en su vida máxima -----------> RECORDAR: SOLUCIONAR OPCIÓN DE PARO CON BOOLENAOS.
         */
        do {
            opcionSubMenuTurnos = 12;
            while (opcionSubMenuTurnos != 5) { //Podría luego agregar que este turno se termine ya sea luego de atacar o luego de se quede sin recursos por usar y hasta milicias para atacar (no más de un objetivo)
                System.out.println("TURNO JUGADOR 1: " + nombreJ1);
                System.out.println("Ingrese la opción a ejecutar:");
                System.out.println("1. Crear edificaciones\n2. Entrenar Soldados\n3. Atacar\n4. Mejorar Centro de Mando\n5. Pasar Turno [TEMPORAL]");
                //Deberían ser 3 if anidados, según la selección de la raza previa... if anidados con switch's dentro de los mismos.
                opcionSubMenuTurnos = TJ.nextInt();
                if (opcionRazaJ1 == 1) {
                    switch (opcionSubMenuTurnos) {
                        case 1:
                            System.out.println("Crea edificaciones");
                            System.out.println("Seleccione qué edificación desea crear:\n1. Edificación para Arcilla\n2. Edificación para Arena\n3. Edificación para Pedernales\n4. Edificación para entrenar soldados y escuadrones\n5. Edificación para entrenar Dragones\n6. Edificación para entrenar Lobos Gigantes");
                            opcionEdif = TJ.nextInt();
                            switch (opcionEdif) {
                                case 1:
                                    //System.out.println("Instancio y creo la edif para arcilla y lo agrego al arreglo...");
                                    //Acá se generan las compras de cada una de las edificaciones
                                    if (orcos.getArena() >= 500 && orcos.getPedernales() >= 100) {
                                        EdificacionesO Arci = new EdifArcilla();
                                        System.out.println(orcos.getArena());//solo para ver si entra
                                        System.out.println(orcos.getPedernales());
                                        int actualArena = orcos.getArena();
                                        int costeArena = actualArena - 500;
                                        int actualPedernal = orcos.getPedernales();
                                        int costePedernal = actualPedernal - 100;
                                        orcos.getEdificacionesO().add(Arci);
                                        System.out.println(orcos.getEdificacionesO().size());
                                        orcos.setArena(costeArena);
                                        orcos.setPedernales(costePedernal);
                                        System.out.println(orcos.getArena());//solo para ver si entra
                                        System.out.println(orcos.getPedernales());
                                    } else {
                                        System.out.println("Ya no se puede canjear...");
                                    }
                                    break;
                                case 2:
                                    //System.out.println("Instancio y creo el objeto 2 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
                                    if (orcos.getArcilla() >= 75 && orcos.getPedernales() >= 100) {
                                        EdificacionesO Are = new EdifArena();
                                        //System.out.println(orcos.getArena());//solo para ver si entra
                                        //System.out.println(orcos.getPedernales());
                                        int actualArcilla = orcos.getArcilla();
                                        int costeArcilla = actualArcilla - 75;
                                        int actualPedernal = orcos.getPedernales();
                                        int costePedernal = actualPedernal - 100;
                                        orcos.getEdificacionesO().add(Are);
                                        System.out.println(orcos.getEdificacionesO().size());
                                        orcos.setArcilla(costeArcilla);
                                        orcos.setPedernales(costePedernal);
                                        System.out.println(orcos.getArena());//solo para ver si entra
                                        System.out.println(orcos.getPedernales());
                                    } else {
                                        System.out.println("Ya no se puede canjear...");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Instancio y creo el objeto 3 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
                                    if (orcos.getArcilla() >= 75 && orcos.getArena() >= 500) {
                                        EdificacionesO Ped = new EdifPedernales();
                                        //System.out.println(orcos.getArena());//solo para ver si entra
                                        //System.out.println(orcos.getPedernales());
                                        int actualArcilla = orcos.getArcilla();
                                        int costeArcilla = actualArcilla - 75;
                                        int actualArena = orcos.getArena();
                                        int costeArena = actualArena - 100;
                                        orcos.getEdificacionesO().add(Ped);
                                        System.out.println(orcos.getEdificacionesO().size());
                                        orcos.setArena(costeArena);
                                        orcos.setArcilla(costeArcilla);
                                        System.out.println(orcos.getArena());//solo para ver si entra
                                        System.out.println(orcos.getArcilla());
                                    } else {
                                        System.out.println("Ya no se puede canjear...");
                                    }
                                    break;
                                case 4:
                                    //System.out.println("Instancio y creo el objeto 4 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
                                    if (orcos.getArena() >= 500 && orcos.getArcilla() >= 1500 && orcos.getPedernales() >= 750) {
                                        EdificacionesO EMO = new EdifEntrenamientoMySOrcos();
                                        System.out.println(orcos.getArena());
                                        System.out.println(orcos.getArcilla());
                                        System.out.println(orcos.getPedernales());//solo para ver si entra                       
                                        int actualFibra = orcos.getArena();
                                        int costeFibra = actualFibra - 500;
                                        int actualPlata = orcos.getArcilla();
                                        int costePlata = actualPlata - 1500;
                                        int actualRoble = orcos.getPedernales();
                                        int costeRoble = actualRoble - 750;
                                        orcos.getEdificacionesO().add(EMO);
                                        System.out.println(orcos.getEdificacionesO().size());
                                        orcos.setArcilla(costeFibra);
                                        orcos.setArena(costePlata);
                                        orcos.setPedernales(costeRoble);
                                        System.out.println(orcos.getArcilla());//solo para ver si entra
                                        System.out.println(orcos.getArena());
                                        System.out.println(orcos.getPedernales());
                                    } else {
                                        System.out.println("Es probable que no posee la cantidad suficiente de recursos para comprar una o ya posee un objeto de este tipo.");
                                    }

                                    break;
                                case 5:
                                    //System.out.println("Instancio y creo el objeto 5 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
                                    if (gh.getFibra_Seda() >= 400 && gh.getPlata() >= 2150 && gh.getRoble() >= 1500) {
                                        EdificacionesO LOB = new EdifEntrenamientoLobosG();
                                        System.out.println(orcos.getArena());
                                        System.out.println(orcos.getArcilla());
                                        System.out.println(orcos.getPedernales());//solo para ver si entra                       
                                        int actualFibra = orcos.getArena();
                                        int costeFibra = actualFibra - 400;
                                        int actualPlata = orcos.getArcilla();
                                        int costePlata = actualPlata - 2150;
                                        int actualRoble = orcos.getPedernales();
                                        int costeRoble = actualRoble - 1500;
                                        orcos.getEdificacionesO().add(LOB);
                                        System.out.println(orcos.getEdificacionesO().size());
                                        orcos.setArcilla(costeFibra);
                                        orcos.setArena(costePlata);
                                        orcos.setPedernales(costeRoble);
                                        System.out.println(orcos.getArcilla());//solo para ver si entra
                                        System.out.println(orcos.getArena());
                                        System.out.println(orcos.getPedernales());
                                    } else {
                                        System.out.println("Es probable que no posee la cantidad suficiente de recursos para comprar una o ya posee un objeto de este tipo.");
                                    }

                                    break;
                                case 6:
                                    System.out.println("Instancio y creo el objeto 6 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...

                                    break;
                                default:
                                    System.out.println("Ingrese una opción válida");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Por favor, seleccione con qué desea entrenar: ");
                            System.out.println("1. Milia + talRaza\n2. Super Soldado + segunRaza\n3. Vehículo Terrestre + segúnRaza\n4. Vehículo Aéreo + según raza");
                            opcionAtaque = TJ.nextInt();
                            switch (opcionAtaque) {
                                case 1:
                                    System.out.println("Ataco a la milica de tal raza N");
                                    break;
                                case 2:
                                    System.out.println("Atacó al super soldado de tal raza N");
                                    break;
                                case 3:
                                    System.out.println("Atacó a tal vehículo de la raza");
                                    break;
                                case 4:
                                    System.out.println("Atacó a tal vehículo aéreo...");
                                    break;
                                default:
                                    System.out.println("Escoja una opción válida");
                                    break;
                            }
                            MGH.Danio(MO.Atacar());
                            System.out.println(MGH.getSalud());
                            break;
                        case 3:
                            System.out.println("Atacar\nSeleccione a quién desea atacar..."); //Puedo poner afuera de todo esto el muestreo de los recursos actuales...
                            break;
                        case 4:
                            System.out.println("Verificar cantidad de recursos y mejorar el CENTRO DE MANDO");
                            break;
                        case 5:
                            System.out.println("Pasar de turno....");
                            break;
                        default:
                            System.out.println("Escoja opción válida");
                            break;
                    }
                    for (int i = 0; i < orcos.getEdificacionesO().size(); i++) {
                        orcos.getEdificacionesO().get(i).GenerarRecurso();
                    }
                } else if (opcionRazaJ1 == 2) {
                    switch (opcionSubMenuTurnos) {
                        case 1:
                            System.out.println("Crea edificaciones");
                            System.out.println("Seleccione qué edificación desea crear:\n1. Edificación para Seda\n2. Edificación para Plata\n3. Edificación para Roble\n4. Edificación para entrenar soldados y escuadrones\n5. Edificación para entrenar Águilas\n6. Edificación para entrenar Jabalíes");
                            opcionEdif = TJ.nextInt();
                            switch (opcionEdif) {
                                case 1:
                                    //System.out.println("Instancio y creo la edif para la Seda y lo agrego al arreglo...");
                                    //Acá se generan las compras de cada una de las edificaciones
                                    if (gh.getPlata() >= 500 && gh.getRoble() >= 100 && !GHSeda) {
                                        Edificaciones s = new EdifSeda(); //A pues sí, es necesario definir acá dentro los objetos para que cada uno sea independiente del valor afectado.
                                        System.out.println(gh.getPlata());//solo para ver si entra
                                        System.out.println(gh.getRoble());
                                        int actualPlata = gh.getPlata();
                                        int costePlata = actualPlata - 500;
                                        int actualRoble = gh.getRoble();
                                        int costeRoble = actualRoble - 100;
                                        gh.getEdificacionesGueHuman().add(s);
                                        GHSeda = true;
                                        System.out.println(gh.getEdificacionesGueHuman().size());
                                        gh.setPlata(costePlata);
                                        gh.setRoble(costeRoble);
                                        System.out.println(gh.getPlata());//solo para ver si entra
                                        System.out.println(gh.getRoble());
                                    } else {
                                        System.out.println("Es probable que no posee la cantidad suficiente de recursos para comprar una o ya posee un objeto de este tipo.");
                                    }
                                    break;
                                case 2:
                                    //System.out.println("Instancio y creo la edif para Plata y lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
                                    if (gh.getRoble() >= 100 && gh.getFibra_Seda() >= 75 && !GHPlata) {
                                        Edificaciones P = new EdifPlata();
                                        System.out.println(gh.getRoble());//solo para ver si entra
                                        System.out.println(gh.getFibra_Seda());
                                        int actualRoble = gh.getRoble();
                                        int costeRoble = actualRoble - 100;
                                        int actualFibra = gh.getFibra_Seda();
                                        int costeFibra = actualFibra - 75;
                                        gh.getEdificacionesGueHuman().add(P);
                                        GHPlata = true;
                                        System.out.println(gh.getEdificacionesGueHuman().size());
                                        gh.setRoble(costeRoble);
                                        gh.setFibra_Seda(costeFibra);
                                        System.out.println(gh.getRoble());//solo para ver si entra
                                        System.out.println(gh.getFibra_Seda());
                                    } else {
                                        System.out.println("Es probable que no posee la cantidad suficiente de recursos para comprar una o ya posee un objeto de este tipo.");
                                    }
                                    break;
                                case 3:
                                    //System.out.println("Instancio y creo la edif para Roble y lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
                                    if (gh.getPlata() >= 500 && gh.getFibra_Seda() >= 75 && !GHRoble) {
                                        Edificaciones R = new EdifRoble();
                                        System.out.println(gh.getPlata());//solo para ver si entraSystem.out.println(gh.getFibra_Seda());
                                        System.out.println(gh.getFibra_Seda());
                                        int actualPlata = gh.getPlata();
                                        int costePlata = actualPlata - 500;
                                        int actualFibra = gh.getFibra_Seda();
                                        int costeFibra = actualFibra - 75;
                                        gh.getEdificacionesGueHuman().add(R);
                                        GHRoble = true;
                                        System.out.println(gh.getEdificacionesGueHuman().size());
                                        gh.setPlata(costePlata);
                                        gh.setFibra_Seda(costeFibra);
                                        System.out.println(gh.getPlata());//solo para ver si entra
                                        System.out.println(gh.getFibra_Seda());
                                    } else {
                                        System.out.println("Es probable que no posee la cantidad suficiente de recursos para comprar una o ya posee un objeto de este tipo.");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Edificación entrenamiento de soldados y milica..."); //Con o sin break, regreso al menú principal...
                                    //500 , 1500 y 750...
                                    if (gh.getFibra_Seda() >= 500 && gh.getPlata() >= 1500 && gh.getRoble() >= 750 && !GHEntrenaMil) {
                                        Edificaciones EME = new EdifEntrenamientoMyEGH();
                                        System.out.println(gh.getFibra_Seda());
                                        System.out.println(gh.getPlata());
                                        System.out.println(gh.getRoble());//solo para ver si entra                       
                                        int actualFibra = gh.getFibra_Seda();
                                        int costeFibra = actualFibra - 500;
                                        int actualPlata = gh.getPlata();
                                        int costePlata = actualPlata - 1500;
                                        int actualRoble = gh.getRoble();
                                        int costeRoble = actualRoble - 750;
                                        gh.getEdificacionesGueHuman().add(EME);
                                        GHEntrenaMil = true;
                                        System.out.println(gh.getEdificacionesGueHuman().size());
                                        gh.setFibra_Seda(costeFibra);
                                        gh.setPlata(costePlata);
                                        gh.setRoble(costeRoble);
                                        System.out.println(gh.getPlata());//solo para ver si entra
                                        System.out.println(gh.getFibra_Seda());
                                        System.out.println(gh.getRoble());
                                    } else {
                                        System.out.println("Es probable que no posee la cantidad suficiente de recursos para comprar una o ya posee un objeto de este tipo.");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Edif Entrenamiento de Águileas..."); //Con o sin break, regreso al menú principal...
                                    if (gh.getFibra_Seda() >= 400 && gh.getPlata() >= 2150 && gh.getRoble() >= 1500 && !GHEntrenaAguilas) {
                                        Edificaciones AGUI = new EdifEntrenamientoAguilas();
                                        System.out.println(gh.getFibra_Seda());
                                        System.out.println(gh.getPlata());
                                        System.out.println(gh.getRoble());//solo para ver si entra                       
                                        int actualFibra = gh.getFibra_Seda();
                                        int costeFibra = actualFibra - 400;
                                        int actualPlata = gh.getPlata();
                                        int costePlata = actualPlata - 2150;
                                        int actualRoble = gh.getRoble();
                                        int costeRoble = actualRoble - 1500;
                                        gh.getEdificacionesGueHuman().add(AGUI);
                                        GHEntrenaAguilas = true;
                                        System.out.println(gh.getEdificacionesGueHuman().size());
                                        gh.setFibra_Seda(costeFibra);
                                        gh.setPlata(costePlata);
                                        gh.setRoble(costeRoble);
                                        System.out.println(gh.getPlata());//solo para ver si entra
                                        System.out.println(gh.getFibra_Seda());
                                        System.out.println(gh.getRoble());
                                    } else {
                                        System.out.println("Es probable que no posee la cantidad suficiente de recursos para comprar una o ya posee un objeto de este tipo.");
                                    }
                                    break;
                                case 6:
                                    System.out.println("Edif Entrenamiento de Jabalíes..."); //Con o sin break, regreso al menú principal...
                                    if (gh.getFibra_Seda() >= 350 && gh.getPlata() >= 2000 && gh.getRoble() >= 1200 && !GHEntrenaJabalis) {
                                        Edificaciones JABA = new EdifEntrenamientoJabalis();
                                        System.out.println(gh.getFibra_Seda());
                                        System.out.println(gh.getPlata());
                                        System.out.println(gh.getRoble());//solo para ver si entra                       
                                        int actualFibra = gh.getFibra_Seda();
                                        int costeFibra = actualFibra - 350;
                                        int actualPlata = gh.getPlata();
                                        int costePlata = actualPlata - 2000;
                                        int actualRoble = gh.getRoble();
                                        int costeRoble = actualRoble - 1200;
                                        gh.getEdificacionesGueHuman().add(JABA);
                                        GHEntrenaAguilas = true;
                                        System.out.println(gh.getEdificacionesGueHuman().size());
                                        gh.setFibra_Seda(costeFibra);
                                        gh.setPlata(costePlata);
                                        gh.setRoble(costeRoble);
                                        System.out.println(gh.getPlata());//solo para ver si entra
                                        System.out.println(gh.getFibra_Seda());
                                        System.out.println(gh.getRoble());
                                    } else {
                                        System.out.println("Es probable que no posee la cantidad suficiente de recursos para comprar una o ya posee un objeto de este tipo.");
                                    }
                                    break;
                                default:
                                    System.out.println("Ingrese una opción válida");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Por favor, seleccione con qué desea entrenar: ");
                            System.out.println("1. Milia + talRaza\n2. Super Soldado + segunRaza\n3. Vehículo Terrestre + segúnRaza\n4. Vehículo Aéreo + según raza");
                            opcionAtaque = TJ.nextInt();
                            switch (opcionAtaque) {
                                case 1:
                                    System.out.println("Ataco a la milica de tal raza N");
                                    break;
                                case 2:
                                    System.out.println("Atacó al super soldado de tal raza N");
                                    break;
                                case 3:
                                    System.out.println("Atacó a tal vehículo de la raza");
                                    break;
                                case 4:
                                    System.out.println("Atacó a tal vehículo aéreo...");
                                    break;
                                default:
                                    System.out.println("Escoja una opción válida");
                                    break;
                            }
                            MGH.Danio(MO.Atacar());
                            System.out.println(MGH.getSalud());
                            break;
                        case 3:
                            System.out.println("Atacar\nSeleccione a quién desea atacar..."); //Puedo poner afuera de todo esto el muestreo de los recursos actuales...
                            break;
                        case 4:
                            System.out.println("Verificar cantidad de recursos y mejorar el CENTRO DE MANDO");
                            System.out.println("1. Verificar cantidad de recursos y edificaciones creadas\n2. Mejorar el centro de mando");
                            VerRoMejora = F.nextInt();
                            switch (VerRoMejora) {
                                case 1:
                                    System.out.println("Seleccionó ver todos sus recursos y edif... + soldados+++ y ver la vida de los mismos...");
                                case 2:
                                    System.out.println("Seleccionó mejorar centro de mando...");
                            }
                            break;
                        case 5:
                            System.out.println("Pasar de turno....");
                            break;
                        default:
                            System.out.println("Escoja opción válida");
                            break;
                    }
                    //Acá puedo mostrar el arreglo de prueba de edificaciones:
                    for (int i = 0; i < gh.getEdificacionesGueHuman().size(); i++) {
                        gh.getEdificacionesGueHuman().get(i).GenerarRecurso();
                    }

                } else if (opcionRazaJ1 == 3) {
                    System.out.println("Acá irá el tercer case... ESQUELETOS");

                } else {
                    System.out.println("Debió escojer una opción válida...");
                }                //Acá puedo mostrar el arreglo de prueba de edificaciones:

            }

            //TURNO DE JUGADOR DOS;
            opcionSubMenuTurnos = 12;
            while (opcionSubMenuTurnos != 5) {
                System.out.println("TURNO JUGADOR 2: " + nombreJ2);
                System.out.println("Ingrese la opción a ejecutar:");
                System.out.println("1. Crear edificaciones\n2. Entrenar Soldados\n3. Atacar\n4. Mejorar Centro de Mando\n5. Pasar Turno [TEMPORAL]");
                //Deberían ser 3 if anidados, según la selección de la raza previa... if anidados con switch's dentro de los mismos.
                opcionSubMenuTurnos = TJ.nextInt();
                if (opcionRazaJ2 == 1) {
                    switch (opcionSubMenuTurnos) {
                        case 1:
                            System.out.println("Crea edificaciones");
                            System.out.println("Seleccione qué edificación desea crear:\n1. Edificación para Arcilla\n2. Edificación para Arena\n3. Edificación para Pedernales\n4. Edificación para entrenar soldados y escuadrones\n5. Edificación para entrenar Dragones\n6. Edificación para entrenar Lobos Gigantes");
                            opcionEdif = TJ.nextInt();
                            switch (opcionEdif) {
                                case 1:
                                    //System.out.println("Instancio y creo la edif para arcilla y lo agrego al arreglo...");
                                    //Acá se generan las compras de cada una de las edificaciones
                                    if (orcos.getArena() >= 500 && orcos.getPedernales() >= 100) {
                                        EdificacionesO Arci = new EdifArcilla();
                                        System.out.println(orcos.getArena());//solo para ver si entra
                                        System.out.println(orcos.getPedernales());
                                        int actualArena = orcos.getArena();
                                        int costeArena = actualArena - 500;
                                        int actualPedernal = orcos.getPedernales();
                                        int costePedernal = actualPedernal - 100;
                                        orcos.getEdificacionesO().add(Arci);
                                        System.out.println(orcos.getEdificacionesO().size());
                                        orcos.setArena(costeArena);
                                        orcos.setPedernales(costePedernal);
                                        System.out.println(orcos.getArena());//solo para ver si entra
                                        System.out.println(orcos.getPedernales());
                                    } else {
                                        System.out.println("Ya no se puede canjear...");
                                    }
                                    break;
                                case 2:
                                    //System.out.println("Instancio y creo el objeto 2 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
                                    if (orcos.getArcilla() >= 75 && orcos.getPedernales() >= 100) {
                                        EdificacionesO Are = new EdifArena();
                                        //System.out.println(orcos.getArena());//solo para ver si entra
                                        //System.out.println(orcos.getPedernales());
                                        int actualArcilla = orcos.getArcilla();
                                        int costeArcilla = actualArcilla - 75;
                                        int actualPedernal = orcos.getPedernales();
                                        int costePedernal = actualPedernal - 100;
                                        orcos.getEdificacionesO().add(Are);
                                        System.out.println(orcos.getEdificacionesO().size());
                                        orcos.setArcilla(costeArcilla);
                                        orcos.setPedernales(costePedernal);
                                        System.out.println(orcos.getArena());//solo para ver si entra
                                        System.out.println(orcos.getPedernales());
                                    } else {
                                        System.out.println("Ya no se puede canjear...");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Instancio y creo el objeto 3 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
                                    if (orcos.getArcilla() >= 75 && orcos.getArena() >= 500) {
                                        EdificacionesO Ped = new EdifPedernales();
                                        //System.out.println(orcos.getArena());//solo para ver si entra
                                        //System.out.println(orcos.getPedernales());
                                        int actualArcilla = orcos.getArcilla();
                                        int costeArcilla = actualArcilla - 75;
                                        int actualArena = orcos.getArena();
                                        int costeArena = actualArena - 100;
                                        orcos.getEdificacionesO().add(Ped);
                                        System.out.println(orcos.getEdificacionesO().size());
                                        orcos.setArena(costeArena);
                                        orcos.setArcilla(costeArcilla);
                                        System.out.println(orcos.getArena());//solo para ver si entra
                                        System.out.println(orcos.getArcilla());
                                    } else {
                                        System.out.println("Ya no se puede canjear...");
                                    }
                                    break;
                                case 4:
                                    //System.out.println("Instancio y creo el objeto 4 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
                                    if (orcos.getArena() >= 500 && orcos.getArcilla() >= 1500 && orcos.getPedernales() >= 750) {
                                        EdificacionesO EMO = new EdifEntrenamientoMySOrcos();
                                        System.out.println(orcos.getArena());
                                        System.out.println(orcos.getArcilla());
                                        System.out.println(orcos.getPedernales());//solo para ver si entra                       
                                        int actualFibra = orcos.getArena();
                                        int costeFibra = actualFibra - 500;
                                        int actualPlata = orcos.getArcilla();
                                        int costePlata = actualPlata - 1500;
                                        int actualRoble = orcos.getPedernales();
                                        int costeRoble = actualRoble - 750;
                                        orcos.getEdificacionesO().add(EMO);
                                        System.out.println(orcos.getEdificacionesO().size());
                                        orcos.setArcilla(costeFibra);
                                        orcos.setArena(costePlata);
                                        orcos.setPedernales(costeRoble);
                                        System.out.println(orcos.getArcilla());//solo para ver si entra
                                        System.out.println(orcos.getArena());
                                        System.out.println(orcos.getPedernales());
                                    } else {
                                        System.out.println("Es probable que no posee la cantidad suficiente de recursos para comprar una o ya posee un objeto de este tipo.");
                                    }

                                    break;
                                case 5:
                                    //System.out.println("Instancio y creo el objeto 5 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
                                    if (gh.getFibra_Seda() >= 400 && gh.getPlata() >= 2150 && gh.getRoble() >= 1500) {
                                        EdificacionesO LOB = new EdifEntrenamientoLobosG();
                                        System.out.println(orcos.getArena());
                                        System.out.println(orcos.getArcilla());
                                        System.out.println(orcos.getPedernales());//solo para ver si entra                       
                                        int actualFibra = orcos.getArena();
                                        int costeFibra = actualFibra - 400;
                                        int actualPlata = orcos.getArcilla();
                                        int costePlata = actualPlata - 2150;
                                        int actualRoble = orcos.getPedernales();
                                        int costeRoble = actualRoble - 1500;
                                        orcos.getEdificacionesO().add(LOB);
                                        System.out.println(orcos.getEdificacionesO().size());
                                        orcos.setArcilla(costeFibra);
                                        orcos.setArena(costePlata);
                                        orcos.setPedernales(costeRoble);
                                        System.out.println(orcos.getArcilla());//solo para ver si entra
                                        System.out.println(orcos.getArena());
                                        System.out.println(orcos.getPedernales());
                                    } else {
                                        System.out.println("Es probable que no posee la cantidad suficiente de recursos para comprar una o ya posee un objeto de este tipo.");
                                    }

                                    break;
                                case 6:
                                    System.out.println("Instancio y creo el objeto 6 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...

                                    break;
                                default:
                                    System.out.println("Ingrese una opción válida");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Por favor, seleccione con qué desea entrenar: ");
                            System.out.println("1. Milia + talRaza\n2. Super Soldado + segunRaza\n3. Vehículo Terrestre + segúnRaza\n4. Vehículo Aéreo + según raza");
                            opcionAtaque = TJ.nextInt();
                            switch (opcionAtaque) {
                                case 1:
                                    System.out.println("Ataco a la milica de tal raza N");
                                    break;
                                case 2:
                                    System.out.println("Atacó al super soldado de tal raza N");
                                    break;
                                case 3:
                                    System.out.println("Atacó a tal vehículo de la raza");
                                    break;
                                case 4:
                                    System.out.println("Atacó a tal vehículo aéreo...");
                                    break;
                                default:
                                    System.out.println("Escoja una opción válida");
                                    break;
                            }
                            MGH.Danio(MO.Atacar());
                            System.out.println(MGH.getSalud());
                            break;
                        case 3:
                            System.out.println("Atacar\nSeleccione a quién desea atacar..."); //Puedo poner afuera de todo esto el muestreo de los recursos actuales...
                            break;
                        case 4:
                            System.out.println("Verificar cantidad de recursos y mejorar el CENTRO DE MANDO");
                            break;
                        case 5:
                            System.out.println("Pasar de turno....");
                            break;
                        default:
                            System.out.println("Escoja opción válida");
                            break;
                    }
                    for (int i = 0; i < orcos.getEdificacionesO().size(); i++) {
                        orcos.getEdificacionesO().get(i).GenerarRecurso();
                    }

                } else if (opcionRazaJ2 == 2) {
                    switch (opcionSubMenuTurnos) {
                        case 1:
                            System.out.println("Crea edificaciones");
                            System.out.println("Seleccione qué edificación desea crear:\n1. Edificación para Seda\n2. Edificación para Plata\n3. Edificación para Roble\n4. Edificación para entrenar soldados y escuadrones\n5. Edificación para entrenar Águilas\n6. Edificación para entrenar Jabalíes");
                            opcionEdif = TJ.nextInt();
                            switch (opcionEdif) {
                                case 1:
                                    //System.out.println("Instancio y creo la edif para la Seda y lo agrego al arreglo...");
                                    //Acá se generan las compras de cada una de las edificaciones
                                    if (gh.getPlata() >= 500 && gh.getRoble() >= 100 && !GHSeda) {
                                        Edificaciones s = new EdifSeda(); //A pues sí, es necesario definir acá dentro los objetos para que cada uno sea independiente del valor afectado.
                                        System.out.println(gh.getPlata());//solo para ver si entra
                                        System.out.println(gh.getRoble());
                                        int actualPlata = gh.getPlata();
                                        int costePlata = actualPlata - 500;
                                        int actualRoble = gh.getRoble();
                                        int costeRoble = actualRoble - 100;
                                        gh.getEdificacionesGueHuman().add(s);
                                        GHSeda = true;
                                        System.out.println(gh.getEdificacionesGueHuman().size());
                                        gh.setPlata(costePlata);
                                        gh.setRoble(costeRoble);
                                        System.out.println(gh.getPlata());//solo para ver si entra
                                        System.out.println(gh.getRoble());
                                    } else {
                                        System.out.println("Es probable que no posee la cantidad suficiente de recursos para comprar una o ya posee un objeto de este tipo.");
                                    }
                                    break;
                                case 2:
                                    //System.out.println("Instancio y creo la edif para Plata y lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
                                    if (gh.getRoble() >= 100 && gh.getFibra_Seda() >= 75 && !GHPlata) {
                                        Edificaciones P = new EdifPlata();
                                        System.out.println(gh.getRoble());//solo para ver si entra
                                        System.out.println(gh.getFibra_Seda());
                                        int actualRoble = gh.getRoble();
                                        int costeRoble = actualRoble - 100;
                                        int actualFibra = gh.getFibra_Seda();
                                        int costeFibra = actualFibra - 75;
                                        gh.getEdificacionesGueHuman().add(P);
                                        GHPlata = true;
                                        System.out.println(gh.getEdificacionesGueHuman().size());
                                        gh.setRoble(costeRoble);
                                        gh.setFibra_Seda(costeFibra);
                                        System.out.println(gh.getRoble());//solo para ver si entra
                                        System.out.println(gh.getFibra_Seda());
                                    } else {
                                        System.out.println("Es probable que no posee la cantidad suficiente de recursos para comprar una o ya posee un objeto de este tipo.");
                                    }
                                    break;
                                case 3:
                                    //System.out.println("Instancio y creo la edif para Roble y lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
                                    if (gh.getPlata() >= 500 && gh.getFibra_Seda() >= 75 && !GHRoble) {
                                        Edificaciones R = new EdifRoble();
                                        System.out.println(gh.getPlata());//solo para ver si entraSystem.out.println(gh.getFibra_Seda());
                                        System.out.println(gh.getFibra_Seda());
                                        int actualPlata = gh.getPlata();
                                        int costePlata = actualPlata - 500;
                                        int actualFibra = gh.getFibra_Seda();
                                        int costeFibra = actualFibra - 75;
                                        gh.getEdificacionesGueHuman().add(R);
                                        GHRoble = true;
                                        System.out.println(gh.getEdificacionesGueHuman().size());
                                        gh.setPlata(costePlata);
                                        gh.setFibra_Seda(costeFibra);
                                        System.out.println(gh.getPlata());//solo para ver si entra
                                        System.out.println(gh.getFibra_Seda());
                                    } else {
                                        System.out.println("Es probable que no posee la cantidad suficiente de recursos para comprar una o ya posee un objeto de este tipo.");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Edificación entrenamiento de soldados y milica..."); //Con o sin break, regreso al menú principal...
                                    //500 , 1500 y 750...
                                    if (gh.getFibra_Seda() >= 500 && gh.getPlata() >= 1500 && gh.getRoble() >= 750 && !GHEntrenaMil) {
                                        Edificaciones EME = new EdifEntrenamientoMyEGH();
                                        System.out.println(gh.getFibra_Seda());
                                        System.out.println(gh.getPlata());
                                        System.out.println(gh.getRoble());//solo para ver si entra                       
                                        int actualFibra = gh.getFibra_Seda();
                                        int costeFibra = actualFibra - 500;
                                        int actualPlata = gh.getPlata();
                                        int costePlata = actualPlata - 1500;
                                        int actualRoble = gh.getRoble();
                                        int costeRoble = actualRoble - 750;
                                        gh.getEdificacionesGueHuman().add(EME);
                                        GHEntrenaMil = true;
                                        System.out.println(gh.getEdificacionesGueHuman().size());
                                        gh.setFibra_Seda(costeFibra);
                                        gh.setPlata(costePlata);
                                        gh.setRoble(costeRoble);
                                        System.out.println(gh.getPlata());//solo para ver si entra
                                        System.out.println(gh.getFibra_Seda());
                                        System.out.println(gh.getRoble());
                                    } else {
                                        System.out.println("Es probable que no posee la cantidad suficiente de recursos para comprar una o ya posee un objeto de este tipo.");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Edif Entrenamiento de Águileas..."); //Con o sin break, regreso al menú principal...
                                    if (gh.getFibra_Seda() >= 400 && gh.getPlata() >= 2150 && gh.getRoble() >= 1500 && !GHEntrenaAguilas) {
                                        Edificaciones AGUI = new EdifEntrenamientoAguilas();
                                        System.out.println(gh.getFibra_Seda());
                                        System.out.println(gh.getPlata());
                                        System.out.println(gh.getRoble());//solo para ver si entra                       
                                        int actualFibra = gh.getFibra_Seda();
                                        int costeFibra = actualFibra - 400;
                                        int actualPlata = gh.getPlata();
                                        int costePlata = actualPlata - 2150;
                                        int actualRoble = gh.getRoble();
                                        int costeRoble = actualRoble - 1500;
                                        gh.getEdificacionesGueHuman().add(AGUI);
                                        GHEntrenaAguilas = true;
                                        System.out.println(gh.getEdificacionesGueHuman().size());
                                        gh.setFibra_Seda(costeFibra);
                                        gh.setPlata(costePlata);
                                        gh.setRoble(costeRoble);
                                        System.out.println(gh.getPlata());//solo para ver si entra
                                        System.out.println(gh.getFibra_Seda());
                                        System.out.println(gh.getRoble());
                                    } else {
                                        System.out.println("Es probable que no posee la cantidad suficiente de recursos para comprar una o ya posee un objeto de este tipo.");
                                    }
                                    break;
                                case 6:
                                    System.out.println("Edif Entrenamiento de Jabalíes..."); //Con o sin break, regreso al menú principal...
                                    if (gh.getFibra_Seda() >= 350 && gh.getPlata() >= 2000 && gh.getRoble() >= 1200 && !GHEntrenaJabalis) {
                                        Edificaciones JABA = new EdifEntrenamientoJabalis();
                                        System.out.println(gh.getFibra_Seda());
                                        System.out.println(gh.getPlata());
                                        System.out.println(gh.getRoble());//solo para ver si entra                       
                                        int actualFibra = gh.getFibra_Seda();
                                        int costeFibra = actualFibra - 350;
                                        int actualPlata = gh.getPlata();
                                        int costePlata = actualPlata - 2000;
                                        int actualRoble = gh.getRoble();
                                        int costeRoble = actualRoble - 1200;
                                        gh.getEdificacionesGueHuman().add(JABA);
                                        GHEntrenaAguilas = true;
                                        System.out.println(gh.getEdificacionesGueHuman().size());
                                        gh.setFibra_Seda(costeFibra);
                                        gh.setPlata(costePlata);
                                        gh.setRoble(costeRoble);
                                        System.out.println(gh.getPlata());//solo para ver si entra
                                        System.out.println(gh.getFibra_Seda());
                                        System.out.println(gh.getRoble());
                                    } else {
                                        System.out.println("Es probable que no posee la cantidad suficiente de recursos para comprar una o ya posee un objeto de este tipo.");
                                    }
                                    break;
                                default:
                                    System.out.println("Ingrese una opción válida");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Por favor, seleccione con qué desea entrenar: ");
                            System.out.println("1. Milia + talRaza\n2. Super Soldado + segunRaza\n3. Vehículo Terrestre + segúnRaza\n4. Vehículo Aéreo + según raza");
                            opcionAtaque = TJ.nextInt();
                            switch (opcionAtaque) {
                                case 1:
                                    System.out.println("Ataco a la milica de tal raza N");
                                    break;
                                case 2:
                                    System.out.println("Atacó al super soldado de tal raza N");
                                    break;
                                case 3:
                                    System.out.println("Atacó a tal vehículo de la raza");
                                    break;
                                case 4:
                                    System.out.println("Atacó a tal vehículo aéreo...");
                                    break;
                                default:
                                    System.out.println("Escoja una opción válida");
                                    break;
                            }
                            MGH.Danio(MO.Atacar());
                            System.out.println(MGH.getSalud());
                            break;
                        case 3:
                            System.out.println("Atacar\nSeleccione a quién desea atacar..."); //Puedo poner afuera de todo esto el muestreo de los recursos actuales...
                            break;
                        case 4:
                            System.out.println("Verificar cantidad de recursos y mejorar el CENTRO DE MANDO");
                            System.out.println("1. Verificar cantidad de recursos y edificaciones creadas\n2. Mejorar el centro de mando");
                            VerRoMejora = F.nextInt();
                            switch (VerRoMejora) {
                                case 1:
                                    System.out.println("Seleccionó ver todos sus recursos y edif... + soldados+++ y ver la vida de los mismos...");
                                case 2:
                                    System.out.println("Seleccionó mejorar centro de mando...");
                            }
                            break;
                        case 5:
                            System.out.println("Pasar de turno....");
                            break;
                        default:
                            System.out.println("Escoja opción válida");
                            break;
                    }
                    //Acá puedo mostrar el arreglo de prueba de edificaciones:
                    for (int i = 0; i < gh.getEdificacionesGueHuman().size(); i++) {
                        gh.getEdificacionesGueHuman().get(i).GenerarRecurso();
                    }
                } else if (opcionRazaJ2 == 3) {
                    System.out.println("Acá irá el tercer case... ESQUELETOS");
                } else {
                    System.out.println("Escoja una opción válida...");
                }
            }

            Fase();

        } while (MGH.getSalud() > 0 && MO.getSalud() > 0);

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
        //AbstractFactoryGH v2, vEnemigos;
        //******************************************* SACO ACÁ LA DEF
        //Por acá afuera debo definir el objeto que atacará creo.
        //v2 = FactoryProducerGH.getFactoryGH("Soldados");
        //v2.getSoldado("Milicia");
        //Milicia MGH = new Milicia();
        //MiliciaO MO = new MiliciaO();
        //int opcionSubMenuTurnos = 12, opcionEdif, opcionAtaque;
        //Scanner TJ = new Scanner(System.in); //Turno Jugador
        //instrucciones();
        //ingresoUsuarios();
        //CentroMandoGH g = new CentroMandoGH();
        //podría ser los primeros turnos o mejor dicho, la mismísima fase uno la que vayan quemadas ejecutadas acá en un par de líneas
        //luego hacer un while para que inmediatamente ocurra eso y se guarden las cosas creadas en el array pueda generar acá un while con condiciones de vida
        //donde terminará hasta que la vida de cada jugador (que será la suma de la vida de todas las edificaicones sea destruida). ..
        //Podría hacer un while algo true que luego apunte a un entero que sea diferente de cero que represente la vida sumada de las estructuras;
        //do {
        //Puedo hacer dos buckles while donde la condición sea que si no escogió atacar se mantenga, y luego de escoger atacar y a quien se corte y pase al siguiente buckle
        //while (opcionSubMenuTurnos != 3 && opcionSubMenuTurnos != 2) { //CAMBIO EN LA CONDICIÓN PARA QUE INDMEDIATAMENTE SE ATAQUE, SE PASE AL SIGUIENTE TURNO :D
        //System.out.println("TURNO JUGADOR 1");
        //System.out.println("Ingrese la opción a ejecutar: ***SI NO HAY EDIFICACIONES, (DEBO HACER UNA VALIDACIÓN DE SI LOS ARREGLOS A GUARDAR APUNTAN NULO QUE SE PASE DE LARGO A DAR LAS OPCINES DE ATAQUE O CREAR ALGO MÁS...)");
        //System.out.println("1. Crear edificaciones\n2. Atacar [Sub menú si desea hacerlo con un Super Soldado o milicia normal]");
        //opcionSubMenuTurnos = TJ.nextInt();
        //switch (opcionSubMenuTurnos) {
        //case 1:
        //System.out.println("Crea edificaciones");
        //VOY A ASUMIR AHORITA QUE SIEMPRE ESCOJE LA RAZA DE HUMANOS...
        //CentroMandoGH g = new CentroMandoGH();
        //Edificaciones s = new EdifSeda(); //ASUMIENDO QUE DE UNA VEZ LA EDIFICACIÓN QUE CREO ES LA DE SEDA...
        /*             if (g.getPlata() >= 2500 && g.getRoble() >= 1000) {
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
                        }*/
        //break;
        //case 2:
        //System.out.println("Ataca según lo planetado antes");
        //System.out.println("Selecciono a quien atacar, quemadamente acá escogeré de una vez a la otra milica...");
        //MO.Danio(MGH.Atacar());
        //System.out.println(MO.getSalud());
        //vEnemigos = FactoryProducerGH.getFactoryGH("Soldados");
        //vEnemigos.getSoldado("Milicia").Danio(v2.getSoldado("Milicia").Atacar()); //ACÁ LE MANDO EL DAÑO AL ENEMIGO...
        /**
         * **** CON ESTO SEGURO PUEDO SOLVENTAR EL PROBLEMA DE LAS FÁBRICAS Y
         * LOS ATAQUES... //Soldados s = null; //s.Danio(3); //s.Salud(3);
         * //s.Atacar(); ******* O con esto :v así puedo usar los setter y
         * getters mamones, solo es de instanciar los objetos afuera de este
         * switch... y luego pasar esa vida e implementar la manera de ataque de
         * cada uno; a su vez, debo crear los arraylist en cada una de las
         * clases... Milicia s = null; s.Salud(5); //
         */
        //break;
        //case 3:
        //System.out.println("Se sale del buckle y que me tire al segund sub while");
        //break;
        //*************SIN DUDA ESTE CASE 4 LO OBVIARÉ PARA EFECTOS PRÁCTICOS PORQUE AUN NO METO NADA EN UN ARRAY O ARRAYLIST;+
        //case 4: //TEMPORAL, SOLO PARA PROBAR OBJETO DE MILICIA.
        //System.out.println("Creo el objeto mi milicia humanos...");
        //v2 = FactoryProducerGH.getFactoryGH("Soldados");
        //v2.getSoldado("Milicia"); 
        //default:
        //System.out.println("Escoja opción válida");
        //break;
        //}
        //}
        //opcionSubMenuTurnos = 12;
        //TJ.nextInt();
        //while (opcionSubMenuTurnos != 3 && opcionSubMenuTurnos != 2) { //Acá también presento ese cambio de turno automático al atacar
        //System.out.println("TURNO JUGADOR 2");
        // System.out.println("Ingrese la opción a ejecutar:");
        // System.out.println("1. Crear edificaciones\n2. Atacar [Sub menú si desea hacerlo con un Super Soldado o milicia normal]");
        // opcionSubMenuTurnos = TJ.nextInt();
        //switch (opcionSubMenuTurnos) {
        // case 1:
        // System.out.println("Crea edificaciones");
        //System.out.println("Seleccione qué edificación desea crear:\n1. Edificación para recurso 1\n2. Edificación para recurso 2\n3. Edificación para recurso 3\n4. Edificación para entrenar soldados y escuadrones\n5. Edificación para construir Vehículos tipo 1\n6. Edificación para construir Vehículos tipo 2");
        //TJ.nextInt();
        // opcionEdif = TJ.nextInt();
        // switch (opcionEdif) {
        //case 1:
        //System.out.println("Instancio y creo el objeto 1 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
        //break;
        //case 2:
        //System.out.println("Instancio y creo el objeto 2 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
        //break;
        //case 3:
        //System.out.println("Instancio y creo el objeto 3 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
        // break;
        //case 4:
        //System.out.println("Instancio y creo el objeto 4 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
        //break;
        //case 5:
        //System.out.println("Instancio y creo el objeto 5 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
        // break;
        //case 6:
        //System.out.println("Instancio y creo el objeto 6 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
        //break;
        //default:
        //System.out.println("Ingrese una opción válida");
        //break;
        //}
        //break;
        //case 2:
        //System.out.println("Por favor, seleccione con qué desea atacar: ");
        //System.out.println("1. Milia + talRaza\n2. Super Soldado + segunRaza\n3. Vehículo Terrestre + segúnRaza\n4. Vehículo Aéreo + según raza");
        //opcionAtaque = TJ.nextInt();
        //switch (opcionAtaque) {
        // case 1:
        //System.out.println("Ataco a la milica de tal raza N");
        //break;
        //case 2:
        //System.out.println("Atacó al super soldado de tal raza N");
        //break;
        //case 3:
        //System.out.println("Atacó a tal vehículo de la raza");
        //break;
        //case 4:
        //System.out.println("Atacó a tal vehículo aéreo...");
        //break;
        //default:
        //System.out.println("Escoja una opción válida");
        // break;
        // }

        /* *** ESTO LO OBVIO AHORITA
                        vEnemigos = FactoryProducerGH.getFactoryGH("Soldados");
                        v2 = FactoryProducerGH.getFactoryGH("Soldados");
                        v2.getSoldado("Milicia").Danio(vEnemigos.getSoldado("Milicia").Atacar()); //ACÁ LE MANDO EL DAÑO AL ENEMIGO...
         */
        // MGH.Danio(MO.Atacar());
        //  System.out.println(MGH.getSalud());
        //   break;
        // case 3:
        //  //   System.out.println("Se sale del buckle y que me tire al segund sub while");
        // break;
        //default:
        // System.out.println("Escoja opción válida");
        // break;
        // }
        // }
        // opcionSubMenuTurnos = 12;
        //TJ.nextInt();
        // v2 = FactoryProducerGH.getFactoryGH("Soldados");
        //FINALMENTE AGREGO QUE LA VIDA DE AMBAS COSAS SEA MAYOR A CERO...
        // } while (false); //while (MGH.getSalud() > 0 && MO.getSalud() > 0); //Separados por and, pues si falla uno se rompe el buckle
        //ahorita quizá vaya a probar con la vida nada más de los militares, cambiaré la condición del while...
        //Vale madres, probé con esto y no funcionó... v2.getSoldado("Milicia").Salud(opcionSubMenuTurnos) != 0 [DE CONDICIÓN...]
    }

}
