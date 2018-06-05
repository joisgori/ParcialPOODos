/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAbstracta;

import fabricaOrcos.Orcos;

/**
 *
 * @author josue
 */
public abstract class AbstractFactory {
    //Creo una de las fábricas, para el caso la que me genera orcos, así debo hacer con las de GuerrerosHumanos y Esqueletos.
    public abstract Orcos getOrco(String tipo);
    //Segunda opción de juego, fábrica de Humanos
    //public abstract GuerrerosHumanos getGueHuman(String tipo);
    
    
}
