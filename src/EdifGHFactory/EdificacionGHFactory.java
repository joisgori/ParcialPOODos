/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdifGHFactory;
import SoldaGHFactory.Soldados;
import VehGHFactory.Vehiculos;
import fabricaAbstractaGH.AbstractFactoryGH;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class EdificacionGHFactory extends AbstractFactoryGH {   

    @Override
    public Edificaciones getEdificacion(String tipo) {
        switch(tipo){
            case "Edif recurso 1":
                return null;
            case "Edif recurso 2":
                return null;
            case "Edif recurso 3":
                return new EdifSeda(); //generará el recurso automáticamente...
            case "Edif entrenamiento soldados":
                return null;
            case "Edif construcción vehículos aereos":
                return null;
            case "Edif construcción vehículos terrestres":
                return null;
        }
        return null;
    }

    @Override
    public Vehiculos getVehiculo(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Soldados getSoldado(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
