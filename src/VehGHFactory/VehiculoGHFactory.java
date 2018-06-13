/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehGHFactory;

import EdifGHFactory.Edificaciones;
import SoldaGHFactory.Soldados;
import fabricaAbstractaGH.AbstractFactoryGH;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class VehiculoGHFactory extends AbstractFactoryGH {

    @Override
    public Edificaciones getEdificacion(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vehiculos getVehiculo(String tipo) {
         switch(tipo){
            case "Terrestres":
                return new JabaliesGigantes() ;
            case "Aéreos": //De este solo podrá haber uno en batalla **DEBERÉ HACER TAL VALIDACIÓN
                return new AguilasGigantes();
        }
        return null;
    }

    @Override
    public Soldados getSoldado(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
