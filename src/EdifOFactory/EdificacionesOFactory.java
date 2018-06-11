/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdifOFactory;

import SoldaOFactory.SoldadosO;
import fabricaAbstractaOrcos.AbstractFactoryOrcos;

/**
 *
 * @author josue
 */
public class EdificacionesOFactory extends AbstractFactoryOrcos {

    @Override
    public EdificacionesO getEdificacion(String tipo) {
        switch (tipo) {
            case "Edif recurso 1":
                return null;
            case "Edif recurso 2":
                return null;
            case "Edif recurso 3":
                System.out.println("hskfjsdf");
                return null; //generará el recurso automáticamente...
            case "Edif entrenamiento soldados": //**** luego deberé amarrar que si creo unos soldados no pueden existir sin esta edif...
                return null;
            case "Edif construcción vehículos aereos":
                return null;
            case "Edif construcción vehículos terrestres":
                return null;
        }
        return null;
    }

    @Override
    public SoldadosO getSoldado(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
