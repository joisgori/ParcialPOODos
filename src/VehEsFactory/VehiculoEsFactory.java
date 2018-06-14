/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehEsFactory;

import EdifEsFactory.EdificacionesEs;
import SoldaEsFactory.SoldadosEs;
import fabricaAbstractaEs.AbstractFactoryEs;

/**
 *
 * @author Josué González <0003471@uca.edu.sv>
 */
public class VehiculoEsFactory extends AbstractFactoryEs {

    @Override
    public EdificacionesEs getEdificacionEs(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VehiculosEs getVehiculoEs(String tipo) {
        switch(tipo){
            case "Dragones esqueletos":
                return new DragonesEsqueletos();
            case "Rinocerontes Esqueletos":
                return new RinocerontesEsqueletos();   
        }
        return null;
    }

    @Override
    public SoldadosEs getSoldadoEs(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
