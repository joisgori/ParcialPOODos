/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdifOFactory;

/**
 *\033[32m ---> genera texto de color en netbeans ...
 * @author Josué González <00034715@uca.edu.sv>
 */
public class EdifArcilla implements EdificacionesO {

    private int TotalRecurso = 2500, Temporal = 2500, vidaEd = 10;
    
    //Métodos getter y setter para trastocar la vida de las edificaciones:

    public int getVidaEd() {
        return vidaEd;
    }

    public void setVidaEd(int vidaEd) {
        this.vidaEd = vidaEd;
    }
    
    
    @Override
    public int GenerarRecurso() {
        System.out.println("Cantidad de seda actual " + TotalRecurso);
        //después de ciertas fases      ESTO SE ARREGLA CON UN WHILE O FOR, O INCLUSIVE IF...
        TotalRecurso += (Temporal * 0.2);
        System.out.println("después de X fases ahora posee: " + TotalRecurso);
        return TotalRecurso;
    }

    @Override
    public void almacenarCosas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
