/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuPrincipal;

import EdifGHFactory.EdifSeda;
import EdifGHFactory.Edificaciones;
import fabricaAbstractaEs.CentroMandoEs;
import fabricaAbstractaGH.AbstractFactoryGH;
import fabricaAbstractaGH.CentroMandoGH;
import fabricaAbstractaGH.FactoryProducerGH;
import fabricaAbstractaOrcos.CentroMandoOrcos;
import java.util.Scanner;

/**
 *
 * @author josue
 */
public class FuncionesPrincipales {

    //Métodos y funciones para el menú principal...
    public static void instrucciones() {
        System.out.println("Las instrucciones para jugar son las siguientes:");
        //ACÁ me falta agregar cosas como, el tipo de raza que habrá y sus ventajas y contras.
        System.out.println("***Escriba su nombre en la pantalla por teclado\n***Se le presentarán las razas de las cuales debe escoger una  la una de las razas que se presentan\n***El jugador 2 deberá repetir ahora el mismo procedimeinto");
    }

    public static void ingresoUsuarios() {
        String nombre, nombreEdif;
        int a = 1, opcionRaza, opcionMenuRaza, Jug1 = 0, Jug2 = 0;
        Scanner SR = new Scanner(System.in);
        AbstractFactoryGH v2;

        Edificaciones s = new EdifSeda();

        while (a != 3) {
            //Ingreso de datos de usuario
            System.out.println("Nombre de usuario");
            nombre = SR.nextLine();

            //Ahora pido el tipo de raza con la que desea jugar
            System.out.println("A continuación, escoja la raza que desea...\n de momento solo puede escoger la raza humanos guerreros");
            System.out.println("1. Raza Orcos\n2. Raza Guerreros Humanos\n3. Esqueletos");
            opcionRaza = SR.nextInt();

            if (opcionRaza == 1) {
                muestraDatosUsuario(nombre, "Raza Orcos");
                //System.out.println("Esto mandará a llamar la factory de esta raza y blabla");
                CentroMandoOrcos InicioOrcos = new CentroMandoOrcos();
                SR.nextLine(); //Soluciona el problema de limpiar el buffer
                //Dispongo tando de \n (salto de línea) como de la creación de tabs \t ...
                System.out.println("Sus recursos iniciales son los siguientes:\n" + "Arcilla: " + InicioOrcos.getArcilla() + "\tArena: " + InicioOrcos.getArena() + "\tPedernales: " + InicioOrcos.getPedernales());

                if (a == 1) {
                    //Jug1 = 3; de momento no voy a ocupar esto, pero sí mandaré según turno a llamar la función del turno que recibirá como parámetro la instanciación de razas...
                    //**** de esta manera:
                    InstanciacionEdificacionesSegunRazaJ1(opcionRaza);
                } else {
                    //Jug2 = 4;
                    //InstanciacionEdificacionesSegunRazaJ2();
                    
                }
                //Ejecuto la función del contador de a para pedir un último usuario...
                a += 1;

            } else if (opcionRaza == 2) {
                muestraDatosUsuario(nombre, "Raza Guerreros Humanos");
                //System.out.println("Esto mandará a llamar la factory de esta raza para proporcionar las opciones que desea ejecutar");
                CentroMandoGH InicioGH = new CentroMandoGH();
                SR.nextLine(); //Soluciona el problema de limpiar el buffer
                //Dispongo tando de \n (salto de línea) como de la creación de tabs \t ...
                System.out.println("Sus recursos iniciales son los siguientes:\n" + "Fibra_Seda: " + InicioGH.getFibra_Seda() + "\tPlata: " + InicioGH.getPlata() + "\tRoble: " + InicioGH.getRoble());

                if (a == 1) {
                    Jug1 = 3;
                } else {
                    Jug2 = 4;
                }
                //Ejecuto la función del contador de a para pedir un último usuario...
                a += 1;

            } else if (opcionRaza == 3) {
                muestraDatosUsuario(nombre, "Raza Esqueletos");
                //System.out.println("Esto mandará a llamar la factory de esta raza y blabla x 3");
                CentroMandoEs InicioEs = new CentroMandoEs();
                SR.nextLine(); //Soluciona el problema de limpiar el buffer
                //Dispongo tando de \n (salto de línea) como de la creación de tabs \t ...
                System.out.println("Sus recursos iniciales son los siguientes:\n" + "Mármol: " + InicioEs.getMarmol() + "\tOro: " + InicioEs.getOro() + "\tRoble: " + InicioEs.getLava());
                
                //Líneas para los turnos...
                if (a == 1) {
                    Jug1 = 3;
                } else {
                    Jug2 = 4;
                }
                //Ejecuto la función del contador de a para pedir un último usuario...
                a += 1;
            }

        }
        //System.out.println(Jug1 + Jug2);
        //después de pedir datos personales [ESTÁNDO FUERA EL BUCKLE WHILE...
        //Debería mandar a llamar una nueva funcion a partir de los datos escogidos como la opción de raza y nombres;
    }

