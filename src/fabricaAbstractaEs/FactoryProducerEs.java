/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAbstractaEs;

import EdifEsFactory.EdificacionEsFactory;
import SoldaEsFactory.SoldadosEsFactory;
import VehEsFactory.VehiculoEsFactory;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class FactoryProducerEs {

    public static AbstractFactoryEs getFactoryEs(String tipo) {
        switch (tipo) {
            case "Edificaciones":
                return new EdificacionEsFactory(); //retornará el valor seleccionado de la edificación pedida...
            case "Vehiculos":
                return new VehiculoEsFactory();
            case "Soldados":
                return new SoldadosEsFactory(); //retornará una nueva opcion de qué tipo de soldado utilizar.

        }
        return null;

    }

}
