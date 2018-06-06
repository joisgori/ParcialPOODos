/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAbstractaGH;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class FactoryProducerGH {
    public static AbstractFactoryGH getFactoryGH(String tipo){
        switch(tipo)
        {
            case "Edificaciones":
                return null; //return new Edificacion();
            /*case "Vehiculos":
                return null;
            case "Soldados":
                return null;
            */
        }
        return null;
        
    }
    
}
