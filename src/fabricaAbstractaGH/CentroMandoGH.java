/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAbstractaGH;

import EdifGHFactory.EdifSeda;
import EdifGHFactory.Edificaciones;
import java.util.ArrayList;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class CentroMandoGH {

    // recursos:
    private int Fibra_Seda, Plata, Roble;
    private ArrayList<Edificaciones> EdificacionesGueHuman = new ArrayList<Edificaciones>(); //ACÁ ES DONDE PODRÍAN IR LAS DEL PATRÓN BUILDER...

    public CentroMandoGH() {
        Fibra_Seda = 750;
        Plata = 2500; 
        Roble = 1000;
    }
    
    //Métodos getter y setter del centro de mando para los recursos

    public int getFibra_Seda() {
        return Fibra_Seda;
    }

    public int getPlata() {
        return Plata;
    }

    public int getRoble() {
        return Roble;
    }

    public ArrayList<Edificaciones> getEdificacionesGueHuman() {
        return EdificacionesGueHuman;
    }

    public void setFibra_Seda(int Fibra_Seda) {
        this.Fibra_Seda = Fibra_Seda;
    }

    public void setPlata(int Plata) {
        this.Plata = Plata;
    }

    public void setRoble(int Roble) {
        this.Roble = Roble;
    }

    public void setEdificacionesGueHuman(ArrayList<Edificaciones> EdificacionesGueHuman) {
        this.EdificacionesGueHuman = EdificacionesGueHuman;
    }

    //Arreglos para edif de todo tipo más los recursos que se poseen y se van gastando o acumulando acá.
//A menos que la condición donde los arreglos de Edificaciones que se creen sea diferente de cero, los recursos aumentarán, caso contrario disminuirá hasta que se agoten y no puede hacer más
    //Creando el arreglo para almacenar cosas de tipo edificacionesGH:
    //EdificacionesGueHuman.add(s);
}