    public static String muestraDatosUsuario(String nombre, String i) {
        //puedo crear esto para que en un recuadro hecho a mano muestre al jugador lo que posee y eso,,,
        System.out.println("Los datos del jugador son los siguientes: ");
        System.out.println("Nombre usuario: " + nombre + " y su raza escogida es: " + i);
        //System.out.println("De la cual posee los siguentes recursos: ");
        //Acá debería imprimir un array inicializado con los recursos acutales, y luego un arraylist con las edificaciones y cosas demás que posee, que debería ser 0... 

        
        //Que retorne la raza y se ejecuten tres de estos, separados aquí dentro por un if else if...
        return i;
    }

    public static void InstanciacionEdificacionesSegunRazaJ1(int i) {

    }

    public static void InstanciacionEdificacionesSegunRazaJ2() {
        int opcionSubMenuTurnos, opcionEdif, opcionAtaque;
        Scanner TJ = new Scanner(System.in);
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
                                System.out.println("Instancio y creo el objeto 1 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
                                break;
                            case 2:
                                System.out.println("Instancio y creo el objeto 2 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
                                break;
                            case 3:
                                System.out.println("Instancio y creo el objeto 3 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
                                break;
                            case 4:
                                System.out.println("Instancio y creo el objeto 4 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
                                break;
                            case 5:
                                System.out.println("Instancio y creo el objeto 5 según raza, lo agrego al arreglo..."); //Con o sin break, regreso al menú principal...
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
                        System.out.println("Por favor, seleccione con qué desea atacar: ");
                        System.out.println("1. Milia + talRaza\n2. Super Soldado + segunRaza\n3. Vehículo Terrestre + segúnRaza\n4. Vehículo Aéreo + según raza");
                        opcionAtaque = TJ.nextInt();
                        switch(opcionAtaque){
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

                        /* *** ESTO LO OBVIO AHORITA
                        vEnemigos = FactoryProducerGH.getFactoryGH("Soldados");
                        v2 = FactoryProducerGH.getFactoryGH("Soldados");
                        v2.getSoldado("Milicia").Danio(vEnemigos.getSoldado("Milicia").Atacar()); //ACÁ LE MANDO EL DAÑO AL ENEMIGO...
                         */
                  //      MGH.Danio(MO.Atacar());
                  //      System.out.println(MGH.getSalud());
                        break;
                    case 3:
                        System.out.println("Se sale del buckle y que me tire al segund sub while");
                        break;
                    default:
                        System.out.println("Escoja opción válida");
                        break;
                }

    }
    
    public static int fase=0;
    
    public static void Fase(){
        
        System.out.println("Está en la fase " + fase);
        fase += 1;
    }
    
}

//ESTAS OPCIONES SE DEBERÍAN EJECTUAR EN UNA FUNCIÓN APARTE.
/**
 * ************
 * System.out.println("Seleccione qué desea hacer:");
 * System.out.println("1.Crear 'Edificaciones'"); //Interno a esto, edifcación
 * de qué tipo? //VALIDAR QUE NI LA OPCIÓN DOS, NI LA TRES SE PUEDAN EJECUTAR
 * SIN ANTES TENER UNA EDIFICACIÓN PARA ALMACENAR ESOS OBJETOS...
 * System.out.println("2.Crear 'Vehiculos'"); //Interno a esto, de qué tipo
 * System.out.println("3.Crear 'Soldados'"); //Interno a esto, de qué tipo
 * opcionMenuRaza = SR.nextInt(); if(opcionMenuRaza == 1){
 * System.out.println("Ud ha seleccionado Edificaciones: ");
 *
 * v2 = FactoryProducerGH.getFactoryGH("Edificaciones")
 * ;//.getEdificacion(nombreEdif); System.out.println("Indique el nombre de la
 * edificación que desea crear: \n***brindo las opciones etc"); SR.nextLine();
 * nombreEdif = SR.nextLine(); //Para el caso debo meter "Edif recurso 3"
 * v2.getEdificacion(nombreEdif).GenerarRecurso(); //TENGO ESTE CONFLICTO PARA
 * GENERAR LAS COSAS... PREGUNTAR MAÑANA A OBDULIO //ed1.GenerarRecurso();
 * //***************** LA OTRA OPCIÓN ES QUE CUANDO EL USAARIO ESCOJA EL NOMBRE
 * DE LA EDF A CREAR, LE MANDO QUEMADO EL DATO DEL NOMBRE Y POR SUPUESTO EL
 * LLAMDO A FUNCION GENERARERCURSO... //ed1.GenerarRecurso();
 */
