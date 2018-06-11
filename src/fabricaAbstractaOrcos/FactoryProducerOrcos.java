/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAbstractaOrcos;

import EdifOFactory.EdificacionesOFactory;
import SoldaOFactory.SoldadoOFactory;

/**
 *
 * @author josue
 */
public class FactoryProducerOrcos {
    public static AbstractFactoryOrcos getFactoryO(String tipo){
        switch(tipo)
        {
            case "Edificaciones":
                return new EdificacionesOFactory(); //retornará el valor seleccionado de la edificación pedida...
            case "Vehiculos":
                return null;
            case "Soldados":
                return new SoldadoOFactory(); //retornará una nueva opcion de qué tipo de soldado utilizar.
            
        }
        return null;
        
    }
}
