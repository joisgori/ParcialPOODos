/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoldaGHFactory;

import EdifGHFactory.Edificaciones;
import VehGHFactory.Vehiculos;
import fabricaAbstractaGH.AbstractFactoryGH;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class SoldadoGHFactory extends AbstractFactoryGH {

    @Override
    public Edificaciones getEdificacion(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vehiculos getVehiculo(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Soldados getSoldado(String tipo) {
        switch(tipo){
            case "Milicia":
                return new Milicia();
            case "Humano Gigante": //De este solo podrá haber uno en batalla **DEBERÉ HACER TAL VALIDACIÓN
                return new HumanoGigante();
        }
        return null;
    }
    
    
}
