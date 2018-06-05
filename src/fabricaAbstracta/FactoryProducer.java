/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAbstracta;

import fabricaOrcos.FactoryOrcos;

/**
 *
 * @author josue
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String tipo){
        switch(tipo){
            case "RazaOrco":    
                return new FactoryOrcos(); //retorno el objeto de la fábrica de orcos que permitirá luego escoger entre la milica de orcos o el super soldado.
        }
        return null;
    }
    
}
