/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaOrcos;

import fabricaAbstracta.AbstractFactory;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class FactoryOrcos extends AbstractFactory{

    @Override
    public Orcos getOrco(String tipo) {
        switch(tipo){
            case "orcoNormal":
                return new OrcoNormal();
            case "superTroll":
                return new SuperTroll();
        }
        return null;
    }
    
}
