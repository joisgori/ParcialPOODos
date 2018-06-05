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
    public Orcos getOrco(String tipo) { //Se me ocurre que acá no debería ser un getOrco, sino opcionRazaOrco
        switch(tipo){ //así al mandar esa opción acá en el switch el usuario escoge qué desea hacer
            case "orcoNormal": //Caso edificación
                return new OrcoNormal(); //y con el patrón builder mandar el tipo de edificación con una clase director (aún no sé como funciona...)
            case "superTroll": //O hacer varios casos acá separando los edificos
                return new SuperTroll();
            //case "Guerreros":
                //return new TipoDeOrco     y que acá imprima si es una milicia normal o es un supersoldado, dentro de esa clase deberá existir la vida de los mismos y el daño que
                //harán...
        }
        return null;
    }
    
}
