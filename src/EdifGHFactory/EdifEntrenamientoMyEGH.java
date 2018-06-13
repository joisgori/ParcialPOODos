/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdifGHFactory;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class EdifEntrenamientoMyEGH implements Edificaciones {

    int vida = 15;

    //Métodos getter y setter de vida
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    //Métodos abstractos
    @Override
    public int GenerarRecurso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void almacenarCosas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
