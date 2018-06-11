/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoldaOFactory;

import java.util.Random;

/**
 *
 * @author josue
 */
public class MiliciaO implements SoldadosO {
    private Random cualquiera = new Random(System.nanoTime());

    @Override
    public int Atacar() {//DEBO TENER EN CUENTA QUE SOLO SE PUEDE HACER UN ATAQUE POR TURNO, ENTONCES INMEDIATAMENTE ESTO ME RETORNE UN NÚMERO (SEA EL QUE SEA) QUE PASE AL SIGUIENTE TURNO...
        //Haré con numeros aleatorios para que ataque o falle el ataque.
        int aleatorio = cualquiera.nextInt(3);
        //Va a hacer 15 de daño y será multiplicado por 0, 1, 2, pues así o falla, o golepea o golpea y baja el doble
        return 15 * aleatorio;
    }

    @Override
    public void Danio(int danioOponente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
