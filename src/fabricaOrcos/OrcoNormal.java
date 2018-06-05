/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaOrcos;
import java.util.Scanner;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class OrcoNormal implements Orcos{
    
    Scanner opcion = new Scanner(System.in);
    /*  @Override
    public void atacar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Este orco atacará a la opción que se le mande...");
    }
    VOY A COMENTAR ESTO PARA MIENTRAS IMPLEMENTO EL MENÚ*/
    
    
    @Override
    public void menuJuego() {
        int a = -1;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        do{
            System.out.println("Seleccione una opción sobre qué desea hacer con su raza:");
            System.out.println("\n1.Atacar");
            System.out.println("\n2.Defender");
            System.out.println("\n3.Pasar turno [SALIR]");
            a = opcion.nextInt();
            opcion.nextLine();
          }while(a!=3);
    }
     
}
