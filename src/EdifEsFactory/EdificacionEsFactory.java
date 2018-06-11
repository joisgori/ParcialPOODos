/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdifEsFactory;

import SoldaEsFactory.SoldadosEs;
import VehEsFactory.VehiculosEs;
import fabricaAbstractaEs.AbstractFactoryEs;

/**
 *
 * @author josue
 */
public class EdificacionEsFactory extends AbstractFactoryEs {

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
