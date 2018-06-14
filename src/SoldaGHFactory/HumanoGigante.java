/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoldaGHFactory;

import java.util.Random;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class HumanoGigante implements Soldados {
    private int Salud = 150; //creo que no debería ser abstract y se deberá implementar así, a dif de atacar...
    private String nombre;
    private Random cualquiera = new Random(System.nanoTime());
    
    //Getter y Setter de nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return Salud;
    }

    public void setSalud(int Salud) {
        this.Salud = Salud;
    }
    
    //****Aunque no estoy seguro si esos deberían ser abstracts también, luego veo...

    @Override
    public int Atacar() { //DEBO TENER EN CUENTA QUE SOLO SE PUEDE HACER UN ATAQUE POR TURNO, ENTONCES INMEDIATAMENTE ESTO ME RETORNE UN NÚMERO (SEA EL QUE SEA) QUE PASE AL SIGUIENTE TURNO...
        //Haré con numeros aleatorios para que ataque o falle el ataque.
        int aleatorio = cualquiera.nextInt(3);
        //Va a hacer 15 de daño y será multiplicado por 0, 1, 2, pues así o falla, o golepea o golpea y baja el doble
        return 35 * aleatorio;
    }

    @Override
    public void Danio(int danioOponente) {
        //Es decir que el valor que reciba se lo restará a la componente de salud...
        this.Salud -= danioOponente;
    }

    @Override
    public int Salud(int danioOponentes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
