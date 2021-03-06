/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAbstractaGH;

import EdifGHFactory.EdificacionGHFactory;
import SoldaGHFactory.SoldadoGHFactory;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class FactoryProducerGH {
    public static AbstractFactoryGH getFactoryGH(String tipo){
        switch(tipo)
        {
            case "Edificaciones":
                return new EdificacionGHFactory(); //retornará el valor seleccionado de la edificación pedida...
            case "Vehiculos":
                return null;
            case "Soldados":
                return new SoldadoGHFactory(); //retornará una nueva opcion de qué tipo de soldado utilizar.
            
        }
        return null;
        
    }
    
}
