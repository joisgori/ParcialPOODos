/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuPrincipal;
import EdifGHFactory.Edificaciones;
import fabricaAbstractaGH.AbstractFactoryGH;
import fabricaAbstractaGH.FactoryProducerGH;
import java.util.Scanner;

/**
 *
 * @author josue
 */
public class FuncionesPrincipales {
    
    
    //Métodos y funciones para el menú principal...
    public static void instrucciones(){
        System.out.println("Las instrucciones para jugar son las siguientes:");
        //ACÁ me falta agregar cosas como, el tipo de raza que habrá y sus ventajas y contras.
        System.out.println("***Ingrese su nombre en teclado\n***Seleccione la una de las razas que se presentan\n***El jugador 2 deberá repetir ahora el mismo procedimeinto");
    }
    
    public static void ingresoUsuarios(){
        String nombre, nombreEdif;
        int opcionRaza, opcionMenuRaza;
        Scanner SR = new Scanner(System.in);
        AbstractFactoryGH v2;
        
        nombre = SR.nextLine();
        System.out.println("A continuación, escoja la raza que desea...\n de momento solo puede esoger la raza humanos guerreros");
        System.out.println("1. Raza Orcos\n2. Raza Guerreros Humanos\n3. Esqueletos");
        opcionRaza = SR.nextInt();
        if (opcionRaza == 1){
            System.out.println("Esto aún no hace nada.");
        } else if (opcionRaza == 2){
            System.out.println("Esto mandará a llamar la factory de esta raza para proporcionar las opciones que desea ejecutar");
            System.out.println("Seleccione qué desea hacer:");
            System.out.println("1.Crear 'Edificaciones'"); //Interno a esto, edifcación de qué tipo?
            //VALIDAR QUE NI LA OPCIÓN DOS, NI LA TRES SE PUEDAN EJECUTAR SIN ANTES TENER UNA EDIFICACIÓN PARA ALMACENAR ESOS OBJETOS...
            System.out.println("2.Crear 'Vehiculos'"); //Interno a esto, de qué tipo
            System.out.println("3.Crear 'Soldados'"); //Interno a esto, de qué tipo
            opcionMenuRaza = SR.nextInt();
            if(opcionMenuRaza == 1){
                System.out.println("Ud ha seleccionado Edificaciones: ");
                
                v2 = FactoryProducerGH.getFactoryGH("Edificaciones") ;//.getEdificacion(nombreEdif);
                System.out.println("Indique el nombre de la edificación que desea crear:  \n***brindo las opciones etc");
                SR.nextLine();
                nombreEdif = SR.nextLine(); //Para el caso debo meter "Edif recurso 3"
                Edificaciones ed1 = v2.getEdificacion(nombreEdif);
                //TENGO ESTE CONFLICTO PARA GENERAR LAS COSAS... PREGUNTAR MAÑANA A OBDULIO
                //ed1.GenerarRecurso();
                
            }
        } else if (opcionRaza == 3) {
            System.out.println("De momento tampoco hace nada .L.");
        }
        
        //después de pedir datos personales
        
    }
    
    public static void muestraRecursosRazaEscogida(){
        //puedo crear esto para que en un recuadro hecho a mano muestre al jugador lo que posee y eso,,,
    }
    
}
