/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAbstractaGH;

import EdifGHFactory.Edificaciones;
import VehGHFactory.Vehiculos;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public abstract class AbstractFactoryGH {
    //Esto me va a permitir escoger el tipo de edificación que el usario desea...
    public abstract Edificaciones getEdificacion(String tipo); 
    
    public abstract Vehiculos getVehiculo(String tipo);
    
    //public abstract Soldado getSoldado(String tipo);
}
