/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAbstractaOrcos;

import EdifOFactory.EdificacionesO;
import SoldaOFactory.SoldadosO;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public abstract class AbstractFactoryOrcos {
    //Esto me va a permitir escoger el tipo de edificación que el usario desea...
    public abstract EdificacionesO getEdificacion(String tipo); 
    
    //public abstract VehiculosO getVehiculo(String tipo);
    
    public abstract SoldadosO getSoldado(String tipo);
    
}
