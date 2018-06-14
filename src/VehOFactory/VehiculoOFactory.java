/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehOFactory;

import EdifOFactory.EdificacionesO;
import SoldaOFactory.SoldadosO;
import fabricaAbstractaOrcos.AbstractFactoryOrcos;

/**
 *
 * @author Josué González <0003471@uca.edu.sv>
 */
public class VehiculoOFactory extends AbstractFactoryOrcos {

    @Override
    public EdificacionesO getEdificacion(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SoldadosO getSoldado(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VehiculosO getVehiculo(String tipo) {
        switch (tipo) {
            case "Dragones":
                return new DragonesO();
            case "Lobos Gigantes":
                return new LobosGigantesO();
        }
        return null;
    }

}
