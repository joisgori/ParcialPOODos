/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAbstracta;

import fabricaOrcos.FactoryOrcos;
import fabricaEsqueletos.FactoryEsqueletos;

/**
 *
 * @author josue
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String tipo){
        switch(tipo){
            case "Raza Orco":    
                return new FactoryOrcos(); //retorno el objeto de la fábrica de orcos que permitirá luego escoger entre la milica de orcos o el super soldado.
                
                //Agregaré mi case de esqueletos...
            case "Raza Esqueletos":
                return new FactoryEsqueletos();
        }
        return null;
    }
    
}
