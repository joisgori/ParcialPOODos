/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdifGHFactory;

import MenuPrincipal.FuncionesPrincipales;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class EdifEntrenamientoMyEGH implements Edificaciones {

    private int vida = 15, faseInicial;

    public EdifEntrenamientoMyEGH() {
        faseInicial = FuncionesPrincipales.fase;
    }
    
    

    //Métodos getter y setter de vida
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    //Métodos abstractos

    @Override
    public void almacenarCosas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void GenerarRecurso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
