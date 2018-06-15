/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdifOFactory;

import MenuPrincipal.FuncionesPrincipales;
import fabricaAbstractaOrcos.CentroMandoOrcos;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class EdifArena implements EdificacionesO {

    CentroMandoOrcos orcos = new CentroMandoOrcos();
    private int Temporal, vidaEd = 10, faseInicial;

    public EdifArena() {
        faseInicial = FuncionesPrincipales.fase;
    }

    @Override
    public void almacenarCosas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void GenerarRecurso() {
        if (FuncionesPrincipales.fase > (faseInicial + 2)) {
            System.out.println("Cantidad de arcilla actual " + orcos.getArcilla());
            Temporal = orcos.getArcilla();
            //después de ciertas fases      ESTO SE ARREGLA CON UN WHILE O FOR, O INCLUSIVE IF...
            Temporal += (Temporal * 0.2);
            orcos.setArcilla(Temporal);
            System.out.println("después de X fases ahora posee: " + orcos.getArcilla());
        } else {
            System.out.println("La edificación Arcilla ha sido creada, y podrá usarse hasta la fase " + (faseInicial + 3));
        }
    }

}
