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
public class EdifSeda implements Edificaciones {

    int TotalRecurso = 2500, Temporal = 2500, vidaEd = 10;

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
    //Esta será la edificación que automáticamente genera el recurso y lo manda al mando de control, que por cierto esa será una clase que heredarán las razas...

}
