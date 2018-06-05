/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAbstracta;

import fabricaEsqueletos.Esqueletos;
import fabricaOrcos.Orcos;
import fabricaEsqueletos.OpcionesParaJugadorDeEsqueletos;

/**
 *
 * @author josue
 */
public abstract class AbstractFactory {
    //Creo una de las fábricas, para el caso la que me genera orcos, así debo hacer con las de GuerrerosHumanos y Esqueletos.
    public abstract Orcos getOrco(String tipo);
    //  ACÁ DEBERÍAA MANDAR LA OPCIÓN QUE ESCOGIÓ EL JUGADOR n, PARA CON LA QUE JUGARÁ
    //Segunda opción de juego, fábrica de Humanos
    //public abstract GuerrerosHumanos getGueHuman(String tipo);
    
    //AHORA SE VIENE LO CHIDO
    public abstract OpcionesParaJugadorDeEsqueletos getOpcionMenuRazaEsqueleto(String tipo); //Acá mando lo que desea crear...    
    
}
