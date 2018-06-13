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
                System.out.println("Sus recursos iniciales son los siguientes:\n" + "Fibra_Seda: " + InicioOrcos + "\tPlata: " + InicioOrcos + "\tRoble: " + InicioOrcos);

                if (a == 1) {
                    Jug1 = 3;
                } else {
                    Jug2 = 4;
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

                /*CentroMandoGH g = new CentroMandoGH();
                if(g.getPlata() >= 2500 && g.getRoble() >= 1000){
                    //int actual = g.getplata; coste = actual - 2500; g.setRecursoN(coste); 
                    g.getEdificacionesGueHuman().add(s);
                    System.out.println(g.getEdificacionesGueHuman().size());
                    g.setPlata(0);
                    g.setRoble(0);
                }
                else{
                    System.out.println("Ya no se puede canjear...");
                }*/
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
                System.out.println("Sus recursos iniciales son los siguientes:\n" + "Fibra_Seda: " + InicioEs + "\tPlata: " + InicioEs + "\tRoble: " + InicioEs);
                SR.nextLine(); //Soluciona el problema de limpiar el buffer

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

    public static void muestraDatosUsuario(String nombre, String i) {
        //puedo crear esto para que en un recuadro hecho a mano muestre al jugador lo que posee y eso,,,
        System.out.println("Los datos del jugador son los siguientes: ");
        System.out.println("Nombre usuario: " + nombre + " y su raza escogida es: " + i);
        //System.out.println("De la cual posee los siguentes recursos: ");
        //Acá debería imprimir un array inicializado con los recursos acutales, y luego un arraylist con las edificaciones y cosas demás que posee, que debería ser 0... 

    }

    public static void InstanciacionEdificacionesSegunRazaJ1(String i) {
        switch (i) {

        }

    }

    public static void InstanciacionEdificacionesSegunRazaJ2() {

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
