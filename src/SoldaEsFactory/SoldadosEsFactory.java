/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoldaEsFactory;

import EdifEsFactory.EdificacionesEs;
import VehEsFactory.VehiculosEs;
import fabricaAbstractaEs.AbstractFactoryEs;

/**
 *
 * @author Josué González <0003471@uca.edu.sv>
 */
public class SoldadosEsFactory extends AbstractFactoryEs {

    @Override
    public EdificacionesEs getEdificacionEs(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VehiculosEs getVehiculoEs(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SoldadosEs getSoldadoEs(String tipo) {
        switch(tipo){
            case "Milicia Esqueletos":
                return new MiliciaEs();
            case "Zombie Gigante":
                return new ZombieGrande();
        }
        return null;
    }
    
}
