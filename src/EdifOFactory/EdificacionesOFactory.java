/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdifOFactory;

import SoldaOFactory.SoldadosO;
import VehOFactory.VehiculosO;
import fabricaAbstractaOrcos.AbstractFactoryOrcos;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class EdificacionesOFactory extends AbstractFactoryOrcos {

    @Override
    public EdificacionesO getEdificacion(String tipo) {
        switch (tipo) {
            case "Edif recurso Arcilla":
                return new EdifArcilla();
            case "Edif recurso Arena":
                return new EdifArena();
            case "Edif recurso Pedernales":
                return new EdifPedernales(); //generará el recurso automáticamente...
            case "Edif entrenamiento Supero Soldado y Milica": //**** luego deberé amarrar que si creo unos soldados no pueden existir sin esta edif...
                return new EdifEntrenamientoMySOrcos();
            case "Edif entrenamiento Dragones":
                return new EdifEntrenamientoDragones();
            case "Edif entrenamiento Lobos gigantes":
                return new EdifEntrenamientoLobosG();
        }
        return null;
    }

    @Override
    public SoldadosO getSoldado(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VehiculosO getVehiculo(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
