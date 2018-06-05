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
public class SuperTroll implements Orcos{

    Scanner opcion1 = new Scanner(System.in);
    /*@Override
    public void atacar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("El ataque de este men será más potente...");
    }   el mismo caso que el orco normal...*/
    @Override
    public void menuJuego(){
        int a = opcion1.nextInt();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        do{
            System.out.println("Seleccione una opción sobre qué desea hacer con su raza:");
            System.out.println("\n1.Atacar");
            System.out.println("\n2.Defender");
            System.out.println("\n3.Pasar turno [SALIR]");
            
          }while(a!=3);
        
    }
    
}
