/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdifOFactory;

import fabricaAbstractaOrcos.CentroMandoOrcos;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class EdifEntrenamientoMySOrcos implements EdificacionesO {

    CentroMandoOrcos orcos = new CentroMandoOrcos();
    private int Temporal, vidaEd = 10, faseInicial;

    public EdifEntrenamientoMySOrcos() {
    }

    @Override
    public void GenerarRecurso() {
        System.out.println("Aún no hay nada...");

    }

    @Override
    public void almacenarCosas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
