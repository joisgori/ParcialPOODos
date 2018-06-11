/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoldaOFactory;

import EdifOFactory.EdificacionesO;
import fabricaAbstractaOrcos.AbstractFactoryOrcos;

/**
 *
 * @author josue
 */
public class SoldadoOFactory extends AbstractFactoryOrcos{

    @Override
    public EdificacionesO getEdificacion(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SoldadosO getSoldado(String tipo) {
        switch(tipo){
            case "Milicia Orcos":
                return new MiliciaO();
            case "Ogro": //De este solo podrá haber uno en batalla **DEBERÉ HACER TAL VALIDACIÓN
                return new Ogro();
        }
        return null;
    }
    
}
