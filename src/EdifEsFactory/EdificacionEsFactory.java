/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdifEsFactory;

import SoldaEsFactory.SoldadosEs;
import VehEsFactory.VehiculosEs;
import fabricaAbstractaEs.AbstractFactoryEs;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class EdificacionEsFactory extends AbstractFactoryEs {

    @Override
    public EdificacionesEs getEdificacionEs(String tipo) {
        switch (tipo) {
            case "Edif recurso Fibra-Seda":
                return new EdifMarmol(); //Debo colocar una opción de recolectar recuros...
            case "Edif recurso Plata":
                return new EdifOro(); //Debo colocar una opción de recolectar recuros...
            case "Edif recurso Roble":
                System.out.println("..SE EJECUTA ESTO SIN PROBLEMAS");
                return new EdifLava(); //generará el recurso automáticamente...
            case "Edif entrenamiento Super Soldado y Milicia": //**** luego deberé amarrar que si creo unos soldados no pueden existir sin esta edif...
                return new EdifEntrenamientoMEs();
            case "Edif entrenamiento Dragones --- esqueletos": //Vehiculo aéreo
                return null;
            case "Edif entrenamiento algo": //Vehiculo terrestre
                return null;
        }
        return null;
    }

    @Override
    public VehiculosEs getVehiculoEs(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SoldadosEs getSoldadoEs(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
