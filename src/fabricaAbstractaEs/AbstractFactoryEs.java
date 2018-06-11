/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAbstractaEs;

import EdifEsFactory.EdificacionesEs;
import SoldaEsFactory.SoldadosEs;
import VehEsFactory.VehiculosEs;

/**
 *
 * @author josue
 */
public abstract class AbstractFactoryEs {
    //Esto me va a permitir escoger el tipo de edificación que el usario desea...

    public abstract EdificacionesEs getEdificacionEs(String tipo);

    public abstract VehiculosEs getVehiculoEs(String tipo);

    public abstract SoldadosEs getSoldadoEs(String tipo);

}
