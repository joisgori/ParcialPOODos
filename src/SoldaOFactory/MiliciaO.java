/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoldaOFactory;

import java.util.Random;

/**
 *
 * @author Josué González <0003471@uca.edu.sv>
 */
public class MiliciaO implements SoldadosO {
    private int Salud = 75; //creo que no debería ser abstract y se deberá implementar así, a dif de atacar...
    private String nombre;
    private Random cualquiera = new Random(System.nanoTime());
    
    //Métodos setters y getters;

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return Salud;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalud(int Salud) {
        this.Salud = Salud;
    }
    

    @Override
    public int Atacar() {//DEBO TENER EN CUENTA QUE SOLO SE PUEDE HACER UN ATAQUE POR TURNO, ENTONCES INMEDIATAMENTE ESTO ME RETORNE UN NÚMERO (SEA EL QUE SEA) QUE PASE AL SIGUIENTE TURNO...
        //Haré con numeros aleatorios para que ataque o falle el ataque.
        int aleatorio = cualquiera.nextInt(3);
        //Va a hacer 15 de daño y será multiplicado por 0, 1, 2, pues así o falla, o golepea o golpea y baja el doble
        return 15 * aleatorio;
    }

    @Override
    public void Danio(int danioOponente) {
        //Es decir que el valor que reciba se lo restará a la componente de salud...
        this.Salud -= danioOponente;
    }
    
}
