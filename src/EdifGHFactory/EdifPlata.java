/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdifGHFactory;

import MenuPrincipal.FuncionesPrincipales;
import fabricaAbstractaGH.CentroMandoGH;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class EdifPlata implements Edificaciones {
    CentroMandoGH gh = new CentroMandoGH();
    private int Temporal, vidaEd = 10, faseInicial;

    public EdifPlata() {
        faseInicial = FuncionesPrincipales.fase;
    }
    

    @Override
    public void almacenarCosas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void GenerarRecurso() {
        if (FuncionesPrincipales.fase > (faseInicial + 2)) {
            System.out.println("Cantidad de plata actual " + gh.getPlata());
            Temporal = gh.getPlata();
            //después de ciertas fases      ESTO SE ARREGLA CON UN WHILE O FOR, O INCLUSIVE IF...
            Temporal += (Temporal * 0.2);
            gh.setPlata(Temporal);
            System.out.println("después de X fases ahora posee: " + gh.getPlata());
        }
        else{
            System.out.println("La edificación Plata ha sido creada, y podrá usarse hasta la fase " + (faseInicial+3));   
        }
    }
    
}
