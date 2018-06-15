/*
 * Suponiendo ahorita que en ninguna debo recolectar nada, sino que automáticamente mande mensaje a la clase Centro de Mando GH
 * para setter el valor...
 */
package EdifGHFactory;

import MenuPrincipal.FuncionesPrincipales;
import fabricaAbstractaGH.CentroMandoGH;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class EdifSeda implements Edificaciones {

    CentroMandoGH gh = new CentroMandoGH();
    private int Temporal, vidaEd = 10, faseInicial;
    //Métodos getter y setter para la vidaEd:

    public EdifSeda() {
        faseInicial = FuncionesPrincipales.fase;
    }

    public int getVidaEd() {
        return vidaEd;
    }

    public void setVidaEd(int vidaEd) {
        this.vidaEd = vidaEd;
    }

    @Override
    public void GenerarRecurso() {
        
        if (FuncionesPrincipales.fase > (faseInicial + 2)) {
            System.out.println("Cantidad de seda actual " + gh.getFibra_Seda());
            Temporal = gh.getFibra_Seda();
            //después de ciertas fases      ESTO SE ARREGLA CON UN WHILE O FOR, O INCLUSIVE IF...
            Temporal += (Temporal * 0.2);
            gh.setFibra_Seda(Temporal);
            System.out.println("después de X fases ahora posee: " + gh.getFibra_Seda());
        }
        else{
            System.out.println("La edificación Seda ha sido creada, y podrá usarse hasta la fase " + (faseInicial+3));   
        }
    }

    @Override
    public void almacenarCosas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Esta será la edificación que automáticamente genera el recurso y lo manda al mando de control, que por cierto esa será una clase que heredarán las razas...

}
