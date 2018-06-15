/*
 * Esta es la clase que me permite generar el objeto según el tipo de edificación que deseo...
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
        switch (tipo) {
            case "Edif recurso Fibra-Seda":
                return new EdifSeda(); //Debo colocar una opción de recolectar recuros...
            case "Edif recurso Plata":
                return new EdifPlata(); //Debo colocar una opción de recolectar recuros...
            case "Edif recurso Roble":
                return new EdifRoble(); //generará el recurso automáticamente...
            case "Edif entrenamiento Super Soldado y Milicia": //**** luego deberé amarrar que si creo unos soldados no pueden existir sin esta edif...
                return new EdifEntrenamientoMyEGH();
            case "Edif entrenamiento Águilas Gigantes": //Vehiculo aéreo
                return new EdifEntrenamientoAguilas();
            case "Edif entrenamiento Jabalíes Enormes": //Vehiculo terrestre
                return new EdifEntrenamientoJabalis();
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
