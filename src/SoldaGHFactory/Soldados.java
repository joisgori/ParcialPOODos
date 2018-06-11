/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoldaGHFactory;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public interface Soldados {
    public int Salud(int danioOponentes);
    public int Atacar(); //Debe devolver un entero con el daño que se haga...
    public void Danio(int danioOponente);
    
}
