/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaEsqueletos;

import fabricaAbstracta.AbstractFactory;
import fabricaOrcos.Orcos;

/**
 *
 * @author josue
 */
public class FactoryEsqueletos extends AbstractFactory{

    @Override
    public Orcos getOrco(String tipo) {
        return null;
    }

    @Override
    public OpcionesParaJugadorDeEsqueletos getOpcionMenuRazaEsqueleto(String tipo) {
        switch(tipo){
            case "Edificacion recurso 1":
                return new EdificacionRecursoU();
            case "Milicia Esqueletos":
                return new Esqueletos();
        }
        return null;
    }
    
    
}
